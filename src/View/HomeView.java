package View;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.AuthController;
import Model.User;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Model.User;
import View.RegisterView;
import View.RegisterView;

public class HomeView {
	
	JTable tabla;
	DefaultTableModel modeloTabla;

	public void showHome(AuthController controller) {

			JFrame	ventana = new JFrame();
		    ventana.setSize(1000,600);
		    ventana.setLocationRelativeTo(null);
		    ventana.setLayout(null);

		    JPanel panel = new JPanel();

		    panel.setLayout(null);
		    panel.setBackground(Color.decode("#C8F7C5"));
		    panel.setBounds(0,0,1000,600);

		    ventana.add(panel);

		    modeloTabla = new DefaultTableModel();

		    modeloTabla.addColumn("ID");
		    modeloTabla.addColumn("NOMBRE");
		    modeloTabla.addColumn("APELLIDO");
		    modeloTabla.addColumn("CORREO");
		    modeloTabla.addColumn("TELÉFONO");
		    modeloTabla.addColumn("ACCIONES");

		    tabla = new JTable(modeloTabla);

		    JScrollPane scroll = new JScrollPane(tabla);

		    scroll.setBounds(50,100,880,300);

		    panel.add(scroll);

		    JButton nuevo = new JButton("NUEVO REGISTRO");
		    nuevo.setBounds(350,430,250,60);
		    nuevo.setFont(new Font("Arial",Font.BOLD,20));
		    nuevo.setForeground(Color.black);
		    nuevo.setBackground(Color.white);
		    nuevo.setBorder(null);
	        
		    nuevo.addActionListener(e -> {

		        RegisterView rv = new RegisterView();

		        rv.mostrarRegistro(controller);
		    });

		    panel.add(nuevo);

		    cargarTabla(controller);


		    ventana.setVisible(true);
		}
	
	public void cargarTabla(AuthController controller) {

	    modeloTabla.setRowCount(0);

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
	
	public void llenarTabla(AuthController controller) {

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
