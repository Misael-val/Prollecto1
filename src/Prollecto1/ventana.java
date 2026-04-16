package Prollecto1;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ventana extends JFrame{

	
	public ventana() {
		
	////////////////		VENTANA		////////////////////
		
		this.setSize(615,640);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(600,600));
		this.setMaximumSize(new Dimension(600,600));
		//this.setTitle("INICIO DE SECION");
		this.setBackground(Color.CYAN);
		this.setLocation(300,50);
		this.setLayout(null);
		
		
		//this.router("login");
		
		
		ImageIcon logoventana = new ImageIcon("logoventana.png");
		//this.setIconImage(logoventana.getImage());

		
		//archivo.add(submenu);
		
		
		//this.examen();
		
		this.juego3();
		//this.registro();
		//this.users();
		//this.calculadora();
		//this.prueva();
		//this.pintar();
		//this.menu();
		this.setVisible(true);
	}
	
	public void juego3() {
	
		JPanel contenedor = new JPanel();
		contenedor.setSize(600,600);
	    contenedor.setLocation(0,0);
	    contenedor.setBackground(Color.decode("#C39AF6"));
	    contenedor.setLayout(new GridLayout(3,3,5,5));

	    setFont(new Font("Arial",Font.BOLD,60));

	    JButton boton1 = new JButton("");
	    boton1.setFont(new Font("Arial",Font.BOLD,60));
	    boton1.setBackground(Color.white);
	    boton1.setForeground(Color.black);
	    boton1.setBorder(null);

	    JButton boton2 = new JButton("");
	    boton2.setFont(new Font("Arial",Font.BOLD,60));
	    boton2.setBackground(Color.white);
	    boton2.setForeground(Color.black);
	    boton2.setBorder(null);

	    JButton boton3 = new JButton("");
	    boton3.setFont(new Font("Arial",Font.BOLD,60));
	    boton3.setBackground(Color.white);
	    boton3.setForeground(Color.black);
	    boton3.setBorder(null);

	    JButton boton4 = new JButton("");
	    boton4.setFont(new Font("Arial",Font.BOLD,60));
	    boton4.setBackground(Color.white);
	    boton4.setForeground(Color.black);
	    boton4.setBorder(null);

	    JButton boton5 = new JButton("");
	    boton5.setFont(new Font("Arial",Font.BOLD,60));
	    boton5.setBackground(Color.white);
	    boton5.setForeground(Color.black);
	    boton5.setBorder(null);

	    JButton boton6 = new JButton("");
	    boton6.setFont(new Font("Arial",Font.BOLD,60));
	    boton6.setBackground(Color.white);
	    boton6.setForeground(Color.black);
	    boton6.setBorder(null);

	    JButton boton7 = new JButton("");
	    boton7.setFont(new Font("Arial",Font.BOLD,60));
	    boton7.setBackground(Color.white);
	    boton7.setForeground(Color.black);
	    boton7.setBorder(null);

	    JButton boton8 = new JButton("");
	    boton8.setFont(new Font("Arial",Font.BOLD,60));
	    boton8.setBackground(Color.white);
	    boton8.setForeground(Color.black);
	    boton8.setBorder(null);

	    JButton boton9 = new JButton("");
	    boton9.setFont(new Font("Arial",Font.BOLD,60));
	    boton9.setBackground(Color.white);
	    boton9.setForeground(Color.black);
	    boton9.setBorder(null);

	    contenedor.add(boton1);
	    contenedor.add(boton2);
	    contenedor.add(boton3);
	    contenedor.add(boton4);
	    contenedor.add(boton5);
	    contenedor.add(boton6);
	    contenedor.add(boton7);
	    contenedor.add(boton8);
	    contenedor.add(boton9);
	   
	    this.add(contenedor);

	    contenedor.repaint();
	    contenedor.revalidate();	    
	    
	}
		

	public void menu() {
		JMenuBar barra = new JMenuBar();
		
		JMenu cuenta = new JMenu("CUENTA");
		JMenuItem logein = new JMenuItem("LOGIN");		
		JMenuItem registro = new JMenuItem("REGISTRO");
		JMenuItem rcuenta = new JMenuItem("RECUPERAR CUENTA");
		
		JMenu usuario = new JMenu("USUARIO");
		JMenuItem alta = new JMenuItem("ALTA");		
		JMenuItem baja = new JMenuItem("BAJA");
		JMenuItem consultar = new JMenuItem("CONSULTAR");
		
		JMenu ayuda = new JMenu("AYUDA");
		JMenuItem como = new JMenuItem("¿Cómo crear un usuario?");		
		JMenuItem como1 = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem que = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		
		cuenta.add(logein);
		cuenta.add(registro);
		cuenta.add(rcuenta);
		usuario.add(alta);
		//usuario.add(baja);
		usuario.add(consultar);
		ayuda.add(como);
		ayuda.add(como1);
		ayuda.add(que);
		barra.add(cuenta);
		barra.add(usuario);
		barra.add(ayuda);

		//cuenta
		logein.addActionListener(e->{
			this.router("login");
			});
		
		registro.addActionListener(e->{
			this.router("registro");
			});
		rcuenta.addActionListener(e->{
			this.router("rcuenta");
			});
		//usuario
		alta.addActionListener(e->{
			this.router("alta");
			});
		baja.addActionListener(e->{
			this.router("baja");
			});
		consultar.addActionListener(e->{
			this.router("consultar");
			});
		
		// ayuda
		como.addActionListener(e->{
			this.router("como");
			});
		como1.addActionListener(e->{
			this.router("como1");
			});
		que.addActionListener(e->{
			this.router("que");
			});
		
		
		this.setJMenuBar(barra);
		}		

	public void consultar() {
		
	JPanel contenedor = new JPanel();
    contenedor.setBackground(Color.decode("#C39AF6"));
    contenedor.setSize(600,600);
    contenedor.setLayout(null);
    this.add(contenedor);

    JLabel titulo = new JLabel("CONSULTAR USUARIOS");
    titulo.setBounds(150,20,300,30);
    titulo.setOpaque(true);
    titulo.setForeground(Color.black);
    titulo.setBackground(Color.decode("#e5bc34"));
    titulo.setFont(new Font("Arial",Font.BOLD,24));
    titulo.setHorizontalAlignment(JLabel.CENTER);
    contenedor.add(titulo);


    JLabel buscarT = new JLabel("Usuario:");
    buscarT.setBounds(50,90,120,30);
    buscarT.setOpaque(true);
    buscarT.setForeground(Color.black);
    buscarT.setBackground(null);
    buscarT.setFont(new Font("Arial",Font.BOLD,24));
    buscarT.setHorizontalAlignment(JLabel.CENTER);
    contenedor.add(buscarT);


    JTextField buscar = new JTextField();
    buscar.setBounds(200,90,200,30);
    buscar.setOpaque(true);
    buscar.setBorder(null);
    buscar.setBackground(Color.white);
    buscar.setFont(new Font("Arial",Font.BOLD,15));
    buscar.setForeground(Color.black);
    contenedor.add(buscar);


    JButton botonBuscar = new JButton("Buscar");
    botonBuscar.setBounds(420,90,120,30);
    botonBuscar.setFont(new Font("Arial",Font.BOLD,15));
    botonBuscar.setBackground(Color.white);
    botonBuscar.setBorder(null);
    contenedor.add(botonBuscar);


    String columnas[] = {"Numero","Nombre","Usuario","Acciones"};

    String datos[][] = {
        {"13","Juan","pauneitor23","Editar / Eliminar"},
        {"24","Ana","animilio10","Editar / Eliminar"},
        {"35","Luis","sejo55","Editar / Eliminar"}
    };

    JTable tabla = new JTable(datos,columnas);
    tabla.setFont(new Font("Arial",Font.BOLD,14));
    tabla.setRowHeight(25);

    JScrollPane scroll = new JScrollPane(tabla);
    scroll.setBounds(50,160,500,100);
    contenedor.add(scroll);


    JButton editar = new JButton("Editar");
    editar.setBounds(150,290,120,40);
    editar.setFont(new Font("Arial",Font.BOLD,15));
    editar.setBackground(Color.white);
    editar.setBorder(null);
    contenedor.add(editar);


    JButton eliminar = new JButton("Eliminar");
    eliminar.setBounds(320,290,120,40);
    eliminar.setFont(new Font("Arial",Font.BOLD,15));
    eliminar.setBackground(Color.white);
    eliminar.setBorder(null);
    contenedor.add(eliminar);


    JButton regresar = new JButton("Regresar");
    regresar.setBounds(40,500,120,40);
    regresar.setFont(new Font("Arial",Font.BOLD,15));
    regresar.setBackground(Color.white);
    regresar.setBorder(null);

    regresar.addActionListener(e->{
        this.router("login");
    });

    contenedor.add(regresar);

    contenedor.repaint();
    contenedor.revalidate();
		}
	
	
	public void baja() {
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.decode("#C39AF6"));
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_loguin = new JLabel("BAJAN");
		title_loguin.setSize(400,30);
		title_loguin.setOpaque(true);
		title_loguin.setForeground(Color.black);
		title_loguin.setLocation(100,10);
		title_loguin.setBackground(Color.decode("#e5bc34"));
		title_loguin.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		title_loguin.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_loguin);
		
				
		JButton registro = new JButton("regresar");
		registro.setFont(new Font("Arial",Font.BOLD,15));
		registro.setSize(150,40);
		registro.setLocation(40,460);
		registro.setBackground(Color.white);
		registro.setBorder(null);

		registro.addActionListener(e->{
			this.router("login");
			});
		
		contenedor.add(registro);
		
		contenedor.repaint();
		contenedor.revalidate();

	}
	
