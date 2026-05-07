package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AuthModel {
	
	Conexion conexionBD = new Conexion();
	
	public boolean registro(String usuario, String password, String nombre) {

	    try {

	        Connection conexion = conexionBD.conectar();

	        String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";

	        PreparedStatement ps = conexion.prepareStatement(sql);

	        ps.setString(1, usuario);
	        ps.setString(2, password);
	        ps.setString(3, nombre);

	        int filas = ps.executeUpdate();

	        if(filas > 0) {

	            System.out.println("Registro exitoso");
	        }
	        conexion.close();

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error: " + e.getMessage());

	        return false;
	    }
	}
}