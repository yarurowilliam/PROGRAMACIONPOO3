package proyectofinal;

import com.sun.awt.AWTUtilities;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    private String user1, user2, password1, password2;

    public Login() {
        initComponents();
        cambiarIcono();
        AWTUtilities.setWindowOpaque(this, false);
    }

    private void cambiarIcono() {
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/iconcono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userTexto = new javax.swing.JTextField();
        passwordTexto = new javax.swing.JPasswordField();
        botonLogin = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTexto.setBackground(new java.awt.Color(81, 90, 101));
        userTexto.setFont(new java.awt.Font("Avenir Black", 0, 13)); // NOI18N
        userTexto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(userTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 245, 30));

        passwordTexto.setBackground(new java.awt.Color(81, 90, 101));
        passwordTexto.setFont(new java.awt.Font("Avenir Black", 0, 14)); // NOI18N
        passwordTexto.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(passwordTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 245, 30));

        botonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-login.png"))); // NOI18N
        botonLogin.setBorder(null);
        botonLogin.setBorderPainted(false);
        botonLogin.setContentAreaFilled(false);
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 344, 139, 34));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir-login.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        salir.setContentAreaFilled(false);
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 56, 36, 37));

        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLoginActionPerformed
        login();
    }//GEN-LAST:event_botonLoginActionPerformed

    private void login() {
        user1 = "josealg04";
        password1 = "12345";
        user2 = "jricardo";
        password2 = "ricardo100";

        if ((user1.equals(userTexto.getText()) && password1.equals(passwordTexto.getText())) || (user2.equals(userTexto.getText()) && password2.equals(passwordTexto.getText()))) {
            Heladeria heladeria = new Heladeria();
            heladeria.setVisible(true);
            this.dispose();
        } else if (userTexto.getText().equals("") && passwordTexto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña están vacíos\nIngréselos por favor.");
            userTexto.setFocusable(true);
        } else if (userTexto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Usuario está vacío\nIngréselo por favor.");
            userTexto.setFocusable(true);
        } else if (passwordTexto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Contraseña está vacía\nIngréselo por favor.");
            passwordTexto.setFocusable(true);
        } else if ((userTexto.getText().compareTo(user1) != 0 && passwordTexto.getText().compareTo(password1) != 0) || (userTexto.getText().compareTo(user2) != 0 && passwordTexto.getText().compareTo(password2) != 0)) {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
            userTexto.setFocusable(true);
        } else if ((userTexto.getText().compareTo(user1) != 0) || (userTexto.getText().compareTo(user2) != 0)) {
            JOptionPane.showMessageDialog(this, "Usuario no válido\nIngrese nuevamente.");
            userTexto.setFocusable(true);
        } else if ((passwordTexto.getText().compareTo(password1) != 0) || (passwordTexto.getText().compareTo(password2) != 0)) {
            JOptionPane.showMessageDialog(this, "Contraseña no válida\nIngrese nuevamente.");
            passwordTexto.setFocusable(true);
        }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField passwordTexto;
    private javax.swing.JButton salir;
    private javax.swing.JTextField userTexto;
    // End of variables declaration//GEN-END:variables
}
