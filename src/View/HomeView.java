package View;

import java.awt.Color;
import javax.swing.JButton;
import Controller.AuthController;
import javax.swing.JFrame;

public class HomeView {
	
	public void showHome() {
		
		    JFrame ventana = new JFrame();
		    ventana.setBounds(0,0,1000,1000);
		    ventana.setLayout(null);

		    JButton verUsuarios = new JButton("VER USUARIOS");
		    verUsuarios.setBounds(100,100,200,50);
		    
		    ventana.add(verUsuarios);
		    
		    verUsuarios.addActionListener(e -> {

		        UsersView uv = new UsersView();

		        uv.mostrarUsuarios(new AuthController());
		    });

		    ventana.setVisible(true);
		}
	}	