public void alta() {
	

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#C39AF6"));
	    contenedor.setSize(600,600);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("Alta de usuario");
	    titulo.setBounds(150,20,300,30);
	    titulo.setOpaque(true);
	    titulo.setForeground(Color.black);
		titulo.setBackground(Color.decode("#e5bc34"));
		titulo.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JLabel nombreT = new JLabel("Correo:");
	    nombreT.setBounds(48,100,100,25);
	    nombreT.setOpaque(true);
	    nombreT.setForeground(Color.black);
	    nombreT.setBackground(null);
	    nombreT.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
	    nombreT.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(nombreT);

	    JTextField nombre = new JTextField();
	    nombre.setBounds(200,100,200,25);
	    nombre.setOpaque(true);
	    nombre.setBorder(null);
	    nombre.setOpaque(true);
	    nombre.setBackground(Color.white);
	    nombre.setFont(new Font("Arial",Font.BOLD,15));
	    nombre.setForeground(Color.black);
	    nombre.setLayout(null);
	    contenedor.add(nombre);

	    JLabel usuarioT = new JLabel("Usuario:");
	    usuarioT.setBounds(50,150,100,25);
	    usuarioT.setOpaque(true);
	    usuarioT.setForeground(Color.black);
	    usuarioT.setBackground(null);
	    usuarioT.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
	    usuarioT.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(usuarioT);

	    JTextField usuario = new JTextField();
	    usuario.setBounds(200,150,200,25);
	    usuario.setOpaque(true);
	    usuario.setBorder(null);
	    usuario.setOpaque(true);
	    usuario.setBackground(Color.white);
	    usuario.setFont(new Font("Arial",Font.BOLD,15));
	    usuario.setForeground(Color.black);
	    usuario.setLayout(null);	    
	    contenedor.add(usuario);

	    JLabel contraT = new JLabel("Contraseña:");
	    contraT.setBounds(45,200,150,25);
	    contraT.setOpaque(true);
	    contraT.setForeground(Color.black);
	    contraT.setBackground(null);
	    contraT.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
	    contraT.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(contraT);

	    JPasswordField contra = new JPasswordField();
	    contra.setBounds(200,200,200,25);
	    contra.setOpaque(true);
	    contra.setBorder(null);
	    contra.setOpaque(true);
	    contra.setBackground(Color.white);
	    contra.setFont(new Font("Arial",Font.BOLD,15));
	    contra.setForeground(Color.black);
	    contra.setLayout(null);	
	    contenedor.add(contra);

	    JButton crear = new JButton("Dar de alta");
	    crear.setBounds(200,300,200,40);
	    crear.setFont(new Font("Arial",Font.BOLD,15));
	    crear.setBackground(Color.white);
	    crear.setBorder(null);
	    contenedor.add(crear);

	    JButton regresar = new JButton("Regresar");
	    regresar.setBounds(40,500,120,40);
	    regresar.setFont(new Font("Arial",Font.BOLD,15));
	    regresar.setBackground(Color.white);
	    regresar.setBorder(null);

	    regresar.addActionListener(e->{
	        this.router("login");
	    });
	    
		// bordes
	    crear.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {

		        String user = nombre.getText();
		        String contraseña = contra.getText();
		        String useuaruous = usuario.getText();

		        boolean userValido = true;
		        boolean passValido = true;

		        if(user.equals("")) {
		        	nombre.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            userValido = false;
		        } else {
		        	nombre.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }
		        
		        if(user.equals("")) {
		        	contra.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            userValido = false;
		        } else {
		        	contra.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }
		        
		        if(user.equals("")) {
		        	usuario.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            userValido = false;
		        } else {
		        	usuario.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }

		        if(userValido && passValido) {

		            JOptionPane.showMessageDialog(null,
		            	"Dando alta de usuario",
		                "Exelente",
		                JOptionPane.PLAIN_MESSAGE);

		        } else {

		            JOptionPane.showMessageDialog(null,
		                "Datos incorrectos",
		                "Error",
		                JOptionPane.PLAIN_MESSAGE);
		        }
		    }
		});	
	    contenedor.add(regresar);

	    contenedor.repaint();
	    contenedor.revalidate();
	}	
	
