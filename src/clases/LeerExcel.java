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
import java.sql.*;
import javax.swing.JOptionPane;

public class LeerExcel {
    //Declarando variables    
    int id ;
    String codProducto;
    String categoria;
    String nombre;
    float precio1;
    float precio2;
    float precio3;
    float precio4;
    
    public void leerExcel(){
        try{
            //Conectando a la Base de Datos
            Connection cn = Conexion.conectar();
            
            //Abriendo archivo Excel
            FileInputStream file = new FileInputStream("LISTA4.xls");
            HSSFWorkbook libro = new HSSFWorkbook(file);
            HSSFSheet hoja = libro.getSheetAt(0);
            
            //Iterando a traves de las filas del Excel
            Iterator<Row> filas = hoja.iterator();
            
            while(filas.hasNext()){
                Row fila = filas.next();
                Iterator<Cell> celdas = fila.cellIterator();
            
                //Leer valores de celdas
                
                codProducto = celdas.next().getStringCellValue();
                categoria =celdas.next().getStringCellValue();
                nombre = celdas.next().getStringCellValue();
                celdas.next();
                celdas.next();
                precio1 = (float)(celdas.next().getNumericCellValue());
                
                //Generando el SQL query
                PreparedStatement pst = cn.prepareStatement("INSERT INTO productos (cod_producto, categoria, nombre, precio1) VALUES (?, ?, ?, ?)");
                
                //Preparando el query
                pst.setString(1, codProducto);
                pst.setString(2, categoria);
                pst.setString(3, nombre);
                pst.setFloat(4, precio1);
                
                //Ejecutando el query
                pst.executeUpdate();
                pst.close();
            }
            //Cerrando el archivo y hoja y conexión
            file.close();
            libro.close();
            cn.close();
            
            JOptionPane.showMessageDialog(null, "Excel integrado a la BD con exito!");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
               
            
        
    }

}
