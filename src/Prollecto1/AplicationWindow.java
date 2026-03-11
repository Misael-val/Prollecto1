package Prollecto1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class AplicationWindow {

	private JFrame frmRegistroDeUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicationWindow window = new AplicationWindow();
					window.frmRegistroDeUsuario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistroDeUsuario = new JFrame();
		frmRegistroDeUsuario.getContentPane().setFont(new Font("Arial Black", Font.PLAIN, 12));
		frmRegistroDeUsuario.setFont(new Font("Arial Black", Font.PLAIN, 11));
		frmRegistroDeUsuario.setForeground(new Color(255, 0, 0));
		frmRegistroDeUsuario.setOpacity(0.0f);
		frmRegistroDeUsuario.setTitle("Registro de usuario");
		frmRegistroDeUsuario.getContentPane().setBackground(new Color(13, 119, 39));
		frmRegistroDeUsuario.getContentPane().setLayout(new GridLayout(0, 2, 2, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		frmRegistroDeUsuario.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Datos generales");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 0, 121, 18);
		panel.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(10, 27, 70, 18);
		panel.add(lblNombre);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido paterno");
		lblApellidoPaterno.setFont(new Font("Arial", Font.BOLD, 15));
		lblApellidoPaterno.setBounds(10, 48, 128, 18);
		panel.add(lblApellidoPaterno);
		
		JLabel lblNerales = new JLabel("Apellido materno");
		lblNerales.setFont(new Font("Arial", Font.BOLD, 15));
		lblNerales.setBounds(10, 76, 141, 18);
		panel.add(lblNerales);
		
		textField = new JTextField();
		textField.setBounds(75, 28, 114, 18);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(141, 49, 128, 18);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 77, 128, 18);
		panel.add(textField_2);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setFont(new Font("Arial", Font.BOLD, 15));
		lblNacionalidad.setBounds(10, 153, 141, 18);
		panel.add(lblNacionalidad);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(127, 154, 142, 18);
		panel.add(textField_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Maculino");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 128));
		rdbtnNewRadioButton.setBounds(43, 127, 88, 20);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 15));
		lblSexo.setBounds(20, 104, 42, 18);
		panel.add(lblSexo);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnFemenino.setBackground(new Color(0, 128, 128));
		rdbtnFemenino.setBounds(149, 127, 102, 20);
		panel.add(rdbtnFemenino);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(10, 187, 207));
		frmRegistroDeUsuario.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPerfilDeUsuario = new JLabel("Perfil de usuario");
		lblPerfilDeUsuario.setFont(new Font("Arial", Font.BOLD, 15));
		lblPerfilDeUsuario.setBounds(0, 0, 145, 18);
		panel_1.add(lblPerfilDeUsuario);
		
		JTextArea txtrImagen = new JTextArea();
		txtrImagen.setText("     Imagen");
		txtrImagen.setBounds(74, 28, 139, 92);
		panel_1.add(txtrImagen);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		chckbxNewCheckBox.setBackground(new Color(10, 187, 207));
		chckbxNewCheckBox.setBounds(6, 140, 139, 20);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarDescripcion = new JCheckBox("Mostrar descripcion");
		chckbxMostrarDescripcion.setFont(new Font("Times New Roman", Font.BOLD, 12));
		chckbxMostrarDescripcion.setBackground(new Color(10, 187, 207));
		chckbxMostrarDescripcion.setBounds(147, 140, 139, 20);
		panel_1.add(chckbxMostrarDescripcion);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(10, 207, 143));
		frmRegistroDeUsuario.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblDatosPersonales = new JLabel("Datos personales");
		lblDatosPersonales.setFont(new Font("Arial", Font.BOLD, 15));
		lblDatosPersonales.setBounds(0, 0, 137, 18);
		panel_2.add(lblDatosPersonales);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setFont(new Font("Arial", Font.BOLD, 13));
		lblDescripcion.setBounds(27, 31, 90, 18);
		panel_2.add(lblDescripcion);
		
		JLabel lblPreferencias = new JLabel("Preferencias");
		lblPreferencias.setFont(new Font("Arial", Font.BOLD, 13));
		lblPreferencias.setBounds(174, 31, 90, 18);
		panel_2.add(lblPreferencias);
		
		JTextArea txtrImagen_1 = new JTextArea();
		txtrImagen_1.setBounds(10, 56, 127, 115);
		panel_2.add(txtrImagen_1);
		
		JTextArea txtrImagen_1_1 = new JTextArea();
		txtrImagen_1_1.setBounds(143, 56, 139, 115);
		panel_2.add(txtrImagen_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(11, 155, 116));
		frmRegistroDeUsuario.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(179, 89, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBackground(new Color(11, 155, 116));
		btnNewButton.setBounds(102, 28, 84, 20);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(94, 94, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBackground(new Color(11, 155, 116));
		btnNewButton_1.setBounds(102, 85, 84, 20);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Salir");
		btnNewButton_1_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1_1.setBackground(new Color(11, 155, 116));
		btnNewButton_1_1.setBounds(102, 138, 84, 20);
		panel_3.add(btnNewButton_1_1);
	}
}