/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion.medico;

import javax.swing.JOptionPane;
import logica.Gestion;

/**
 *
 * @author JeanCarlos
 */
public class GestionMedicamento extends javax.swing.JDialog {

    
    public GestionMedicamento(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        cargarDatos();
    }
    
        private void cargarDatos() {
        tblMedicamentos.setModel(Gestion.getModeloTablaMedicmentos());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicamentos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        cmbNombre = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 80, 30);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(80, 40, 90, 30);

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 40, 80, 30);

        jLabel3.setText("CANTIDAD:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 40, 80, 30);
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(420, 40, 60, 30);

        tblMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicamentos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 520, 200);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(310, 100, 110, 30);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(420, 100, 90, 30);

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(200, 100, 110, 30);

        cmbNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "ACETAMINOCEN", "IBUPROFENO", "AMOXICILINA", "AMPILICINA", "BETAMETAZONA", " " }));
        getContentPane().add(cmbNombre);
        cmbNombre.setBounds(230, 40, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicamentosMouseClicked
        verDatos();
    }//GEN-LAST:event_tblMedicamentosMouseClicked

    private void agregar() {
        String mensaje;
        mensaje = Gestion.agregarMedicamento(txtCodigo.getText().trim(), cmbNombre.getSelectedItem().toString(), txtCantidad.getText().trim());
        JOptionPane.showMessageDialog(this, mensaje);
        limpiar();
        cargarDatos();
    }
    private void modificar() {

        Gestion.modificarMedicamento(txtCodigo.getText().trim(), cmbNombre.getSelectedItem().toString(), txtCantidad.getText().trim(),tblMedicamentos.getSelectedRow());
        JOptionPane.showMessageDialog(null, "MODIFICADO CORRECTAMENTE", "MODIFICAR", JOptionPane.ERROR_MESSAGE);
        limpiar();
        cargarDatos();

    }
    private void verDatos() {
        txtCodigo.setText(tblMedicamentos.getValueAt(tblMedicamentos.getSelectedRow(), 0).toString());
        cmbNombre.setSelectedItem(tblMedicamentos.getValueAt(tblMedicamentos.getSelectedRow(), 1).toString());
        txtCantidad.setText(tblMedicamentos.getValueAt(tblMedicamentos.getSelectedRow(), 2).toString());
        
    }
    
     private void eliminar() {
        Gestion.eliminar(tblMedicamentos.getSelectedRow());
        JOptionPane.showMessageDialog(this, "ELIMINDADO CORRECTAMENTE");
        limpiar();
        cargarDatos();
    }
    
      private void limpiar() {
        txtCodigo.setText("");
        txtCantidad.setText("");
        cmbNombre.setSelectedItem("SELECCIONE");
       
        txtCodigo.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMedicamentos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
