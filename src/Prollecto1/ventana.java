package Prollecto1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ventana extends JFrame{

	public ventana() {
		
	////////////////		VENTANA		////////////////////
		
		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(600,600));
		this.setMaximumSize(new Dimension(600,600));
		this.setTitle("Inicio de sesión");
		this.setBackground(Color.BLACK);
		//this.setLocation(200,200);
		this.setLayout(null);
		
			///////////		PANEL - FONDO		////////////////////
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.LIGHT_GRAY);
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		///////////		TITULO		////////////////////
		
		JLabel title_loguin = new JLabel();
		title_loguin.setText("ACCESO REQUERIDO");
		title_loguin.setSize(400,30);
		title_loguin.setOpaque(true);
		title_loguin.setForeground(Color.black);
		title_loguin.setLocation(100,10);
		title_loguin.setBackground(Color.orange);
		title_loguin.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		title_loguin.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_loguin);
		
		
		///////////		DESCRIPCIÓN		////////////////////

		
		JLabel descripcion = new JLabel();
		descripcion.setBorder(null);
		descripcion.setText("*El inicio de sesión es requerido para ingresar*");
		descripcion.setForeground(Color.RED);
		descripcion.setBackground(null);
		descripcion.setSize(500,24);
		descripcion.setLocation(50,50);
		descripcion.setFont(new Font("Arial",Font.BOLD,18));  //Times New Roman
		descripcion.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(descripcion);
		
		///////////		NOMBRE DE USUARIO		////////////////////
		
		JLabel usernameT = new JLabel();
		usernameT.setText("NOMBRE DE USUARIO");
		usernameT.setSize(300,30);
		usernameT.setLocation(0,125);
		usernameT.setFont(new Font("Times New Roman",Font.BOLD,25));
		usernameT.setHorizontalAlignment(JLabel.CENTER);
		usernameT.setForeground(Color.black);
		usernameT.setBackground(null);
		usernameT.setBorder(null);
		contenedor.add(usernameT);
		
		JTextField username = new JTextField();
		username.setOpaque(true);
		username.setBorder(null);
		username.setOpaque(true);
		username.setBackground(Color.white);
		username.setSize(350,35);
		username.setLocation(10,165);
		username.setFont(new Font("Arial",Font.BOLD,15));
		username.setForeground(Color.black);
		username.setLayout(null);
		contenedor.add(username);
		
///////////		CONTRASELÑA SEGURA		////////////////////
		
	JLabel contraseñaT = new JLabel();
	contraseñaT.setText("CONTRASEÑA");
	contraseñaT.setSize(200,30);
	contraseñaT.setLocation(0,275);
	contraseñaT.setFont(new Font("Times New Roman",Font.BOLD,25));
	contraseñaT.setHorizontalAlignment(JLabel.CENTER);
	contraseñaT.setForeground(Color.black);
	contraseñaT.setBackground(null);
	contraseñaT.setBorder(null);
	contenedor.add(contraseñaT);
		
		
	JPasswordField contraseña = new JPasswordField();
	contraseña.setOpaque(true);
	contraseña.setFont(new Font("Arial",Font.BOLD,15));
	contraseña.setForeground(Color.black);
	contraseña.setBorder(null);
	contraseña.setOpaque(true);
	contraseña.setBackground(Color.white);
	contraseña.setSize(350,35);
	contraseña.setLocation(10,309);
	contraseña.setLayout(null);
	contenedor.add(contraseña);
	
///////////		RECORDAR CONTRASEÑA		////////////////////		
	
	JCheckBox chek = new JCheckBox();
	chek.setText("RECORDAR");
	chek.setBackground(null);
	chek.setBorder(null);
	chek.setForeground(Color.black);	
	chek.setFont(new Font("Times New Roman",Font.BOLD,14));
	chek.setBounds(10, 360, 100, 30);
	contenedor.add(chek);
	
	JLabel texto = new JLabel();
	texto.setText("¿Olvidaste tu contraseña?");
	texto.setSize(200,199);
	texto.setLocation(125,275);
	texto.setFont(new Font("Times New Roman",Font.BOLD,14));
	texto.setHorizontalAlignment(JLabel.CENTER);
	texto.setForeground(Color.black);
	texto.setBackground(Color.red);
	contenedor.add(texto);
	
	JCheckBox mostrar = new JCheckBox();
	mostrar.setText("Mostrar");
	mostrar.setBackground(null);
	mostrar.setBorder(null);
	mostrar.setForeground(Color.black);	
	mostrar.setFont(new Font("Times New Roman",Font.BOLD,14));
	mostrar.setBounds(370, 309, 100, 30);
	contenedor.add(mostrar);
	
		
		
		
		
		
///////////		BOTON DE ACCEDER		////////////////////		

		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setFont(new Font("Arial",Font.BOLD,25));
		acceder.setForeground(Color.black);
		acceder.setSize(200,100);
		acceder.setLocation(200,425);
		acceder.setBackground(Color.white);
		acceder.setBorder(null);

		contenedor.add(acceder);
		
		
		
		
		//////////////////////////////////////////////////
		contenedor.repaint();
		contenedor.revalidate();
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
