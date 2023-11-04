package modelo;

public class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    
    
    // Método para representar el objeto en forma de texto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Descripción: " + descripcion + ", Precio: " + precio + ", Cantidad: " + cantidad;
    }
    // Constructor de la clase Producto
    public Producto(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Getters y setters para acceder y establecer los atributos
    
    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }
    // Método para establecer el nombre del producto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método para obtener la descripción del producto
    public String getDescripcion() {
        return descripcion;
    }
    // Método para establecer la descripción del producto
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // Método para obtener el precio del producto
    public double getPrecio() {
        return precio;
    }
    // Método para establecer el precio del producto
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    // Método para obtener la cantidad del producto
    public int getCantidad() {
        return cantidad;
    }
    // Método para establecer la cantidad del producto
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    /* Método para guardar en la base de datos
    public boolean guardarEnBaseDeDatos() {
        // Lógica para guardar en la base de datos
        // Retorna true si se guarda exitosamente, de lo contrario, retornaría false
        return true;
    } */
}
