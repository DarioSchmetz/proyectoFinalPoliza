package accesoDatos;

import java.sql.PreparedStatement;

import modelo.Usuario;

public class Conexion {
public static boolean Usuario (Usuario usuario) throws Exception {
		
		String query = "INSERT INTO usuario (nombre,contraseña ,apellido,email) VALUES (?,?, ?, ?,?)";

	// create the mysql insert preparedstatement.
		PreparedStatement preparedStmt =  AdminitradorConexion.getConnection().prepareStatement(query);
		
		preparedStmt.setString(1, usuario.getNombre());
		preparedStmt.setString(2,  usuario.getContrasenia()); 
		preparedStmt.setString(3,usuario.getApellido());
		preparedStmt.setString(4,usuario.getMail());
	
		// execute the preparedstatement.
		boolean devolucion = !preparedStmt.execute();

		// close the connection.
		 AdminitradorConexion.getConnection().close();
		
		return devolucion;
	}

}
