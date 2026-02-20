package Prollecto1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame{

	public ventana() {
		
		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//ventana.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(501,501));
		this.setTitle("Hola");
		this.setBackground(Color.BLACK);
		this.setLocation(200,200);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.BLACK);
		contenedor.setSize(500,500);
		contenedor.setLocation(50,50);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_loguin = new JLabel();
		title_loguin.setText("Bienvenido");
		title_loguin.setSize(200,30);
		title_loguin.setOpaque(true);
		title_loguin.setLocation(150,0);
		title_loguin.setBackground(Color.WHITE);
		title_loguin.setFont(new Font("Arial",Font.BOLD,22));
		title_loguin.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_loguin);
		
		JTextField username = new JTextField();
		username.setText("HAaAaAaAaAaAaAaAaAaAaA");
		username.setSize(300,30);
		username.setLocation(100,50);
		//username.setOpaque(true);
		//username.setBackground(Color.WHITE);
		username.setFont(new Font("Arial",Font.BOLD,22));
		username.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setSize(120,50);
		acceder.setLocation(200,400);
		contenedor.add(acceder);
		
		
		
		//////////////////////////////////////////////////
		contenedor.repaint();
		contenedor.revalidate();
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
