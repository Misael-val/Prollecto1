package Prollecto1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AuthView {
	
	
	public void loginView() {
		
		JFrame ventana = new JFrame();
		ventana.setSize(615,640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(600,600));
		ventana.setMaximumSize(new Dimension(600,600));
		ventana.setBackground(Color.CYAN);
		ventana.setLocation(300,50);
		ventana.setLayout(null);
		
		
	
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.decode("#C39AF5"));
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		ventana.add(contenedor);
		
		
		///////////		TITULO		////////////////////
		
		JLabel title_loguin = new JLabel("ACCESO REQUERIDO");
		title_loguin.setSize(400,30);
		title_loguin.setOpaque(true);
		title_loguin.setForeground(Color.black);
		title_loguin.setLocation(100,10);
		title_loguin.setBackground(Color.decode("#e5bc34"));
		title_loguin.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		title_loguin.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_loguin);
		
		
		///////////		DESCRIPCIÓN		////////////////////

		
		JLabel descripcion = new JLabel("*El inicio de sesión es requerido para ingresar*");
		descripcion.setForeground(Color.RED);
		descripcion.setBorder(null);

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
		usernameT.setLocation(72,125);
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
		username.setLocation(75,165);
		username.setFont(new Font("Arial",Font.BOLD,15));
		username.setForeground(Color.black);
		username.setLayout(null);
		contenedor.add(username);
		
		
		ImageIcon imagen = new ImageIcon("usuario.png");
		JLabel persona = new JLabel();
		persona.setBounds(5, 140, 75, 75);
		persona.setIcon(new ImageIcon (imagen.getImage().getScaledInstance(imagen.getIconWidth(),imagen.getIconHeight(),Image.SCALE_SMOOTH)));
		contenedor.add(persona);
		
		
		
		
