package controlador;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

public class ControladorProducto {

    // Lista para almacenar temporalmente los productos
    private final List<Producto> listaProductos;
    // Constructor de la clase ControladorProducto
    public ControladorProducto() {
        listaProductos = new ArrayList<>();
    }

    // Método para registrar un producto en la lista
    public void registrarProducto(Producto nuevoProducto) {
        listaProductos.add(nuevoProducto);
        JOptionPane.showMessageDialog(null, "Producto registrado temporalmente: " + nuevoProducto.getNombre());
    }

    // Método para obtener la lista de productos
    
    public List<Producto> obtenerProductos() {
        return listaProductos;
    }
}

