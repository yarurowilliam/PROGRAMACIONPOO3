    package proyectofinal;

import archivos.ManejoBinario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    ArrayList<Persona> listaCliente;
    ArrayList<Persona> listaClienteFiltrada;
    ArrayList<Producto> listaCompras;
    ArrayList<Producto> listaComprasFiltrada;
    ArrayList<Producto> listaVentas;
    ManejoBinario accesoArchivo;

    public NewJFrame() {
        initComponents();
        listaCliente = new ArrayList<>();
        listaClienteFiltrada = new ArrayList<>();
        listaCompras = new ArrayList<>();
        listaComprasFiltrada = new ArrayList<>();
        accesoArchivo = new ManejoBinario();
        listaVentas = new ArrayList<>(); //TipoPersona - TipoProducto
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboProducto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        labelGrado = new javax.swing.JLabel();
        labelIdentificacion = new javax.swing.JLabel();
        labelMateria = new javax.swing.JLabel();
        labelIdentificacionD = new javax.swing.JLabel();
        labelApellidoD = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        comboPersona = new javax.swing.JComboBox<>();
        labelNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelNombreD = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE PRODUCTO");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Identificacion:");

        comboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "TRADICIONAL SERVIDO", "TRADICIONAL PRE-SERVIDO", "ESPECIAL SERVIDO" }));
        comboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductoActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelGrado.setText("-");

        labelIdentificacion.setText("-");

        labelMateria.setText("-");

        labelIdentificacionD.setText("-");

        labelApellidoD.setText("-");

        labelApellido.setText("-");

        comboPersona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Estudiante", "Docente", "Funcionario", "Particular" }));
        comboPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPersonaActionPerformed(evt);
            }
        });

        labelNombre.setText("-");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("CANTIDAD:");

        labelNombreD.setText("-");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("TIPO PRODUCTO");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Sisben");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("PRECIO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(comboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(labelIdentificacionD, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelApellidoD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(90, 90, 90)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdentificacion)
                    .addComponent(labelIdentificacionD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelNombreD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMateria))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelApellidoD, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        buscarPersona();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPersonaActionPerformed
        if (comboPersona.getSelectedItem().equals("Seleccione")) {
            JOptionPane.showMessageDialog(this, "PORFAVOR SELECCIONE LA MATERIA PARA VER LOS DOCENTES DISPONIBLES!!");
        } else {
            if (comboPersona.getSelectedItem().equals("Estudiante")) {
                buscarPersona();
            } else {
                if (comboPersona.getSelectedItem().equals("Docente")) {
                    buscarPersona();
                } else {
                    if (comboPersona.getSelectedItem().equals("Funcionario")) {
                        buscarPersona();
                    } else {
                        if (comboPersona.getSelectedItem().equals("Particular")) {
                            buscarPersona();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_comboPersonaActionPerformed

    private void comboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductoActionPerformed
        if (comboProducto.getSelectedItem().equals("SELECCIONE")) {
            JOptionPane.showMessageDialog(this, "PORFAVOR SELECCIONE LA MATERIA PARA VER LOS DOCENTES DISPONIBLES!!");
        } else {
            if (comboProducto.getSelectedItem().equals("TRADICIONAL SERVIDO")) {
                buscarTipo();
            } else {
                if (comboProducto.getSelectedItem().equals("TRADICIONAL PRE-SERVIDO")) {
                    buscarTipo();
                } else {
                    if (comboProducto.getSelectedItem().equals("ESPECIAL SERVIDO")) {
                        buscarTipo();
                    }
                }
            }
        }
    }//GEN-LAST:event_comboProductoActionPerformed

    private void buscarPersona() {
        try {
            listaCliente = (ArrayList<Persona>) accesoArchivo.leerObjeto("Clientes.heladeria");
            listaClienteFiltrada = new ArrayList<>();
            String filtro = comboPersona.getSelectedItem().toString();
            for (Persona mensajero : listaCliente) {
                String nombre = mensajero.getTipoPersona();
                if (nombre.toUpperCase().contains(filtro.toUpperCase())) {
                    listaClienteFiltrada.add(mensajero);
                }
            }
            Busco busqueda = new Busco(new JFrame(), rootPaneCheckingEnabled, listaClienteFiltrada);
            busqueda.setVisible(true);
            Persona persona = busqueda.retornarPersona();
            if (persona != null) {
                labelIdentificacionD.setText(persona.getId());
                labelNombreD.setText(persona.getNombre());
                labelApellidoD.setText(String.valueOf(persona.getSisben()));
                labelMateria.setText(persona.getTipoPersona());
            } else {
                labelIdentificacionD.setText("-");
                labelNombreD.setText("-");
                labelApellidoD.setText("-");
                labelMateria.setText("-");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "PAILAS");
        }
    }

    private void buscarTipo() {
        try {
            listaCompras = (ArrayList<Producto>) accesoArchivo.leerObjeto("Compras.heladeria");
            listaComprasFiltrada = new ArrayList<>();
            String filtro = comboProducto.getSelectedItem().toString();
            for (Producto mensajero : listaCompras) {
                String nombre = mensajero.getTipoProducto();
                if (nombre.toUpperCase().contains(filtro.toUpperCase())) {
                    listaComprasFiltrada.add(mensajero);
                }
            }
            Busco2 busqueda2 = new Busco2(new JFrame(), rootPaneCheckingEnabled, listaComprasFiltrada);
            busqueda2.setVisible(true);
            Producto producto = busqueda2.retornarProducto();
            if (producto != null) {
                labelIdentificacion.setText(producto.getTipoProducto());
                labelNombre.setText(producto.getNombreProducto());
                labelApellido.setText(String.valueOf(producto.getCantidad()));
                labelGrado.setText(String.valueOf(producto.getTarifa()));
            } else {
                labelIdentificacion.setText("-");
                labelNombre.setText("-");
                labelApellido.setText("-");
                labelGrado.setText("-");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "PAILAS");
        }
    }
/*
    private void agregar() {
        try {
            if (labelIdentificacion.getText().equals("-") || labelIdentificacionD.getText().equals("-") || labelMateria.getText().equals("-")) {
                JOptionPane.showMessageDialog(rootPane, "NO PUEDES HACER ESO");
            } else {
                Facturacion facturacion = new Facturacion();
                facturacion.setIdea(labelIdentificacionD.getText());
                facturacion.setNombreA(labelApellidoD.getText());
                String abc = labelNombreD.getText();
                facturacion.setSisbenA(Double.parseDouble(abc));
                facturacion.setTipoPersonaA(labelMateria.getText());
                facturacion.setTipoProductoA(labelIdentificacion.getText());
                facturacion.setNombreProductoA(labelNombre.getText());
                String abc1 = labelGrado.getText();
                facturacion.setCantidadA(Integer.parseInt(abc1));
                String abc2 = labelApellido.getText();
                facturacion.setPrecioA(Double.parseDouble(abc2));
                facturacion.setTotalPagar(0);
                
                JOptionPane.showMessageDialog(this, "MATERIA INGRESADA CORRECTAMENTE");
                listaVentas.add(facturacion);
                accesoArchivo.guardarListaEstudianteN(listaVentas);
                ver();
                labelIdentificacion.setText("-");
                labelNombre.setText("-");
                labelApellido.setText("-");
                labelGrado.setText("-");
                labelIdentificacionD.setText("-");
                labelApellidoD.setText("-");
                labelNombreD.setText("-");
                labelMateria.setText("-");
            }

        } catch (Exception e) {
        }
    }*/

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPersona;
    private javax.swing.JComboBox<String> comboProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelApellidoD;
    private javax.swing.JLabel labelGrado;
    private javax.swing.JLabel labelIdentificacion;
    private javax.swing.JLabel labelIdentificacionD;
    private javax.swing.JLabel labelMateria;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreD;
    // End of variables declaration//GEN-END:variables
}