///////////		CONTRASELÑA SEGURA		////////////////////
		
	JLabel contraseñaT = new JLabel();
	contraseñaT.setText("CONTRASEÑA");
	contraseñaT.setSize(200,30);
	contraseñaT.setLocation(75,275);
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
	contraseña.setLocation(75,309);
	contraseña.setLayout(null);
	contenedor.add(contraseña);
	
	
	ImageIcon imagen1 = new ImageIcon("contraseña.png");
	JLabel candado = new JLabel();
	candado.setBounds(5, 275, 75, 75);
	candado.setIcon(new ImageIcon (imagen1.getImage().getScaledInstance(imagen1.getIconWidth(),imagen1.getIconHeight(),Image.SCALE_SMOOTH)));
	contenedor.add(candado);

	
	///////////		RECORDAR CONTRASEÑA		////////////////////		
	
	JCheckBox chek = new JCheckBox();
	chek.setText("RECORDAR");
	chek.setBackground(null);
	chek.setBorder(null);
	chek.setForeground(Color.black);	
	chek.setFont(new Font("Times New Roman",Font.ITALIC,14));
	chek.setBounds(75, 345, 100, 30);
	contenedor.add(chek);
	
	JLabel texto = new JLabel();
	texto.setText("¿Olvidaste tu contraseña?");
	texto.setSize(195,199);
	texto.setLocation(251,260);
	texto.setFont(new Font("Times New Roman",Font.ITALIC,14));
	texto.setHorizontalAlignment(JLabel.CENTER);
	texto.setForeground(Color.BLUE);
	contenedor.add(texto);
	
	JCheckBox mostrar = new JCheckBox();
	mostrar.setText("Mostrar");
	mostrar.setBackground(null);
	mostrar.setBorder(null);
	mostrar.setForeground(Color.black);	
	mostrar.setFont(new Font("Times New Roman",Font.ITALIC,14));
	mostrar.setBounds(430, 310, 100, 30);
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
		
		// bordes
		acceder.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {

		        String user = username.getText();
		        String pass = new String(contraseña.getPassword());

		        boolean userValido = true;
		        boolean passValido = true;

		        if(user.equals("") || user.contains(" ")) {
		            username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            userValido = false;
		        } else {
		            username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }

		        if(pass.length() < 6 || pass.contains(" ")) {
		            contraseña.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            passValido = false;
		        } else {
		            contraseña.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }

		        if(userValido && passValido) {

		            JOptionPane.showMessageDialog(null,
		                "Bienvenido ",
		                "Aprobado",
		                JOptionPane.PLAIN_MESSAGE);

		        } else {

		            JOptionPane.showMessageDialog(null,
		                "Datos incorrectos",
		                "Error",
		                JOptionPane.PLAIN_MESSAGE);
		        }
		    }
		});	
		
		JButton registro = new JButton("¿No tines cuenta?");
		registro.setFont(new Font("Arial",Font.BOLD,15));
		registro.setSize(150,40);
		registro.setLocation(40,460);
		registro.setBackground(Color.white);
		registro.setBorder(null);
	
		registro.addActionListener(e->{
//			this.router("registro");
			ventana.dispose();
			registerView();
			});
		
		JButton recuperar = new JButton("Recuperar cuenta");
		recuperar.setFont(new Font("Arial",Font.BOLD,15));
		recuperar.setSize(150,40);
		recuperar.setLocation(420,460);
		recuperar.setBackground(Color.white);
		recuperar.setBorder(null);
	
		recuperar.addActionListener(e->{
	//		this.router("rcuenta");
			});
		
		contenedor.add(registro);
		contenedor.add(recuperar);
		
		contenedor.repaint();
		contenedor.revalidate();
		
		ventana.setVisible(true);
		
	}
	public void registerView() {
		
		JFrame ventana = new JFrame();
		ventana.setSize(615,640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(600,600));
		ventana.setMaximumSize(new Dimension(600,600));
		ventana.setBackground(Color.CYAN);
		ventana.setLocation(300,50);
		ventana.setLayout(null);
		
		JPanel registroContenedor = new JPanel();
		registroContenedor.setSize(600,600);
		registroContenedor.setLocation(0,0);
		registroContenedor.setOpaque(true);
		registroContenedor.setBackground(Color.decode("#B29CD6"));
		registroContenedor.setLayout(null);
		ventana.add(registroContenedor);
		registroContenedor.repaint();
		
		////// PANEL /////
		

		JLabel titulo = new JLabel("REGISTRO");
		titulo.setBounds(160,10,275,40);
		titulo.setFont(new Font("Arial",Font.BOLD,25));
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setOpaque(true);
		titulo.setForeground(Color.black);
		titulo.setBackground(Color.decode("#e5bc34"));
		registroContenedor.add(titulo);
		
		
		JLabel nombreUSuarioT = new JLabel("NOMBRE DE USUARIO");
		nombreUSuarioT.setBounds(170,70,275,40);
		nombreUSuarioT.setFont(new Font("Arial",Font.BOLD,24));
		nombreUSuarioT.setHorizontalAlignment(JLabel.CENTER);
		nombreUSuarioT.setOpaque(true);
		nombreUSuarioT.setForeground(Color.black);
		nombreUSuarioT.setForeground(Color.black);
		nombreUSuarioT.setBackground(null);
		registroContenedor.add(nombreUSuarioT);
		
		JTextField nombreUSuario = new JTextField();
		nombreUSuario.setOpaque(true);
		nombreUSuario.setBorder(null);
		nombreUSuario.setOpaque(true);
		nombreUSuario.setBackground(Color.white);
		nombreUSuario.setBounds(100,110,400,40);
		nombreUSuario.setFont(new Font("Arial",Font.BOLD,18));
		nombreUSuario.setForeground(Color.black);
		nombreUSuario.setLayout(null);
		registroContenedor.add(nombreUSuario);
		
		//// BIOGRAFiA ////
		
		JLabel biografiat = new JLabel("BIOGRAFÍA");
		biografiat.setBounds(170,155,275,40);
		biografiat.setFont(new Font("Arial",Font.BOLD,24));
		biografiat.setHorizontalAlignment(JLabel.CENTER);
		biografiat.setOpaque(true);
		biografiat.setForeground(Color.black);
		biografiat.setBackground(null);
		registroContenedor.add(biografiat);
		
		
		JTextArea bioE = new JTextArea();
		bioE.setBounds(100,200,400,75);
		bioE.setFont(new Font("Arial",Font.BOLD,12));
		bioE.setForeground(Color.black);
		registroContenedor.add(bioE);
		
		/// PREFERENCIAS ///
		JLabel preferencias = new JLabel("PREFERENCIAS");
		preferencias.setBounds(170,280,275,40);
		preferencias.setFont(new Font("Arial",Font.BOLD,24));
		preferencias.setHorizontalAlignment(JLabel.CENTER);
		preferencias.setOpaque(true);
		preferencias.setForeground(Color.black);
		preferencias.setBackground(null);
		registroContenedor.add(preferencias);
		
		JCheckBox sweet = new JCheckBox("Dulce");
		sweet.setBounds(100,320,70,40);
		sweet.setFont(new Font("Times New Roman",Font.BOLD,15));
		sweet.setForeground(Color.black);
		sweet.setBackground(null);
		registroContenedor.add(sweet);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(250,320,100,40);
		salado.setFont(new Font("Times New Roman",Font.BOLD,15));
		salado.setForeground(Color.black);
		salado.setBackground(null);
		registroContenedor.add(salado);
	
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(400,320,100,40);
		saludable.setFont(new Font("Times New Roman",Font.BOLD,15));
		saludable.setForeground(Color.black);
		saludable.setBackground(null);
		//saludable.setBorderPainted(true); //
		//saludable.setBorder(BorderFactory.createLineBorder(Color.red));// para poner el marco 
		registroContenedor.add(saludable);
		
		//// TERMINOS ////
		
		JLabel terminosT = new JLabel("  TÉRMINOS");
		terminosT.setBounds(100,370,400,30);
		terminosT.setFont(new Font("Arial",Font.BOLD,24));
		terminosT.setHorizontalAlignment(JLabel.CENTER);
		terminosT.setOpaque(true);
		terminosT.setForeground(Color.black);
		terminosT.setBackground(Color.decode("#e5bc34"));
		registroContenedor.add(terminosT);
		
	
		JRadioButton asepto = new JRadioButton("Asepto");
		asepto.setBounds(145,400,100,30);
		asepto.setForeground(Color.black);
		asepto.setFont(new Font("Times New Roman",Font.BOLD,14));
		asepto.setBackground(null);
		registroContenedor.add(asepto);
		
		JRadioButton Nasepto = new JRadioButton("No asepto");
		Nasepto.setBounds(370,400,100,30);
		Nasepto.setForeground(Color.black);
		Nasepto.setFont(new Font("Times New Roman",Font.BOLD,14));
		Nasepto.setBackground(null);
		registroContenedor.add(Nasepto);
		
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(asepto);
		grupo.add(Nasepto);
		
		String [] colonias = {"No espesificado","Camino real","La fuente", "Las americas"};
		
		JComboBox lista = new JComboBox(colonias);
		lista.setBounds(100,440,400,30);
		lista.setForeground(Color.black);
		lista.setFont(new Font("Times New Roman",Font.BOLD,14));
		registroContenedor.add(lista);
		
		JButton crearcuenta = new JButton("CREAR CUENTA");
		
		crearcuenta.setFont(new Font("Arial",Font.BOLD,25));
		crearcuenta.setForeground(Color.black);
		crearcuenta.setSize(230,80);
		crearcuenta.setLocation(200,490);
		crearcuenta.setBackground(Color.white);
		crearcuenta.setBorder(null);

		
		crearcuenta.addActionListener(new ActionListener() {

			// contornos de selecciones
		    @Override
		    public void actionPerformed(ActionEvent e) {

		        String username_val = nombreUSuario.getText();

		        if(username_val.equals("") || username_val.contains(" ")|| username_val.length() < 6) {
		            nombreUSuario.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		        } else {
		            nombreUSuario.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }


		        String bio_val = bioE.getText();

		        if(bio_val.equals("")){
		            bioE.setBorder(BorderFactory.createLineBorder(Color.RED,3,true)); 
		        }
		        else {
		            bioE.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }

		       
		        if(!sweet.isSelected() && !salado.isSelected() && !saludable.isSelected()) {

		            sweet.setForeground(Color.red);
		            salado.setForeground(Color.red);
		            saludable.setForeground(Color.red);

		        } else {

		            sweet.setForeground(Color.green);
		            salado.setForeground(Color.green);
		            saludable.setForeground(Color.green);
		        }

		        if(!asepto.isSelected()) {
		            asepto.setForeground(Color.red);
		            Nasepto.setForeground(Color.red);
		        } else {
		            asepto.setForeground(Color.green);
		            Nasepto.setForeground(Color.green);
		        
		        }

		        
		        if(lista.getSelectedIndex() == 0) {
		            lista.setBorder(BorderFactory.createLineBorder(Color.red,2));
		        } else {
		            lista.setBorder(BorderFactory.createLineBorder(Color.green,2));
		        }

		    }
		});
		
		//regresar
		JButton regresar = new JButton("REGRESAR");
		regresar.setFont(new Font("Arial",Font.BOLD,15));
		regresar.setSize(150,40);
		regresar.setLocation(40,520);
		regresar.setBackground(Color.white);
		regresar.setBorder(null);

		regresar.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
	//	        router("login");
		    	ventana.dispose();
		    	loginView();
		    }
		});

		registroContenedor.add(regresar);
		
		
		

		registroContenedor.add(crearcuenta);
		
		registroContenedor.repaint();	
		
		ventana.setVisible(true);
			
	}
		
	}
		