public void que() 
{
	JPanel contenedor = new JPanel();
    contenedor.setBackground(Color.decode("#C39AF6"));
    contenedor.setSize(600,600);
    contenedor.setLayout(null);
    this.add(contenedor);

    JLabel titulo = new JLabel("Ayuda para recuperar contraseña");
    titulo.setBounds(80,20,440,40);
    titulo.setOpaque(true);
    titulo.setForeground(Color.black);
    titulo.setBackground(Color.decode("#e5bc34"));
    titulo.setFont(new Font("Arial",Font.BOLD,24));
    titulo.setHorizontalAlignment(JLabel.CENTER);
    contenedor.add(titulo);

    JTextArea texto = new JTextArea(
        "Si olvidaste tu contraseña tienes que:\n\n" +
        "1. Ir a la opción Recuperar contraseña.\n" +
        "2. Pon el usuario de la contraseña perdida\n" +
        "3. Valida tu identidad con tu numero o correo registrado \n\n" +
        "Si los datos son correctos, podras rehacer la contraseña"
    );

    texto.setBackground(null);
    texto.setBounds(45,170,550,200);
    texto.setFont(new Font("Arial",Font.BOLD,20));
    texto.setForeground(Color.black);
    texto.setBorder(null);
    texto.setEditable(false);

    contenedor.add(texto);

    JButton regresar = new JButton("Regresar");
    regresar.setBounds(40,500,120,40);
    regresar.setFont(new Font("Arial",Font.BOLD,15));
    regresar.setBackground(Color.white);
    regresar.setBorder(null);

    regresar.addActionListener(e->{
        this.router("login");
    });

    contenedor.add(regresar);

    contenedor.repaint();
    contenedor.revalidate();	}

	public void como1() {
		
		JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#C39AF6"));
	    contenedor.setSize(600,600);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("Ayuda para acceder al sistema");
	    titulo.setBounds(100,20,400,40);
	    titulo.setOpaque(true);
	    titulo.setForeground(Color.black);
	    titulo.setBackground(Color.decode("#e5bc34"));
	    titulo.setFont(new Font("Arial",Font.BOLD,24));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JTextArea texto = new JTextArea(
	        "Para entrar al sistema tiene que:\n\n" +
	        "1. Entrar al apartado de Cuenta\n" +
	        "2. Entrar en login\n" +
	        "3. Introduce su nombre de usuario\n" +
	        "4. Introduce su contraseña\n" +
	        "5. Pulsar el boton de acceder\n\n" +
	        "° Si los datos son correctos entrarás al sistema\n\n"+
	        "° Si perdio su cuenta, ingrese Recuperar cuenta" 
	        
	    );

	    texto.setBackground(null);
	    texto.setBounds(50,120,550,350);
	    texto.setFont(new Font("Arial",Font.BOLD,20));
	    texto.setForeground(Color.black);
	    texto.setBorder(null);
	    texto.setEditable(false);

	    contenedor.add(texto);


	    contenedor.add(texto);

	    JButton regresar = new JButton("Regresar");
	    regresar.setBounds(40,500,120,40);
	    regresar.setFont(new Font("Arial",Font.BOLD,15));
	    regresar.setBackground(Color.white);
	    regresar.setBorder(null);

	    regresar.addActionListener(e->{
	        this.router("login");
	    });

	    contenedor.add(regresar);

	    contenedor.repaint();
	    contenedor.revalidate();
	}

	
	public void como() {
		
		    JPanel contenedor = new JPanel();
		    contenedor.setBackground(Color.decode("#C39AF6"));
		    contenedor.setSize(600,600);
		    contenedor.setLayout(null);
		    this.add(contenedor);

		    JLabel titulo = new JLabel("Ayuda para crear usuario");
		    titulo.setBounds(120,20,360,40);
		    titulo.setOpaque(true);
		    titulo.setForeground(Color.black);
		    titulo.setBackground(Color.decode("#e5bc34"));
		    titulo.setFont(new Font("Arial",Font.BOLD,24));
		    titulo.setHorizontalAlignment(JLabel.CENTER);
		    contenedor.add(titulo);

		    JTextArea texto = new JTextArea(
		        "Para crear un usuario tienes que:\n\n" +
		        "1. Entra en el menu de Usuario\n" +
		        "2. Entra a el apartado Alta\n" +
		        "3. Escribir correo electronico, usuario y contraseña.\n" +
		        "4. Presionar el botón dar alta\n\n" +
		        "Si los datos son correctos seran rejistrados y guardados"
		    );

		    texto.setBackground(null);
		    texto.setBounds(46,170,550,200);
		    texto.setFont(new Font("Arial",Font.BOLD,20));
		    texto.setForeground(Color.black);
		    texto.setBorder(null);
		    texto.setEditable(false);

		    contenedor.add(texto);

		    JButton regresar = new JButton("Regresar");
		    regresar.setBounds(40,500,120,40);
		    regresar.setFont(new Font("Arial",Font.BOLD,15));
		    regresar.setBackground(Color.white);
		    regresar.setBorder(null);

		    regresar.addActionListener(e->{
		        this.router("login");
		    });

		    contenedor.add(regresar);

		    contenedor.repaint();
		    contenedor.revalidate();
		}
	


