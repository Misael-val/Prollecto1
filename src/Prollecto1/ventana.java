package Prollecto1;

import java.awt.*;
import javax.swing.*;

public class ventana extends JFrame{

	
	public ventana() {
		
	////////////////		VENTANA		////////////////////
		
		this.setSize(600,600); //615,630);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(600,600));
		this.setMaximumSize(new Dimension(600,600));
		this.setTitle("INICIO DE SECION");
		this.setBackground(Color.BLACK);
		this.setLocation(500,40);
		this.setLayout(null);
		
		ImageIcon logoventana = new ImageIcon("logoventana.png");
		this.setIconImage(logoventana.getImage());

		
		JMenuBar barra = new JMenuBar();

		JMenu archivo = new JMenu("ARCHIVO");
		
		JMenuItem open = new JMenuItem("ABRIR");
		JMenuItem close = new JMenuItem("CERRAR");
		JMenuItem save = new JMenuItem("GURDAR");
		JMenuItem newfile = new JMenuItem("NUEVO");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newfile);
		
		barra.add(archivo);
		
		JMenu submenu = new JMenu("Otro");
		
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("un objeto en el submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Otro objeto");
		
		submenu.add(menuItem);
		archivo.add(submenu);
		
		
		this.login();
		//this.registro();
		//this.users();
		//this.calculadora();
		//this.setJMenuBar(barra);
		//this.prueva();
		
