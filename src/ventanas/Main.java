package ventanas;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import clases.Conexion;
import clases.LeerExcel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {
    String codigoProducto,nombreProducto,categoriaProducto;
    Float precio1 = 0f, precio2 = 0f, precio3 = 0f, precio4 = 0f;
    
    

    //Esta variable pasa el dato a la interfaz "ListaProductos"
    public static String palabra;
    LeerExcel leerExcel = new LeerExcel();
    
    

    public Main() {
        initComponents();
        setTitle("Papelera Librería \"Laíe\"");
        setLocationRelativeTo(null);
        limpiar();
        setResizable(false);
        setSize(640, 480);
        txt_nombreProducto.setText("");
        
        ImageIcon wallpaper = new ImageIcon("src/img/green.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                    jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpaper_logo = new ImageIcon("src/img/logo.png");
        Icon icono_logo = new ImageIcon(wallpaper_logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),
                jLabel_Logo.getHeight(),Image.SCALE_DEFAULT));
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue =   Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCodProducto = new javax.swing.JLabel();
        labelCatProducto = new javax.swing.JLabel();
        labelNomProducto = new javax.swing.JLabel();
        labelPrecio3 = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelPrecio4 = new javax.swing.JLabel();
        labelPrecio2 = new javax.swing.JLabel();
        txt_precio4 = new javax.swing.JTextField();
        txt_codigoProducto = new javax.swing.JTextField();
        txt_nombreProducto = new javax.swing.JTextField();
        txt_categoriaProducto = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_precio2 = new javax.swing.JTextField();
        txt_precio3 = new javax.swing.JTextField();
        jButton_buscarCod = new javax.swing.JButton();
        jButton_registrar = new javax.swing.JButton();
        labelTitle1 = new javax.swing.JLabel();
        jbutton_buscarNombre = new javax.swing.JButton();
        jButton_leerExcel = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Papelera y Librería \"La ie\"");
        setBackground(new java.awt.Color(102, 255, 102));
        setForeground(java.awt.Color.yellow);
        setIconImage(getIconImage());
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCodProducto.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelCodProducto.setForeground(new java.awt.Color(255, 255, 255));
        labelCodProducto.setText("Codigo del Producto");
        getContentPane().add(labelCodProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        labelCatProducto.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelCatProducto.setForeground(new java.awt.Color(255, 255, 255));
        labelCatProducto.setText("Categoría de Producto");
        getContentPane().add(labelCatProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        labelNomProducto.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelNomProducto.setForeground(new java.awt.Color(255, 255, 255));
        labelNomProducto.setText("Nombre del Producto");
        getContentPane().add(labelNomProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 34));

        labelPrecio3.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelPrecio3.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio3.setText("Precio 3");
        getContentPane().add(labelPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 34));

        labelPrecio.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelPrecio.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio.setText("Precio Costo");
        getContentPane().add(labelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 34));

        labelPrecio4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelPrecio4.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio4.setText("Precio 4");
        getContentPane().add(labelPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 34));

        labelPrecio2.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        labelPrecio2.setForeground(new java.awt.Color(255, 255, 255));
        labelPrecio2.setText("Precio 2");
        getContentPane().add(labelPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 34));

        txt_precio4.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_precio4.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 80, -1));

        txt_codigoProducto.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_codigoProducto.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_codigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 410, -1));

        txt_nombreProducto.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_nombreProducto.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 410, -1));

        txt_categoriaProducto.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_categoriaProducto.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_categoriaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 410, -1));

        txt_precio.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_precio.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 80, -1));

        txt_precio2.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_precio2.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, -1));

        txt_precio3.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 14)); // NOI18N
        txt_precio3.setForeground(new java.awt.Color(51, 153, 0));
        getContentPane().add(txt_precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 80, -1));

        jButton_buscarCod.setBackground(new java.awt.Color(44, 168, 48));
        jButton_buscarCod.setForeground(new java.awt.Color(255, 255, 255));
        jButton_buscarCod.setText("Buscar Código");
        jButton_buscarCod.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_buscarCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscarCodActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscarCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 140, 30));

        jButton_registrar.setBackground(new java.awt.Color(44, 168, 48));
        jButton_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_registrar.setText("Registrar");
        jButton_registrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 140, 30));

        labelTitle1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle1.setText("Papelera y Librería \"Laíe\"");
        getContentPane().add(labelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 330, -1));

        jbutton_buscarNombre.setBackground(new java.awt.Color(44, 168, 48));
        jbutton_buscarNombre.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_buscarNombre.setText("Buscar  Nombre");
        jbutton_buscarNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbutton_buscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_buscarNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jbutton_buscarNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 140, 30));

        jButton_leerExcel.setBackground(new java.awt.Color(44, 168, 48));
        jButton_leerExcel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_leerExcel.setText("Leer Excel");
        jButton_leerExcel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_leerExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leerExcelActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_leerExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 140, 30));
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, 170));

        jLabel_Wallpaper.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 10)); // NOI18N
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
        boolean noNumerico = false,invalido = false,sinNombre = false;
        
        validarIngresos();
        
        //Chequeando si este codigo ya existia en la BD
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select * from productos where cod_producto=?");

            pst.setString(1, codigoProducto);
            ResultSet rs = pst.executeQuery();

            //Si el codigo es encontrado
            if (rs.next()) {
                int respuesta = JOptionPane.showConfirmDialog(null, "Este producto ya existe, desea modificarlo?", "Producto REPETIDO", JOptionPane.YES_NO_OPTION);

                //En caso de SÍ querer modificar en caso de poner NO o "Cerrar" el programa continpua flujo normal.
                if (respuesta == JOptionPane.YES_OPTION && noNumerico == false) {
                    try {
                        pst = cn.prepareStatement("update productos set cod_producto = ?, categoria = ?, nombre = ?, precio1 = ?, precio2 = ?, precio3 = ?, precio4=? where cod_producto = ? ");

                        pst.setString(1, codigoProducto);
                        pst.setString(2, categoriaProducto);
                        pst.setString(3, nombreProducto);
                        pst.setFloat(4, precio1);
                        pst.setFloat(5, precio2);
                        pst.setFloat(6, precio3);
                        pst.setFloat(7, precio4);
                        pst.setString(8, codigoProducto);

                        pst.executeUpdate();
                        cn.close();
                        JOptionPane.showMessageDialog(null, "Producto actualizado con exito!");
                        invalido = true;
                        limpiar();
                    } catch (SQLException e) {
                        System.out.println("No se pudo actualizar el producto");
                    }
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Debes ingresar el precio en numeros.");
                    //Esto es para que no cree nuevo producto "de todos modos" al seleccionar "No"
                    invalido = true;
                    JOptionPane.getRootFrame().dispose();
                }

            }

            //Validación de nombre
            if (nombreProducto.equals("")) {
                txt_nombreProducto.setBackground(Color.red);
                sinNombre = true;
                JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre de Producto");
            }

            //Una vez que verificamos que el producto tiene un nombre procedemos a registrar los datos en BD y que sea "valido"            
            if (sinNombre == false && invalido == false && noNumerico == false) {
                try {

                    pst = cn.prepareStatement("insert into productos values (?,?,?,?,?,?,?,?)");

                    pst.setString(1, "0");
                    pst.setString(2, codigoProducto);
                    pst.setString(3, categoriaProducto);
                    pst.setString(4, nombreProducto);
                    pst.setFloat(5, precio1);
                    pst.setFloat(6, precio2);
                    pst.setFloat(7, precio3);
                    pst.setFloat(8, precio4);

                    pst.executeUpdate();

                    limpiar();

                    JOptionPane.showMessageDialog(null, "Registro Exitoso!");

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "No pudimos registrar producto.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No logramos conectar a la BD");
            System.out.println("No se pudo conectar a la BD");
        }


    }//GEN-LAST:event_jButton_registrarActionPerformed

    private void jButton_buscarCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscarCodActionPerformed
        codigoProducto = txt_codigoProducto.getText().trim();

        if (!codigoProducto.isEmpty()) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from productos where cod_producto = ?");

                pst.setString(1, codigoProducto);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_nombreProducto.setText(rs.getString("nombre"));
                    System.out.println("nombre cargado");
                    txt_categoriaProducto.setText(rs.getString("categoria"));
                    System.out.println("categoria cargada");
                    System.out.println("Intentando precio 1");
                    txt_precio.setText(String.valueOf(rs.getFloat("precio1")));
                    System.out.println("precio1 cargado");
                    txt_precio2.setText(String.valueOf(rs.getFloat("precio2")));
                    txt_precio3.setText(String.valueOf(rs.getFloat("precio3")));
                    txt_precio4.setText(String.valueOf(rs.getFloat("precio4")));
                } else {
                    JOptionPane.showMessageDialog(null, "Producto no existe");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lo sentimos no pudimos realizar la operación.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes ingresar un codigo.");
        }
    }//GEN-LAST:event_jButton_buscarCodActionPerformed

    private void jbutton_buscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_buscarNombreActionPerformed

        palabra = txt_nombreProducto.getText().trim();
        ListaProductos listaProductos = new ListaProductos();
        listaProductos.setVisible(true);
    }//GEN-LAST:event_jbutton_buscarNombreActionPerformed

    private void jButton_leerExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leerExcelActionPerformed
        leerExcel.leerExcel();
    }//GEN-LAST:event_jButton_leerExcelActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void limpiar() {
        txt_codigoProducto.setText("");
        txt_categoriaProducto.setText("");
        txt_nombreProducto.setText("");

        txt_precio.setText("");
        txt_precio2.setText("");
        txt_precio3.setText("");
        txt_precio4.setText("");
        txt_nombreProducto.setBackground(Color.WHITE);

    }

    public String getNombre() {
        return txt_nombreProducto.getText().trim();
    }
    
    public void verificarCodigoIngreso(){
        
    }
    
    public void validarIngresos(){
        //Para validar que el campo nombre tenga contenido(Obligatorio)
        boolean sinNombre = false;

        //Esta variable es para diferenciar productos nuevos de los ya existentes. Evita conflicto al ingresar nuevo producto.
        boolean invalido = false;
        
        boolean noNumerico = false;
        
        codigoProducto = txt_codigoProducto.getText().trim();
        categoriaProducto = txt_categoriaProducto.getText().trim();
        nombreProducto = txt_nombreProducto.getText().trim();

        //Esta validación soluciona el problema de Productos sin Código que se Actualizan en vez ede crear nuevo producto.
        if (codigoProducto.equals("")) {
            codigoProducto = nombreProducto;
        }
        //Validaciones de los Precios
        if (!txt_precio.getText().trim().isEmpty()) {
            try {
                precio1 = Float.parseFloat(txt_precio.getText().trim());
            } catch (Exception e) {
                noNumerico = true;
                JOptionPane.showMessageDialog(null, "Los precios se ingresan en números decimales declarados con \".\"(punto)");
            }
        }
        if (!txt_precio2.getText().trim().isEmpty()) {
            try {
                precio2 = Float.parseFloat(txt_precio2.getText().trim());
            } catch (Exception e) {
                noNumerico = true;
                JOptionPane.showMessageDialog(null, "Los precios se ingresan en números decimales declarados con \".\"(punto)");
            }
        }
        if (!txt_precio3.getText().trim().isEmpty()) {
            try {
                precio3 = Float.parseFloat(txt_precio3.getText().trim());
            } catch (Exception e) {
                noNumerico = true;
                JOptionPane.showMessageDialog(null, "Los precios se ingresan en números decimales declarados con \".\"(punto)");
            }
        }
        if (!txt_precio4.getText().trim().isEmpty()) {
            try {
                precio4 = Float.parseFloat(txt_precio4.getText().trim());
            } catch (Exception e) {
                noNumerico = true;
                JOptionPane.showMessageDialog(null, "Los precios se ingresan en números decimales declarados con \".\"(punto)");
                
            }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_buscarCod;
    private javax.swing.JButton jButton_leerExcel;
    private javax.swing.JButton jButton_registrar;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JButton jbutton_buscarNombre;
    private javax.swing.JLabel labelCatProducto;
    private javax.swing.JLabel labelCodProducto;
    private javax.swing.JLabel labelNomProducto;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelPrecio2;
    private javax.swing.JLabel labelPrecio3;
    private javax.swing.JLabel labelPrecio4;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JTextField txt_categoriaProducto;
    private javax.swing.JTextField txt_codigoProducto;
    private javax.swing.JTextField txt_nombreProducto;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_precio2;
    private javax.swing.JTextField txt_precio3;
    private javax.swing.JTextField txt_precio4;
    // End of variables declaration//GEN-END:variables
}
