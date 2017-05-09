package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Identification {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblIdentification;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Identification window = new Identification();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Identification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIdentiffiant = new JLabel("Identiffiant");
		lblIdentiffiant.setBounds(40, 90, 78, 16);
		frame.getContentPane().add(lblIdentiffiant);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(40, 150, 89, 16);
		frame.getContentPane().add(lblMotDePasse);
		
		textField = new JTextField();
		textField.setBounds(200, 85, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(166, 214, 117, 29);
		frame.getContentPane().add(btnValider);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 145, 130, 21);
		frame.getContentPane().add(passwordField);
		
		lblIdentification = new JLabel("Identification");
		lblIdentification.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblIdentification.setBounds(156, 26, 137, 29);
		frame.getContentPane().add(lblIdentification);
	}
}

