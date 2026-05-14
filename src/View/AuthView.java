package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Controller.AuthController;
import Model.User;

public class AuthView {

    public void loginView(AuthController controller) {

        JFrame ventana = new JFrame();
        ventana.setSize(615,640);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(600,600));
        ventana.setMaximumSize(new Dimension(600,600));
        ventana.setLayout(null);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.decode("#C39AF5"));
        contenedor.setBounds(0,0,600,600);
        contenedor.setLayout(null);

        ventana.add(contenedor);

        JLabel title_loguin = new JLabel("ACCESO REQUERIDO");
        title_loguin.setBounds(100,10,400,30);
        title_loguin.setOpaque(true);
        title_loguin.setForeground(Color.black);
        title_loguin.setBackground(Color.decode("#e5bc34"));
        title_loguin.setFont(new Font("Arial",Font.BOLD,24));
        title_loguin.setHorizontalAlignment(JLabel.CENTER);

        contenedor.add(title_loguin);

        JLabel descripcion = new JLabel("*El inicio de sesión es requerido para ingresar*");
        descripcion.setForeground(Color.RED);
        descripcion.setBounds(50,50,500,24);
        descripcion.setFont(new Font("Arial",Font.BOLD,18));
        descripcion.setHorizontalAlignment(JLabel.CENTER);

        contenedor.add(descripcion);

        JLabel correoT = new JLabel("CORREO");
        correoT.setBounds(75,125,300,30);
        correoT.setFont(new Font("Times New Roman",Font.BOLD,25));
        correoT.setBorder(null);
        correoT.setForeground(Color.black);
        correoT.setBackground(Color.white);

        contenedor.add(correoT);

        JTextField correo = new JTextField();
        correo.setBounds(75,165,350,35);
        correo.setFont(new Font("Times New Roman",Font.BOLD,20));
        correo.setBorder(null);
        correo.setForeground(Color.black);
        correo.setBackground(Color.white);

        correo.setBorder(null);

        contenedor.add(correo);

        JLabel contraseñaT = new JLabel("CONTRASEÑA");
        contraseñaT.setBounds(75,275,300,30);
        contraseñaT.setFont(new Font("Times New Roman",Font.BOLD,25));
        contraseñaT.setBorder(null);
        contraseñaT.setForeground(Color.black);
        contraseñaT.setBackground(Color.white);

        contenedor.add(contraseñaT);

        JPasswordField contraseña = new JPasswordField();
        contraseña.setBounds(75,309,350,35);
        contraseña.setFont(new Font("Arial",Font.BOLD,15));
        contraseña.setForeground(Color.black);
        contraseña.setBackground(Color.white);
        contraseña.setBorder(null);

        contenedor.add(contraseña);

        JButton acceder = new JButton("ACCEDER");
        acceder.setFont(new Font("Arial",Font.BOLD,25));
        acceder.setForeground(Color.black);
        acceder.setBounds(200,425,200,100);
        acceder.setBackground(Color.white);
        acceder.setBorder(null);

        contenedor.add(acceder);

        acceder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String correoUser = correo.getText();
                String pass = new String(contraseña.getPassword());

                boolean userValido = true;
                boolean passValido = true;

                if(correoUser.equals("") || correoUser.contains(" ")) {

                    correo.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
                    userValido = false;

                } else {

                    correo.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(pass.length() < 6 || pass.contains(" ")) {

                    contraseña.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
                    passValido = false;

                } else {

                    contraseña.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(userValido && passValido) {

                    boolean acceso = controller.loginUsuario(correoUser, pass);

                    if(acceso) {

                        JOptionPane.showMessageDialog(null,"Bienvenido");

                        ventana.dispose();

                        controller.Home();

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "Usuario o contraseña incorrectos");
                    }
                }
            }
        });

        JButton registro = new JButton("¿NO TIENES CUENTA?");
        registro.setBounds(10,460,180,40);
        registro.setFont(new Font("Arial",Font.BOLD,15));
        registro.setForeground(Color.black);
        registro.setBackground(Color.white);
        registro.setBorder(null);
        

        registro.addActionListener(e -> {

            ventana.dispose();

            controller.registroVista();
        });

        contenedor.add(registro);

        ventana.setVisible(true);
    }

    public void registerView(AuthController controller) {

        JFrame ventana = new JFrame();
        ventana.setSize(615,640);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setMinimumSize(new Dimension(600,600));
        ventana.setMaximumSize(new Dimension(600,600));
        ventana.setLayout(null);

        JPanel registroContenedor = new JPanel();
        registroContenedor.setBounds(0,0,600,600);
        registroContenedor.setBackground(Color.decode("#B29CD6"));
        registroContenedor.setLayout(null);

        ventana.add(registroContenedor);

        JLabel titulo = new JLabel("REGISTRO");
        titulo.setBounds(160,10,275,40);
        titulo.setFont(new Font("Arial",Font.BOLD,25));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setOpaque(true);
        titulo.setForeground(Color.black);
        titulo.setBackground(Color.decode("#e5bc34"));

        registroContenedor.add(titulo);

        JLabel nombreT = new JLabel("NOMBRE");
        nombreT.setBounds(100,70,200,30);
        nombreT.setFont(new Font("Times New Roman",Font.BOLD,20));
        nombreT.setBorder(null);
        nombreT.setForeground(Color.black);
        nombreT.setBackground(Color.white);

        registroContenedor.add(nombreT);

        JTextField campoNombre = new JTextField();
        campoNombre.setBounds(100,100,400,35);
        campoNombre.setFont(new Font("Times New Roman",Font.BOLD,20));
        campoNombre.setBorder(null);
        campoNombre.setForeground(Color.black);
        campoNombre.setBackground(Color.white);

        registroContenedor.add(campoNombre);

        JLabel apellidoT = new JLabel("APELLIDO");
        apellidoT.setBounds(100,145,200,30);
        apellidoT.setFont(new Font("Times New Roman",Font.BOLD,20));
        apellidoT.setBorder(null);
        apellidoT.setForeground(Color.black);
        apellidoT.setBackground(Color.white);
        

        registroContenedor.add(apellidoT);

        JTextField campoApellido = new JTextField();
        campoApellido.setBounds(100,175,400,35);
        campoApellido.setFont(new Font("Times New Roman",Font.BOLD,20));
        campoApellido.setBorder(null);
        campoApellido.setForeground(Color.black);
        campoApellido.setBackground(Color.white);
        

        registroContenedor.add(campoApellido);

        JLabel correoT = new JLabel("CORREO");
        correoT.setBounds(100,220,200,30);
        correoT.setFont(new Font("Times New Roman",Font.BOLD,20));
        correoT.setBorder(null);
        correoT.setForeground(Color.black);
        correoT.setBackground(Color.white);

        registroContenedor.add(correoT);

        JTextField campoCorreo = new JTextField();
        campoCorreo.setBounds(100,250,400,35);
        campoCorreo.setFont(new Font("Times New Roman",Font.BOLD,20));
        campoCorreo.setBorder(null);
        campoCorreo.setForeground(Color.black);
        campoCorreo.setBackground(Color.white);

        registroContenedor.add(campoCorreo);

        JLabel passwordT = new JLabel("CONTRASEÑA");
        passwordT.setBounds(100,295,200,30);
        passwordT.setFont(new Font("Times New Roman",Font.BOLD,20));
        passwordT.setBorder(null);
        passwordT.setForeground(Color.black);
        passwordT.setBackground(Color.white);

        registroContenedor.add(passwordT);

        JPasswordField campoPassword = new JPasswordField();
        campoPassword.setBounds(100,325,400,35);
        campoPassword.setFont(new Font("Times New Roman",Font.BOLD,20));
        campoPassword.setBorder(null);
        campoPassword.setForeground(Color.black);
        campoPassword.setBackground(Color.white);

        registroContenedor.add(campoPassword);

        JLabel telefonoT = new JLabel("TELÉFONO");
        telefonoT.setBounds(100,370,200,30);
        telefonoT.setFont(new Font("Times New Roman",Font.BOLD,20));
        telefonoT.setBorder(null);
        telefonoT.setForeground(Color.black);
        telefonoT.setBackground(Color.white);

        registroContenedor.add(telefonoT);

        JTextField campoTelefono = new JTextField();
        campoTelefono.setBounds(100,400,400,35);
        campoTelefono.setFont(new Font("Times New Roman",Font.BOLD,20));
        campoTelefono.setBorder(null);
        campoTelefono.setForeground(Color.black);
        campoTelefono.setBackground(Color.white);

        registroContenedor.add(campoTelefono);

        JButton crearcuenta = new JButton("CREAR CUENTA");
        crearcuenta.setFont(new Font("Arial",Font.BOLD,25));
        crearcuenta.setForeground(Color.black);
        crearcuenta.setBounds(190,470,230,80);
        crearcuenta.setBackground(Color.white);
        crearcuenta.setBorder(null);

        registroContenedor.add(crearcuenta);

        crearcuenta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = campoNombre.getText();
                String apellido = campoApellido.getText();
                String correo = campoCorreo.getText();
                String password = new String(campoPassword.getPassword());
                String telefono = campoTelefono.getText();

                if(nombre.equals("")) {

                    campoNombre.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

                } else {

                    campoNombre.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(apellido.equals("")) {

                    campoApellido.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

                } else {

                    campoApellido.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(correo.equals("") || !correo.contains("@")) {

                    campoCorreo.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

                } else {

                    campoCorreo.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(password.length() < 6) {

                    campoPassword.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

                } else {

                    campoPassword.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                if(telefono.equals("")) {

                    campoTelefono.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

                } else {

                    campoTelefono.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
                }

                controller.registrarUsuario(
                        nombre,
                        apellido,
                        correo,
                        password,
                        telefono
                );
            }
        });

        JButton regresar = new JButton("REGRESAR");
        regresar.setBounds(30,500,150,40);
        regresar.setFont(new Font("Arial",Font.BOLD,15));
        regresar.setForeground(Color.black);
        regresar.setBackground(Color.white);
        regresar.setBorder(null);

        regresar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                ventana.dispose();

                controller.login();
            }
        });

        registroContenedor.add(regresar);

        ventana.setVisible(true);
    }
}

