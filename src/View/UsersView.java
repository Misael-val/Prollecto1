package View;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import Controller.AuthController;
import Model.User;

public class UsersView {

	
    JFrame ventana;
    JTable tabla;
    DefaultTableModel modeloTabla;

    public void mostrarUsuarios() {

        ventana = new JFrame();

        ventana.setSize(900,600);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel contenedor = new JPanel();

        contenedor.setBackground(Color.decode("#B9F6CA"));
        contenedor.setLayout(null);

        ventana.add(contenedor);

        JLabel titulo = new JLabel("USUARIOS REGISTRADOS");

        titulo.setBounds(230,20,420,40);
        titulo.setFont(new Font("Arial",Font.BOLD,28));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setOpaque(true);
        titulo.setBackground(Color.decode("#81C784"));

        contenedor.add(titulo);

        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("NOMBRE");
        modeloTabla.addColumn("APELLIDO");
        modeloTabla.addColumn("CORREO");
        modeloTabla.addColumn("TELÉFONO");
        modeloTabla.addColumn("ACCIONES");

        tabla = new JTable(modeloTabla);

        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(70,100,750,300);

        contenedor.add(scroll);

        llenarTabla();
        
        JButton añadir = new JButton("AÑADIR");
        añadir.setBounds(170,450,200,70);
        añadir.setFont(new Font("Arial",Font.BOLD,20));
        añadir.setBackground(Color.white);
        añadir.setBorder(null);

        contenedor.add(añadir);

        JButton eliminar = new JButton("ELIMINAR");
        eliminar.setBounds(500,450,200,70);
        eliminar.setFont(new Font("Arial",Font.BOLD,20));
        eliminar.setBackground(Color.white);
        eliminar.setBorder(null);

        contenedor.add(eliminar);

        ventana.setVisible(true);
    }

    public void llenarTabla() {

        AuthController controller = new AuthController();

        ArrayList<User> listaUsuarios = controller.obtenerUsuarios();

        for(User usuario : listaUsuarios) {

            modeloTabla.addRow(new Object[] {

                usuario.getId(),
                usuario.getNombre(),
                usuario.getApellido(),
                usuario.getCorreo(),
                usuario.getTelefono(),
                ""

            });
        }
    }
}