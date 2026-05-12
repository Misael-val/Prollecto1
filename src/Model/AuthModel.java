package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AuthModel {

    Conexion conexionBD = new Conexion();

    // REGISTRO
    public boolean registro(String usuario, String password, String nombre) {

        try {

            Connection conexion = conexionBD.conectar();

            String sql = "INSERT INTO usuarios (username, password, nombre_completo) VALUES (?, ?, ?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, nombre);

            int filas = ps.executeUpdate();

            conexion.close();

            return filas > 0;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;
        }
    }

    public boolean login(String usuario, String password) {

        try {
        
            Connection conexion = conexionBD.conectar();

            String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean existe = rs.next();

            conexion.close();

            return existe;
            
            

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;}
    }
    
    public ArrayList<User> obtenerUsuarios() {

   	 ArrayList<User> listaUsuarios = new ArrayList<>();

   	    try {

   	        Connection conexion = conexionBD.conectar();

   	        String sql = "SELECT * FROM usuarios";

   	        PreparedStatement ps = conexion.prepareStatement(sql);

   	        ResultSet rs = ps.executeQuery();

   	        while(rs.next()) {

   	            int id = rs.getInt("id");
   	            String username = rs.getString("username");
   	            String nombre = rs.getString("nombre_completo");

   	            User usuario = new User(id, username, nombre);

   	            listaUsuarios.add(usuario);
   	        }

   	        conexion.close();

   	    } catch(Exception e) {

   	        System.out.println("Error: " + e.getMessage());
   	    }

   	    return listaUsuarios;
   	
   }
    
}