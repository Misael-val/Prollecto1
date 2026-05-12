package Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

	private static final String URL = "jdbc:mysql://localhost:3306/login_sistema";
	private static final String USER = "root";
    private static final String PASSWORD = "";

    public Connection conectar() {

        Connection conexion = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(URL, USER, PASSWORD);


        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return conexion;
    }
}

