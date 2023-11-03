//Controlador encargado de la lógica de autenticación de inicio de sesión.
package controlador;

import modelo.Usuario;
//Método para autenticar un usuario a través de un nombre de usuario y contraseña.

public class ControladorLogin {
    public boolean autenticar(String nombreUsuario, String contrasena) {  
        // Crea un nuevo objeto Usuario con el nombre de usuario y la contraseña proporcionados.
        Usuario usuario = new Usuario(nombreUsuario, contrasena);
        // Verifica si el usuario es válido, comparando con las credenciales predefinidas.
        return usuario.esValido();
    }
}
