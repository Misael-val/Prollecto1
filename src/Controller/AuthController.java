package Controller;

import Model.AuthModel;
import View.AuthView;
import View.HomeView;
import java.util.ArrayList;
import Model.User;

public class AuthController {

	    private AuthView vista;
	    private AuthModel modelo;
	    private HomeView casa;
	    

	    public AuthController() {
	        vista = new AuthView();
	        modelo = new AuthModel();
	        casa = new HomeView();
	    }
	    
	    public void login() {
	        vista.loginView(this);
	    }

	    public void registroVista() {
	        vista.registerView(this);
	    }
	    
	    public void Home() {
	        casa.showHome(this);
	    }
	    
	    public ArrayList<User> obtenerUsuarios() {

	        return modelo.obtenerUsuarios();
	    }
	    
	    public boolean registrarUsuario(User u) {

	        return modelo.registrarUsuario(u);
	    }
	    
	    public void registrarUsuario(String nombre,
                String apellido,
                String correo,
                String password,
                String telefono) {

		boolean registrado = modelo.registro(
				nombre,
				apellido,
				correo,
				password,
				telefono
				);
		
		if(registrado) {
		
		System.out.println("Usuario registrado");
		
		} else {
		
		System.out.println("Error al registrar");
		}
	}
	    
	    public boolean loginUsuario(String user, String password) {

	        return modelo.login(user, password);
	    }
}


