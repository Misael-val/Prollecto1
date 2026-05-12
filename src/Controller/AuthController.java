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
	        casa.showHome();
	    }
	    
	    public ArrayList<User> obtenerUsuarios() {

	        return modelo.obtenerUsuarios();
	    }
	    
	    public void registrarUsuario(String user, String password, String nombre) {

	        if(user.equals("") || user.length() < 6) {
	            System.out.println("Usuario invalido");
	            return;
	        }

	        if(password.length() < 6) {
	            System.out.println("Contraseña invalida");
	            return;
	        }

	        boolean registrado = modelo.registro(user, password, nombre);

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


