package vista;

import controlador.ControladorLogin;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Vista extends javax.swing.JFrame {

    private final ControladorLogin controlador;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_usuario;
    private JPasswordField jPasswordField1;
    
  

     public Vista() {
        initComponents();
        controlador = new ControladorLogin();
        configurarEventos();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        lbl_usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_usuario.setText("usuario");

        lbl_contraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_contraseña.setText("contraseña");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        btn_ingresar.setText("INGRESAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(163, 163, 163))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lbl_contraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ingresar)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Evento que ocurre cuando se presiona "Enter" en el campo de texto del usuario
    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    // Método para configurar eventos en la interfaz, como el botón de ingresar
    private void configurarEventos() {
    btn_ingresar.addActionListener(evt -> botonIniciarSesionActionPerformed());
}

    // Método para manejar el inicio de sesión al presionar el botón "Ingresar"
    private void botonIniciarSesionActionPerformed() {
        String nombreUsuario = txt_usuario.getText(); // Obtiene el nombre de usuario
        String contrasena = new String(jPasswordField1.getPassword()); // Obtiene la contraseña

        // Verifica si las credenciales son válidas con el controlador de autenticación
        if (controlador.autenticar(nombreUsuario, contrasena)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            
        } else {
            JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrectos");
            
        }
    }

    public static void main(String args[]) {
        // Hace visible la interfaz gráfica al ejecutar la aplicación
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }
}

    // Variables declaration

    // End of variables declaration

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ingresar;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    public javax.swing.JLabel lbl_contraseña;
    public javax.swing.JLabel lbl_usuario;
    public javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

