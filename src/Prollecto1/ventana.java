package Prollecto1;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class ventana extends JFrame{

	public ventana() {
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//ventana.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(300,300));
		this.setMaximumSize(new Dimension(501,501));
		this.setTitle("Hola");
		this.setBackground(Color.BLACK);
		this.setLocation(500,200);
	}


}
