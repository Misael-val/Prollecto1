package View;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Controller.AuthController;
import Model.User;

public class UsersView {

    JFrame ventana;
    JTable tabla;
    DefaultTableModel modeloTabla;

    public void mostrarUsuarios(AuthController controller) {

        ventana = new JFrame();

        ventana.setSize(600,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tabla = new JTable();

        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("USERNAME");
        modeloTabla.addColumn("NOMBRE");

        tabla.setModel(modeloTabla);

        llenarTabla(controller);

        JScrollPane scroll = new JScrollPane(tabla);

        ventana.add(scroll, BorderLayout.CENTER);

        ventana.setVisible(true);
    }

    public void llenarTabla(AuthController controller) {

        ArrayList<User> listaUsuarios = controller.obtenerUsuarios();

        for(User usuario : listaUsuarios) {

            modeloTabla.addRow(new Object[] {

                usuario.getId(),
                usuario.getUsername(),
                usuario.getNombreCompleto()

            });
        }
    }
}