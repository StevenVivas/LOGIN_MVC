/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.producto;

/**
 *
 * @author USUARIO
 */
public class frmProductos extends javax.swing.JFrame {

    /**
     * Creates new form frmProductos
     */
    public frmProductos() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProducto = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCrearProducto = new javax.swing.JMenu();
        jMItemNuevoProducto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMnItemVerProductos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelProducto.setBackground(new java.awt.Color(41, 41, 41));

        javax.swing.GroupLayout jPanelProductoLayout = new javax.swing.GroupLayout(jPanelProducto);
        jPanelProducto.setLayout(jPanelProductoLayout);
        jPanelProductoLayout.setHorizontalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        jPanelProductoLayout.setVerticalGroup(
            jPanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        mnCrearProducto.setText("Crear Producto");

        jMItemNuevoProducto.setText("Nuevo Producto");
        jMItemNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMItemNuevoProductoActionPerformed(evt);
            }
        });
        mnCrearProducto.add(jMItemNuevoProducto);

        jMenuBar1.add(mnCrearProducto);

        jMenu2.setText("Mostrar Productos");

        jMnItemVerProductos.setText("Ver Productos");
        jMnItemVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMnItemVerProductosActionPerformed(evt);
            }
        });
        jMenu2.add(jMnItemVerProductos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Editar Producto");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProducto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelProducto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMItemNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMItemNuevoProductoActionPerformed
        // TODO add your handling code here:
        nuevoProducto frmRegistroProducto = new nuevoProducto();
        frmRegistroProducto.setVisible(true);
        jPanelProducto.add(frmRegistroProducto);
    }//GEN-LAST:event_jMItemNuevoProductoActionPerformed

    private void jMnItemVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMnItemVerProductosActionPerformed
        // TODO add your handling code here:
        MostrarProductos frmVerProductos = new MostrarProductos();
        frmVerProductos.setVisible(true);
        jPanelProducto.add(frmVerProductos);
    }//GEN-LAST:event_jMnItemVerProductosActionPerformed
//Quitamos el metodo run para que solo se abra con el logeo
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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMItemNuevoProducto;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMnItemVerProductos;
    private javax.swing.JDesktopPane jPanelProducto;
    private javax.swing.JMenu mnCrearProducto;
    // End of variables declaration//GEN-END:variables
}
