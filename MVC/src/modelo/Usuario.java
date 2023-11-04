package modelo;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    
    
    // Constructor que recibe el nombre de usuario y la contraseña para inicializar el objeto Usuario
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    // Método que verifica si las credenciales del usuario son válidas
    public boolean esValido() {
        // Verificar aquí la autenticación
        return nombreUsuario.equals("usuario") && contrasena.equals("password");
    }
}