public void router(String target) {
	
	this.getContentPane().removeAll();
	
	if (target.equals("login")) {
	this.login(); 	
	}
	
	if (target.equals("registro")) {
		this.registro();				
		}
	if (target.equals("rcuenta")) {
		this.rcuenta();				
		}
	
	if (target.equals("alta")) {
		this.alta();				
		}
	
	if (target.equals("baja")) {
		this.baja();				
		}
	if (target.equals("consultar")) {
		this.consultar(); 	
		}
	if (target.equals("como")) {
		this.como(); 	
		}
	if (target.equals("como1")) {
		this.como1();
		}
	if (target.equals("que")) {
		this.que(); 	
		}



	
	
		this.setVisible(true);
		this.repaint();
		this.revalidate();
		
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
		
		JButton registro = new JButton("¿No tines centa?");
		registro.setFont(new Font("Arial",Font.BOLD,15));
		registro.setSize(150,40);
		registro.setLocation(40,460);
		registro.setBackground(Color.white);
		registro.setBorder(null);
	
		registro.addActionListener(e->{
			this.router("registro");
			});
		
		JButton recuperar = new JButton("Recuperar cuenta");
		recuperar.setFont(new Font("Arial",Font.BOLD,15));
		recuperar.setSize(150,40);
		recuperar.setLocation(420,460);
		recuperar.setBackground(Color.white);
		recuperar.setBorder(null);
	
		recuperar.addActionListener(e->{
			this.router("rcuenta");
			});
		
		contenedor.add(registro);
		contenedor.add(recuperar);
		
		contenedor.repaint();
		contenedor.revalidate();
	
	
	}
	

	public void rcuenta()
	{
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.decode("#C39AF5"));
		contenedor.setSize(600,600);
		contenedor.setLocation(0,0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_loguin = new JLabel("Recuperar cuenta");
		title_loguin.setSize(400,30);
		title_loguin.setOpaque(true);
		title_loguin.setForeground(Color.black);
		title_loguin.setLocation(100,50);
		title_loguin.setBackground(Color.decode("#e5bc34"));
		title_loguin.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		title_loguin.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_loguin);
		
		JLabel describcion = new JLabel("Introduce un numero de telefono o un correo");
		describcion.setSize(550,50);
		describcion.setOpaque(true);
		describcion.setForeground(Color.black);
		describcion.setLocation(25,110);
		//describcion.setBackground(Color.decode("#e5bc34"));
		describcion.setBackground(null);
		describcion.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		describcion.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(describcion);
		

		JLabel introduce = new JLabel("Introduce el codigo de recuperacion");
		introduce.setSize(490,50);
		introduce.setOpaque(true);
		introduce.setForeground(Color.black);
		introduce.setLocation(10,210);
		//describcion.setBackground(Color.decode("#e5bc34"));
		introduce.setBackground(null);
		introduce.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		introduce.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(introduce);
		
		JTextField codigo = new JTextField();
		codigo.setOpaque(true);
		codigo.setBorder(null);
		codigo.setOpaque(true);
		codigo.setBackground(Color.white);
		codigo.setSize(350,35);
		codigo.setLocation(47,265);
		codigo.setFont(new Font("Arial",Font.BOLD,15));
		codigo.setForeground(Color.black);
		codigo.setLayout(null);
		contenedor.add(codigo);
		
		
		JLabel indicacion = new JLabel("El mensaje puede tardar 3 horas");
		indicacion.setSize(550,50);
		indicacion.setOpaque(true);
		indicacion.setForeground(Color.black);
		indicacion.setLocation(25,356);
		indicacion.setBackground(Color.decode("#e5bc34"));
		indicacion.setFont(new Font("Arial",Font.BOLD,24)); //Times New Roman
		indicacion.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(indicacion);
		
		
		
		JTextField username = new JTextField();
		username.setOpaque(true);
		username.setBorder(null);
		username.setOpaque(true);
		username.setBackground(Color.white);
		username.setSize(350,35);
		username.setLocation(47,150);
		username.setFont(new Font("Arial",Font.BOLD,15));
		username.setForeground(Color.black);
		username.setLayout(null);
		contenedor.add(username);
		
		
