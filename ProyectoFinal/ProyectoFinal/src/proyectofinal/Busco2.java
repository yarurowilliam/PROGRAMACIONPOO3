/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Busco2 extends javax.swing.JDialog {

    ArrayList<Producto> listaCompras;
    Producto producto;

    public Busco2(java.awt.Frame parent, boolean modal, ArrayList<Producto> listaCompras) {
        super(parent, modal);
        initComponents();
        try {
            this.listaCompras = listaCompras;
            ver();
            producto = null;
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jButton2)
                .addContainerGap(311, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(76, 76, 76))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(123, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        seleccionarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed
    public Producto retornarProducto() {
        return producto;
    }

    private void seleccionarProducto() {
        try {
            int filaSeleccionada = jTable1.getSelectedRow();
            if (filaSeleccionada < 0) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione el docente a retornar");
            } else {
                producto = new Producto();
                producto.setTipoProducto(jTable1.getValueAt(filaSeleccionada, 0).toString());
                producto.setNombreProducto(jTable1.getValueAt(filaSeleccionada, 1).toString());
                String abc = (jTable1.getValueAt(filaSeleccionada, 2).toString());
                String abc2 = (jTable1.getValueAt(filaSeleccionada, 3).toString());
                producto.setCantidad(Integer.parseInt(abc));
                producto.setTarifa(Double.parseDouble(abc2));
                //persona.setTipoPersona(jTable1.getValueAt(filaSeleccionada, 3).toString());
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "PAILAS");
        }
    }

    private void ver() {
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"TIPO PRODUCTO", "Nombre", "CANTIDAD", "TARIFA"};
        modelo.setColumnIdentifiers(columnas);
        String[] fila;
        for (Producto producto : listaCompras) {
            fila = new String[columnas.length];
            fila[0] = producto.getTipoProducto();
            fila[1] = producto.getNombreProducto();
            fila[2] = String.valueOf(producto.getCantidad());
            fila[3] = String.valueOf(producto.getTarifa());
            modelo.addRow(fila);
        }
        jTable1.setModel(modelo);

    }

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
            java.util.logging.Logger.getLogger(Busco2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busco2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busco2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busco2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
 /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Busco2 dialog = new Busco2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
