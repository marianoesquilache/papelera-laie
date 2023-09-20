package clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import clases.Conexion;
import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class LeerExcel {

    //Declarando variables    
    int id;
    String codigoProducto;
    String categoria;
    String nombre;
    float precio1;
    float precio2;
    float precio3;
    float precio4;

    public void leerExcel() {
        try {
            //Conectando a la Base de Datos
            Connection cn = Conexion.conectar();

            JFileChooser filechooser = new JFileChooser();
            //Eligiendo el archivo excel a cargar
            int seleccion = filechooser.showOpenDialog(null);

            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File archivoSeleccionado = filechooser.getSelectedFile();

                FileInputStream file = new FileInputStream(archivoSeleccionado);
                HSSFWorkbook libro = new HSSFWorkbook(file);
                HSSFSheet hoja = libro.getSheetAt(0);

                //Iterando a traves de las filas del Excel
                Iterator<Row> filas = hoja.iterator();

                while (filas.hasNext()) {
                    Row fila = filas.next();
                    Iterator<Cell> celdas = fila.cellIterator();

                    //Leer valores de celdas
                    codigoProducto = celdas.next().getStringCellValue();
                    categoria = celdas.next().getStringCellValue();
                    nombre = celdas.next().getStringCellValue();
                    celdas.next();
                    celdas.next();
                    precio1 = (float) (celdas.next().getNumericCellValue());

                    //Generando el SQL query
                    PreparedStatement pstConsulta = cn.prepareStatement("SELECT id from productos where cod_producto =?");
                    pstConsulta.setString(1, codigoProducto);
                    ResultSet rs = pstConsulta.executeQuery();

                    //En caso de que el codigo ya esté en la BD solamente se actualizara el producto existente
                    if (rs.next()) {
                        PreparedStatement pstActualizar = cn.prepareStatement("update productos set cod_producto = ?, categoria = ?, nombre = ?, precio1 = ?, precio2 = ?, precio3 = ?, precio4=? where cod_producto = ? ");
                        pstActualizar.setString(1, codigoProducto);
                        pstActualizar.setString(2, categoria);
                        pstActualizar.setString(3, nombre);
                        pstActualizar.setFloat(4, precio1);
                        pstActualizar.setFloat(5, precio2);
                        pstActualizar.setFloat(6, precio3);
                        pstActualizar.setFloat(7, precio4);
                        pstActualizar.setString(8, codigoProducto);
                        pstActualizar.executeUpdate();
                        pstActualizar.close();

                        //En caso de que no esté se insertará un nuevo producto
                    } else {
                        PreparedStatement pstInsertar = cn.prepareStatement("INSERT into productos (cod_producto, categoria, nombre, precio1) values (?,?,?,?)");
                        pstInsertar.setString(1, codigoProducto);
                        pstInsertar.setString(2, categoria);
                        pstInsertar.setString(3, nombre);
                        pstInsertar.setFloat(4, precio1);
                        pstInsertar.executeUpdate();
                        pstInsertar.close();

                    }
                    pstConsulta.close();

                }
                //Cerrando el archivo y hoja y conexión
                file.close();
                libro.close();
                cn.close();
                JOptionPane.showMessageDialog(null, "Excel integrado a la BD con exito!");

            }

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo, compruebe que el mismo sea un excel.");
        }

    }

}