///////////		BOTON DE ACCEDER		////////////////////		

		JButton rembiar = new JButton();
		rembiar.setText("Reenviar");
		rembiar.setFont(new Font("Arial",Font.BOLD,18));
		rembiar.setForeground(Color.black);
		rembiar.setSize(100,50);
		rembiar.setLocation(435,470);
		rembiar.setBackground(Color.white);
		rembiar.setBorder(null);
		contenedor.add(rembiar);

		
		JButton acceder = new JButton();
		acceder.setText("Recuperar");
		acceder.setFont(new Font("Arial",Font.BOLD,25));
		acceder.setForeground(Color.black);
		acceder.setSize(200,100);
		acceder.setLocation(200,440);
		acceder.setBackground(Color.white);
		acceder.setBorder(null);

		contenedor.add(acceder);
		
		// bordes
		acceder.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {

		        String user = username.getText();

		        boolean userValido = true;
		        boolean passValido = true;

		        if(user.equals("")) {
		            username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		            userValido = false;
		        } else {
		            username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		        }

		        if(userValido && passValido) {

		            JOptionPane.showMessageDialog(null,
		            	"Hemos emviado un mensaje a la direccion",
		                "Recuperacion",
		                JOptionPane.PLAIN_MESSAGE);

		        } else {

		            JOptionPane.showMessageDialog(null,
		                "Direccion incorrectos",
		                "Error",
		                JOptionPane.PLAIN_MESSAGE);
		        }
		    }
		});	
		
		
		JButton registro = new JButton("Regresar");
		registro.setFont(new Font("Arial",Font.BOLD,15));
		registro.setSize(150,40);
		registro.setLocation(40,460);
		registro.setBackground(Color.white);
		registro.setBorder(null);
	
		registro.addActionListener(e->{
			this.router("login");
			});
		
		contenedor.add(registro);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	
	public void registro()
	{
		
	////////// REGISTRO CLASE //////
		
		JPanel registroContenedor = new JPanel();
		registroContenedor.setSize(600,600);
		registroContenedor.setLocation(0,0);
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
		        router("login");
		    }
		});

		registroContenedor.add(regresar);
		
		
		

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
	
	public void mario() {

		    JPanel marioPanel = new JPanel() {
 
		        @Override
		        protected void paintComponent(Graphics g) {
		            super.paintComponent(g);

		            Graphics2D g2d = (Graphics2D) g;

		            //sielo
		            g2d.setColor(Color.CYAN);
		            g2d.fillRect(0,0,1200,700);

		            //suelo
		            g2d.setColor(Color.decode("#FF8E0F"));
		            g2d.fillRect(0,500,1200,200);

		        
		            

		            //?
		            g2d.setColor(Color.decode("#FFAF57"));
		            g2d.fillRect(200,100,60,60);
		            g2d.fillRect(260,100,60,60);
		            g2d.fillRect(100,200,60,60);
		            g2d.fillRect(1000,200,60,60);

		            //bloque
		            g2d.setColor(Color.decode("#F2D2AE"));
		            g2d.fillRect(350,350,120,150);

		            g2d.setColor(Color.decode("#50B5AE"));
		            g2d.fillRect(430,280,140,220);

		            //tuveria
		            g2d.setColor(Color.decode("#409C45"));
		            g2d.fillRect(650,380,120,120);
		            
		            g2d.setColor(Color.decode("#48A84D"));
		            g2d.fillRect(640,360,140,40);

		            //bloque verde
		            g2d.setColor(Color.decode("#9CE85A"));
		            g2d.fillRect(950,350,200,150);

		            // Arbusto
		            g2d.setColor(Color.decode("#3B5C21"));
		            g2d.fillOval(70,420,120,80);
		            g2d.fillOval(120,400,120,100);


		        }
		    };

		    marioPanel.setSize(1200,700);
		    marioPanel.setLocation(0,0);

		    this.add(marioPanel);

		}
	
	public void examen() {
		
		//ventana
		JPanel panel = new JPanel();
	    panel.setSize(600,600);
	    panel.setLocation(0,0);
	    panel.setLayout(null);
	    panel.setBackground(Color.white);
	    this.add(panel);

	    // titulo
	    JPanel titulos = new JPanel();
	    titulos.setBounds(0,0,600,60);
	    titulos.setBackground(Color.decode("#632A69"));
	    titulos.setLayout(null);
	    panel.add(titulos);

	    JLabel titulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
	    titulo.setBounds(10,5,400,20);
	    titulo.setForeground(Color.WHITE);
	    titulo.setFont(new Font("Arial",Font.BOLD,14));
	    titulos.add(titulo);

	    JLabel tituo1 = new JLabel("[Sin Base de datos]");
	    tituo1.setBounds(10,30,200,20);
	    tituo1.setForeground(Color.WHITE);
	    titulos.add(tituo1);

	    // seccion 1 
	    JPanel seccion1 = new JPanel();
	    seccion1.setBounds(10,90,580,80);
	    seccion1.setBackground(Color.LIGHT_GRAY);
	    seccion1.setBorder(BorderFactory.createLineBorder(Color.black));
	    seccion1.setLayout(null);
	    panel.add(seccion1);
	    
	    JLabel tituloCliente = new JLabel("Datos del cliente");
	    tituloCliente.setBounds(20,70,200,20);
	    tituloCliente.setFont(new Font("Arial",Font.BOLD,14));
	    panel.add(tituloCliente);

	    JLabel documentos = new JLabel("Documento:");
	    documentos.setForeground(Color.black);
	    documentos.setBounds(10,20,100,20);
	    seccion1.add(documentos);

	    JTextField documentoF = new JTextField("123456");
	    documentoF.setBounds(100,20,100,20);
	    seccion1.add(documentoF);

	    JLabel nombre = new JLabel("Nombres:");
	    nombre.setForeground(Color.black);
	    nombre.setBounds(270,20,80,20);
	    seccion1.add(nombre);

	    JTextField nombresF = new JTextField("Jhonathan");
	    nombresF.setBounds(350,20,200,20);
	    seccion1.add(nombresF);

	    JLabel direccion = new JLabel("Dirección:");
	    direccion.setBounds(10,50,80,20);
	    direccion.setForeground(Color.black);
	    seccion1.add(direccion);

	    JTextField direccionF = new JTextField("Calle chile ");
	    direccionF.setBounds(100,50,150,20);
	    seccion1.add(direccionF);

	    JLabel telefono = new JLabel("Teléfono:");
	    telefono.setBounds(270,50,80,20);
	    telefono.setForeground(Color.black);
	    seccion1.add(telefono);

	    JTextField telefonoF = new JTextField("555555555");
	    telefonoF.setBounds(350,50,150,20);
	    seccion1.add(telefonoF);

	    // Informacion 
	    JPanel factura = new JPanel();
	    factura.setBounds(10,200,580,60);
	    factura.setBackground(Color.LIGHT_GRAY);
	    factura.setBorder(BorderFactory.createLineBorder(Color.black));
	    factura.setLayout(null);
	    panel.add(factura);
		    
	    JLabel facturaT = new JLabel("Datos de factura");
	    facturaT.setBounds(20,180,200,20);
	    facturaT.setFont(new Font("Arial",Font.BOLD,14));
	    panel.add(facturaT);

	    JLabel numeroFac = new JLabel("Num Factura:");
	    numeroFac.setBounds(10,20,100,20);
	    numeroFac.setForeground(Color.black);
	    factura.add(numeroFac);

	    JLabel num = new JLabel("1");
	    num.setBounds(100,20,50,20);
	    factura.add(num);

	    JLabel fecha = new JLabel("Fecha:");
	    fecha.setBounds(250,20,50,20);
	    fecha.setForeground(Color.black);
	    factura.add(fecha);

	    JLabel fechaT = new JLabel("21/5/2026");
	    fechaT.setBounds(350,20,100,20);
	    factura.add(fechaT);

	    // tabla
	   
	    String columnas[] = {"Producto","Cantidad","Valor","Sub Total"};
	    String datos[][] = {
	        {"Agua","2","500","1000"},
	        {"Cereal","5","1000","5000"},
	        {"Leche","2","300","600"}};

	    JTable tabla = new JTable(datos,columnas);
	    JScrollPane scroll = new JScrollPane(tabla);
	    scroll.setBounds(10,300,580,100);
	    panel.add(scroll);

	    //boton
	    JButton verlista = new JButton("Ver listado de facturas");
	    verlista.setBounds(8,265,200,25);
	    verlista.setFont(new Font("Arial",Font.BOLD,15));
	    verlista.setForeground(Color.white);
	    verlista.setBackground(Color.decode("#9C4BA3"));
	    verlista.setBorder(null);
	    panel.add(verlista);

	    JButton añadir = new JButton("Añadir");
	    añadir.setBounds(400,265,80,25);
	    añadir.setFont(new Font("Arial",Font.BOLD,15));
	    añadir.setForeground(Color.white);
	    añadir.setBackground(Color.decode("#9C4BA3"));
	    añadir.setBorder(null);
	    panel.add(añadir);

	    JButton eliminar = new JButton("Eliminar");
	    eliminar.setBounds(500,265,80,25);
	    eliminar.setFont(new Font("Arial",Font.BOLD,15));
	    eliminar.setForeground(Color.white);
	    eliminar.setBackground(Color.decode("#9C4BA3"));
	    eliminar.setBorder(null);
	    panel.add(eliminar);

	    //final 
	    JLabel subtotal = new JLabel("SubTotal:");
	    subtotal.setBounds(10,410,100,20);
	    panel.add(subtotal);

	    JLabel subtotalT = new JLabel("6600.0");
	    subtotalT.setBounds(100,410,100,20);
	    subtotalT.setForeground(Color.black);
	    panel.add(subtotalT);

	    JLabel descuento = new JLabel("% Descuento:");
	    descuento.setBounds(10,440,100,20);
	    panel.add(descuento);

	    JTextField descuentoT = new JTextField("5");
	    descuentoT.setBounds(100,440,50,20);
	    descuentoT.setForeground(Color.black);
	    panel.add(descuentoT);
	    
	    JCheckBox marca = new JCheckBox();
	    marca.setBounds(157,440,20,20);
	    marca.setBorder(null);
	    marca.setBackground(null);
	    marca.setOpaque(false);
	    panel.add(marca);
	    

	    JLabel valor = new JLabel("Valor descontado: 330.0");
	    valor.setBounds(180,440,200,20);
	    valor.setForeground(Color.black);
	    panel.add(valor);

	    JLabel iva = new JLabel("IVA 19%:");
	    iva.setBounds(10,470,100,20);
	    panel.add(iva);

	    JLabel ivaT = new JLabel("1254.0");
	    ivaT.setBounds(100,470,100,20);
	    ivaT.setForeground(Color.black);
	    panel.add(ivaT);

	    JLabel total = new JLabel("Total factura:");
	    total.setBounds(10,500,100,20);
	    panel.add(total);

	    JLabel totalT = new JLabel("7524.0");
	    totalT.setBounds(100,500,100,20);
	    nombre.setForeground(Color.black);
	    panel.add(totalT);

	    JButton finalizar = new JButton("Finalizar factura");
	    finalizar.setBounds(287,515,180,40);
	    finalizar.setFont(new Font("Arial",Font.BOLD,15));
	    finalizar.setForeground(Color.white);
	    finalizar.setBackground(Color.decode("#9C4BA3"));
	    finalizar.setBorder(null);
	    panel.add(finalizar);
	    
	    JButton limpiar = new JButton("Limpiar");
	    limpiar.setBounds(487,520,100,30);
	    limpiar.setFont(new Font("Arial",Font.BOLD,15));
	    limpiar.setForeground(Color.white);
	    limpiar.setBackground(Color.decode("#9C4BA3"));
	    limpiar.setBorder(null);
	    panel.add(limpiar);

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
	
	
}
	


