package Prollecto1;


public class AuthController {

	    private AuthView vista;
	    private AuthModel modelo;

	    public AuthController() {
	        vista = new AuthView();
	        modelo = new AuthModel();
	    }

	    public void login() {
	        vista.loginView(this);
	    }

	    public void registroVista() {
	        vista.registerView(this);
	    }
	   
	    public void registrarUsuario(String user, String bio, String colonia) {

	        if(user.equals("") || user.length() < 6) {
	            System.out.println("Usuario inválido");
	            return;
	        }

	        if(bio.equals("")) {
	            System.out.println("Bio vacía");
	            return;
	        }

	        modelo.registro(user, bio, colonia);
	    }
}


