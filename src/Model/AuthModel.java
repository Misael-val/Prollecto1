package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AuthModel {

    Conexion conexionBD = new Conexion();

    public boolean registro(String nombre,
            String apellido,
            String correo,
            String password,
            String telefono) 
    {

		try {
		Connection conexion = conexionBD.conectar();
		
		String sql = "INSERT INTO usuarios(nombre, apellido, correo, password, telefono) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = conexion.prepareStatement(sql);
		
		ps.setString(1, nombre);
		ps.setString(2, apellido);
		ps.setString(3, correo);
		ps.setString(4, password);
		ps.setString(5, telefono);
		
		int filas = ps.executeUpdate();
		
		conexion.close();
		
		return filas > 0;
		
		} catch(Exception e) {
		
		System.out.println("Error: " + e.getMessage());
		
		return false;
	}
}
    public boolean login(String correo, String password) {

        try {
            Connection conexion = conexionBD.conectar();

            String sql = "SELECT * FROM usuarios WHERE correo = ? AND password = ?";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean existe = rs.next();

            conexion.close();

            return existe;

        }catch(Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;
        }
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
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");
                String password = rs.getString("password");


                User usuario = new User(
                    id,
                    nombre,
                    apellido,
                    correo,
                    password,
                    telefono
                );

                listaUsuarios.add(usuario);
            }

            conexion.close();

        } catch(Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return listaUsuarios;
    }
    
    public boolean registrarUsuario(User u) {

        try {

            Connection conexion = conexionBD.conectar();

            String sql = "INSERT INTO usuarios(nombre, apellido, correo, password, telefono) VALUES(?,?,?,?,?)";

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCorreo());
            ps.setString(4, u.getPassword());
            ps.setString(5, u.getTelefono());

            int filas = ps.executeUpdate();

            conexion.close();

            return filas > 0;

        } catch(Exception e) {

            System.out.println(e.getMessage());

            return false;
        }
    }
}