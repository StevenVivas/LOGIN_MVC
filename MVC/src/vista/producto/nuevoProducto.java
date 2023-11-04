/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.producto;

import modelo.Producto;
import controlador.ControladorProducto;
import javax.swing.JOptionPane;
import vista.Vista;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class nuevoProducto extends javax.swing.JInternalFrame {

    public static ControladorProducto controladorProducto;

    /**
     * Creates new form nuevoProducto
     */
    public nuevoProducto() {
        initComponents();
        controladorProducto = new ControladorProducto();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_descripcion = new javax.swing.JLabel();
        lbl_precio = new javax.swing.JLabel();
        lbl_cantidad = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        tex_cantidad = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        btn_registrar_producto = new javax.swing.JButton();
        btn_salir_producto = new javax.swing.JButton();
        btn_mostrar_productos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRAR PRODUCTOS");

        lbl_nombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nombre.setText("NOMBRE");

        lbl_descripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_descripcion.setText("DESCRIPCIÓN");

        lbl_precio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_precio.setText("PRECIO");

        lbl_cantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbl_cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cantidad.setText("CANTIDAD");

        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txt_descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_descripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        tex_cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tex_cantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tex_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_cantidadActionPerformed(evt);
            }
        });

        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btn_registrar_producto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_registrar_producto.setText("REGISTRAR");
        btn_registrar_producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_registrar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_productoActionPerformed(evt);
            }
        });

        btn_salir_producto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_salir_producto.setText("SALIR");
        btn_salir_producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_salir_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_productoActionPerformed(evt);
            }
        });

        btn_mostrar_productos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_mostrar_productos.setText("Mostrar Productos");
        btn_mostrar_productos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_mostrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_productosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(lbl_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(lbl_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115)
                            .addComponent(tex_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(btn_registrar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(btn_salir_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(btn_mostrar_productos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 386, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 25, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(8, 8, 8)
                    .addComponent(jLabel2)
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_nombre)
                        .addComponent(lbl_descripcion))
                    .addGap(26, 26, 26)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_precio)
                        .addComponent(lbl_cantidad))
                    .addGap(16, 16, 16)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tex_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(58, 58, 58)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_registrar_producto)
                        .addComponent(btn_salir_producto)
                        .addComponent(btn_mostrar_productos))
                    .addGap(0, 26, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tex_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_cantidadActionPerformed

    private void btn_registrar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_productoActionPerformed
        String nombre = txt_nombre.getText();
        String descripcion = txt_descripcion.getText();

        try {
            double precio = Double.parseDouble(txt_precio.getText());
            int cantidad = Integer.parseInt(tex_cantidad.getText());

            Producto nuevoProducto = new Producto(nombre, descripcion, precio, cantidad);

            // Llamar al controlador específico para el registro de productos
            controladorProducto.registrarProducto(nuevoProducto);

            // Limpiar los campos después del registro
            limpiarCampos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido para Precio y Cantidad");
        }
    }//GEN-LAST:event_btn_registrar_productoActionPerformed

    private void btn_salir_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_productoActionPerformed
        Vista vistaAnterior = new Vista();
        vistaAnterior.setVisible(true);
        this.dispose();// Cierra la ventana actual
    }//GEN-LAST:event_btn_salir_productoActionPerformed

    private void btn_mostrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_productosActionPerformed

        // Obtiene los productos del controlador
        List<Producto> productos = controladorProducto.obtenerProductos();

        // Muestra los productos en un cuadro de diálogo
        if (!productos.isEmpty()) {
            StringBuilder listaProductos = new StringBuilder("Productos registrados:\n");
            for (Producto producto : productos) {
                listaProductos.append(producto.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, listaProductos.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos registrados aún.");
        }

    }//GEN-LAST:event_btn_mostrar_productosActionPerformed

 // Limpia los campos de texto
    private void limpiarCampos() {
       // Limpiar los campos de texto después de registrar un producto
       txt_nombre.setText("");
       txt_descripcion.setText("");
       txt_precio.setText("");
       tex_cantidad.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_mostrar_productos;
    public javax.swing.JButton btn_registrar_producto;
    public javax.swing.JButton btn_salir_producto;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lbl_cantidad;
    public javax.swing.JLabel lbl_descripcion;
    public javax.swing.JLabel lbl_nombre;
    public javax.swing.JLabel lbl_precio;
    public javax.swing.JTextField tex_cantidad;
    public javax.swing.JTextField txt_descripcion;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
