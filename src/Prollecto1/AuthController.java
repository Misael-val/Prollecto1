package Prollecto1;


public class AuthController {
	
	private AuthView vista;
	
	public AuthController() {
	
		vista = new AuthView();
	}
	
	public void login() {
		vista.loginView();
	}
	
	public void registro() {
		vista.registerView();
	}
	
	
	
		
}