		this.setVisible(true);
	}
	
	public void prueva() {
		
		
		JLabel operacion = new JLabel("500");
		operacion.setSize(300,400);
		operacion.setOpaque(true);
		operacion.setForeground(Color.black);
		operacion.setLocation(100,10);
		operacion.setBackground(Color.white);
		operacion.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		operacion.setHorizontalAlignment(JLabel.CENTER);
		
		
		GridLayout botones = new GridLayout(4,5,5,5);
		
		JPanel botonesP = new JPanel(botones);
		botonesP.setSize(600,500);
		botonesP.setLocation(100,50);
		botonesP.setBackground(null);
		

		
		JPanel operadores = new JPanel();
		operadores.setSize(1000,500);
		operadores.setLocation(100,50);
		operadores.setBackground(null);
		operadores.setLayout(new GridLayout(0,1,5,5));


		JPanel barra = new JPanel();
		barra.setSize(40,30);
		barra.setLocation(0,50);
		barra.setBackground(null);
		barra.setLayout(new GridLayout(0,1,5,5));
		
		barra.add(new JButton("MC"));
		barra.add(new JButton("M*"));
		barra.add(new JButton("/"));
		barra.add(new JButton("*"));
		
		botonesP.add(new JButton("7"));
		botonesP.add(new JButton("8"));
		botonesP.add(new JButton("9"));
		botonesP.add(new JButton("4"));
		botonesP.add(new JButton("5"));
		botonesP.add(new JButton("6"));
		botonesP.add(new JButton("1"));
		botonesP.add(new JButton("2"));
		botonesP.add(new JButton("3"));
		botonesP.add(new JButton("0"));
		botonesP.add(new JButton("."));
		botonesP.add(new JButton("="));
		
		operadores.add(new JButton("<---"));
		operadores.add(new JButton("-"));
		operadores.add(new JButton("+"));
		operadores.add(new JButton("="));
		
		
		JPanel interfas = new JPanel();
		interfas.setSize(400,700);
		interfas.setLocation(100,20);
		interfas.setLayout( new BorderLayout());
		interfas.setBackground(Color.orange);
		
		interfas.add(botonesP, BorderLayout.CENTER);
		interfas.add(operacion, BorderLayout.NORTH);
		interfas.add(operadores, BorderLayout.EAST);
		interfas.add(barra, BorderLayout.WEST);
		botonesP.repaint();

		this.add(interfas);
		
		
		
	}
	
	public void login()
	{
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.decode("#C39AF5"));
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		
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
		
		contenedor.repaint();
		contenedor.revalidate();
	
	}
	
	public void registro()
	{
	////////// REGISTRO CLASE //////
		
		JPanel registroContenedor = new JPanel();
		registroContenedor.setSize(600,600);
		registroContenedor.setLocation(601,0);
		registroContenedor.setOpaque(true);
		registroContenedor.setBackground(Color.decode("#B29CD6"));
		registroContenedor.setLayout(null);
		this.add(registroContenedor);
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
		
		
		ButtonGroup termi = new ButtonGroup();
		termi.add(asepto);
		termi.add(Nasepto);
		
		String [] colonias = {"Camino real","La fuente", "Las americas"};
		
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

		registroContenedor.add(crearcuenta);
		
		registroContenedor.repaint();	
			
	
	}
	
	public void users()
	{
		
		JPanel user = new JPanel();
		user.setSize(1000,500);
		user.setLocation(100,50);
		user.setLayout(null);
		user.setBackground(Color.decode("#7CD6B7"));
		this.add(user);
		
		JLabel usertitulo = new JLabel();
		usertitulo.setText(" USUARIOS");
		usertitulo.setSize(155,50);
		usertitulo.setOpaque(true);
		usertitulo.setForeground(Color.black);
		usertitulo.setLocation(400,50);
		usertitulo.setBackground(Color.decode("#EBC023"));
		usertitulo.setFont(new Font("Arial",Font.BOLD,20)); //Times New Roman
		user.add(usertitulo);
		
		JButton exportar = new JButton("EXPORTAR");
		exportar.setBounds(30,120,120,40);
		user.add(exportar);
		
		JButton importar = new JButton("IMPORTAR");
		importar.setBounds(160,120,120,40);
		user.add(importar);
		
		String [] tabla_head = { "No.contro", "Nombre","Apellido",
				                 "Semestre","Promedio","Acciones"};
		
		String [] [] tabla_contend = {
									 {"20230001","Misael","López","2°","8.7","Editar / Eliminar"},
									 {"20230002","Andrea","Martínez","4°","9.1","Editar / Eliminar"},
									 {"20230003","Carlos","Hernández","6°","7.8","Editar / Eliminar"},
									 {"20230004","Fernanda","García","1°","9.5","Editar / Eliminar"},
									 {"20230005","Luis","Ramírez","3°","8.2","Editar / Eliminar"},
									 {"20230006","Valeria","Torres","5°","9.0","Editar / Eliminar"},
									 {"20230007","Diego","Morales","7°","7.6","Editar / Eliminar"},
									 {"20230008","Sofía","Cruz","8°","9.3","Editar / Eliminar"}};
		
		JTable user_tabla = new JTable(tabla_contend,tabla_head);
		JScrollPane scrollPanel = new JScrollPane(user_tabla);
		
		scrollPanel.setSize(800,100);
		scrollPanel.setLocation(30,180);
		////
		
		user.add(scrollPanel);
		
		
		
		
		
		
		
		
		
		
		
		
		/////////////////////
		user.repaint();
		
	}
	
	public void calculadora() {
	
		////////// PANEL /////////
		
		
		JPanel panel = new JPanel();
		panel.setSize(600,600);
		panel.setLocation(0,0);
		panel.setOpaque(true);
		panel.setBackground(Color.decode("#2D3B2E"));
		panel.setLayout(null);
		this.add(panel);
		panel.repaint();
		
		///// CAJA DE RESULTADO ////
		JLabel cajaresultado = new JLabel("500.0");
		cajaresultado.setSize(570,60);
		cajaresultado.setOpaque(true);
		cajaresultado.setForeground(Color.BLACK);
		cajaresultado.setLocation(17,15);
		cajaresultado.setBackground(Color.WHITE);
		cajaresultado.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman "#e5bc34"
		cajaresultado.setHorizontalAlignment(JLabel.CENTER);
		panel.add(cajaresultado);
		
		JLabel cajaproseso = new JLabel("250.0 + 250.0");
		cajaproseso.setSize(420,60);
		cajaproseso.setOpaque(true);
		cajaproseso.setForeground(Color.BLACK);
		cajaproseso.setLocation(166,100);
		cajaproseso.setBackground(Color.WHITE);
		cajaproseso.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman "#e5bc34"
		cajaproseso.setHorizontalAlignment(JLabel.CENTER);
		panel.add(cajaproseso);
		
		//// BOTONES ///
		JButton boton7 = new JButton("7");
		boton7.setForeground(Color.WHITE);
		boton7.setBackground(Color.decode("#2A6B2A"));  
		boton7.setFont(new Font("Arial", Font.BOLD, 25));
		boton7.setBorder(null);
		
		JButton boton8 = new JButton("8");
		boton8.setForeground(Color.WHITE);
		boton8.setBackground(Color.decode("#2A6B2A"));  
		boton8.setFont(new Font("Arial", Font.BOLD, 25));
		boton8.setBorder(null);
		
		JButton boton9 = new JButton("9");
		boton9.setForeground(Color.WHITE);
		boton9.setBackground(Color.decode("#2A6B2A"));  
		boton9.setFont(new Font("Arial", Font.BOLD, 25));
		boton9.setBorder(null);
		
		JButton botondividir = new JButton("/");
		botondividir.setForeground(Color.WHITE);
		botondividir.setBackground(Color.decode("#56CC82"));  
		botondividir.setFont(new Font("Arial", Font.BOLD, 25));
		botondividir.setBorder(null);
		
		JButton boton4 = new JButton("4");
		boton4.setForeground(Color.WHITE);
		boton4.setBackground(Color.decode("#2A6B2A"));  
		boton4.setFont(new Font("Arial", Font.BOLD, 25));
		boton4.setBorder(null);
		
		JButton boton5 = new JButton("5");
		boton5.setForeground(Color.WHITE);
		boton5.setBackground(Color.decode("#2A6B2A"));  
		boton5.setFont(new Font("Arial", Font.BOLD, 25));
		boton5.setBorder(null);
		
		JButton boton6 = new JButton("6");
		boton6.setForeground(Color.WHITE);
		boton6.setBackground(Color.decode("#2A6B2A"));  
		boton6.setFont(new Font("Arial", Font.BOLD, 25));
		boton6.setBorder(null);
		
		JButton botonmulti = new JButton("X");
		botonmulti.setForeground(Color.WHITE);
		botonmulti.setBackground(Color.decode("#56CC82"));  
		botonmulti.setFont(new Font("Arial", Font.BOLD, 25));
		botonmulti.setBorder(null);
		
		JButton boton1 = new JButton("1");
		boton1.setForeground(Color.WHITE);
		boton1.setBackground(Color.decode("#2A6B2A"));  
		boton1.setFont(new Font("Arial", Font.BOLD, 25));
		boton1.setBorder(null);
		
		JButton boton2 = new JButton("2");
		boton2.setForeground(Color.WHITE);
		boton2.setBackground(Color.decode("#2A6B2A"));  
		boton2.setFont(new Font("Arial", Font.BOLD, 25));
		boton2.setBorder(null);
		
		JButton boton3 = new JButton("3");
		boton3.setForeground(Color.WHITE);
		boton3.setBackground(Color.decode("#2A6B2A"));  
		boton3.setFont(new Font("Arial", Font.BOLD, 25));
		boton3.setBorder(null);
		
		JButton botonres = new JButton("-");
		botonres.setForeground(Color.WHITE);
		botonres.setBackground(Color.decode("#56CC82"));  
		botonres.setFont(new Font("Arial", Font.BOLD, 25));
		botonres.setBorder(null);
		
		JButton boton0 = new JButton("0");
		boton0.setForeground(Color.WHITE);
		boton0.setBackground(Color.decode("#2A6B2A"));  
		boton0.setFont(new Font("Arial", Font.BOLD, 25));
		boton0.setBorder(null);
		
		JButton botopunto = new JButton(".");
		botopunto.setForeground(Color.WHITE);
		botopunto.setBackground(Color.decode("#56CC82"));  
		botopunto.setFont(new Font("Arial", Font.BOLD, 25));
		botopunto.setBorder(null);
		
		JButton botonigual = new JButton("=");
		botonigual.setForeground(Color.WHITE);
		botonigual.setBackground(Color.decode("#56CC82"));  
		botonigual.setFont(new Font("Arial", Font.BOLD, 25));
		botonigual.setBorder(null);
		
		JButton botonmas = new JButton("+");
		botonmas.setForeground(Color.WHITE);
		botonmas.setBackground(Color.decode("#56CC82"));  
		botonmas.setFont(new Font("Arial", Font.BOLD, 25));
		botonmas.setBorder(null);
		
		
		JButton botoncanselar = new JButton("CE");
		botoncanselar.setForeground(Color.WHITE);
		botoncanselar.setBackground(Color.decode("#56CC82"));  
		botoncanselar.setFont(new Font("Arial", Font.BOLD, 25));
		botoncanselar.setSize(130,60);
		botoncanselar.setLocation(17,100);
		botoncanselar.setBorder(null);
		panel.add(botoncanselar);

		
		/////// PANEL DE BOTONES /////
		
		GridLayout botones = new GridLayout(4,5,20,25);

		JPanel panelbot = new JPanel(botones);
		
		panelbot.setSize(570,400);
		panelbot.setLocation(17,180);
		panelbot.setOpaque(true);
		panelbot.setBackground(null);
		panelbot.add(boton7);
		panelbot.add(boton8);
		panelbot.add(boton9);
		panelbot.add(botondividir);
		panelbot.add(boton4);
		panelbot.add(boton5);
		panelbot.add(boton6);
		panelbot.add(botonmulti);
		panelbot.add(boton1);
		panelbot.add(boton2);
		panelbot.add(boton3);
		panelbot.add(botonres);
		panelbot.add(botonmas);
		panelbot.add(boton0);
		panelbot.add(botopunto);
		panelbot.add(botonigual);
		panelbot.add(botonigual);
		
		panel.add(panelbot);
		panelbot.repaint();
		
	}





}

