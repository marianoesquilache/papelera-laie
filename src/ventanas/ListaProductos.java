/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.WindowConstants;
import javax.swing.JTable;
import ventanas.Main;

public class ListaProductos extends javax.swing.JFrame {

    
    //Instancia de clase main que usaremos para traer el String palabra
    Main instanciaMain = new Main();
    public static String palabra;
    
    DefaultTableModel model = new DefaultTableModel();

    public ListaProductos() {

        palabra = instanciaMain.palabra;
        initComponents();
        setSize(840, 480);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("select cod_producto, categoria, nombre, precio1, precio2, precio3, precio4 from productos where nombre like ? order by nombre asc");
            pst.setString(1, "%"+palabra+"%");
            ResultSet rs = pst.executeQuery();

            jTable_productos = new JTable(model);
            jTable_productos.setDefaultEditor(Object.class, null);
            jScrollPane_productos.setViewportView(jTable_productos);

            model.addColumn("Código Producto");
            model.addColumn("Categoría");
            model.addColumn("Nombre del Producto");
            model.addColumn("Precio 1");
            model.addColumn("Precio 2");
            model.addColumn("Precio 3");
            model.addColumn("Precio 4");

            jTable_productos.getColumnModel().getColumn(0).setPreferredWidth(135);
            jTable_productos.getColumnModel().getColumn(1).setPreferredWidth(135);
            jTable_productos.getColumnModel().getColumn(2).setPreferredWidth(270);
            jTable_productos.getColumnModel().getColumn(3).setPreferredWidth(75);
            jTable_productos.getColumnModel().getColumn(4).setPreferredWidth(75);
            jTable_productos.getColumnModel().getColumn(5).setPreferredWidth(75);
            jTable_productos.getColumnModel().getColumn(6).setPreferredWidth(75);

            while (rs.next()) {
                Object[] filas = new Object[7];
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                model.addRow(filas);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("No se pudo llenar tabla");
            JOptionPane.showMessageDialog(null, "No se pudo llenar la tabla, contacte al administrador.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane_productos = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(640, 480));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane_productos.setViewportView(jTable_productos);

        jLabel_footer.setText("Desarrollado por Mariano Esquilache™");

        jLabel_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_title.setText("Productos Registrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_productos, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel_footer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel_title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel_title)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_footer)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JScrollPane jScrollPane_productos;
    private javax.swing.JTable jTable_productos;
    // End of variables declaration//GEN-END:variables
}