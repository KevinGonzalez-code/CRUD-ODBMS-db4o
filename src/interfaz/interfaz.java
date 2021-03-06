/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Metodos.Logica;
import clases.Articulo;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class interfaz extends javax.swing.JFrame {

    Logica log = new Logica();

    public interfaz() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMostarArticulos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbMostar = new javax.swing.JButton();
        jbInsertar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtDescripcion = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación de productos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtMostarArticulos.setColumns(20);
        jtMostarArticulos.setRows(5);
        jScrollPane1.setViewportView(jtMostarArticulos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 62, 362, 330));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Descripción:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 120, 30));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 120, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, 30));

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, -1));

        jbMostar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbMostar.setText("Mostrar");
        jbMostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMostarActionPerformed(evt);
            }
        });
        jPanel1.add(jbMostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jbInsertar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbInsertar.setText("Insertar");
        jbInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(jbInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jbBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jbModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jbModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jbBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jScrollPane3.setViewportView(jtDescripcion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 200, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInsertarActionPerformed

        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nombre = txtNombre.getText();
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String descripcion = jtDescripcion.getText();

            Articulo nuevoArticulo = new Articulo(codigo, nombre, cantidad, descripcion);

            log.altas(nuevoArticulo);

            txtCodigo.setText("");
            txtNombre.setText("");
            txtCantidad.setText("");
            jtDescripcion.setText("");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se han rellenado los campos para insertar un nuevo producto", "Rellenar los campos", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbInsertarActionPerformed

    private void jbMostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMostarActionPerformed

        Articulo todosArticulos = new Articulo();
        log.mostarTodos(todosArticulos, jtMostarArticulos);

    }//GEN-LAST:event_jbMostarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        if (txtCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No se ha introducido ningun codigo a buscar", "Introduce un código", JOptionPane.ERROR_MESSAGE);
        } else {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Articulo busqueda = new Articulo(codigo, null, 0, null);
            log.buscar(busqueda, txtCodigo, txtNombre, txtCantidad, jtDescripcion);
            log.mostarTodos(busqueda, jtMostarArticulos);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        try {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Articulo borrar = new Articulo(codigo, null, 0, null);
            log.borrarArticulo(borrar);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se ha introducido ningun codigo a borrar", "Introduce un código", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {

            int codigo = Integer.parseInt(txtCodigo.getText());
            Articulo modificar = new Articulo(codigo, null, 0, null);
            log.modificar(modificar, txtCodigo, txtNombre, txtCantidad, jtDescripcion);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se han rellenado los campos a modificar", "Rellenar los campos", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbModificarActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbInsertar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbMostar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextPane jtDescripcion;
    private javax.swing.JTextArea jtMostarArticulos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
