package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Ajouter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajouter window = new Ajouter();
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
	public Ajouter() {
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
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setBounds(30, 30, 74, 16);
		frame.getContentPane().add(lblFournisseur);
		
		JLabel lblAliment = new JLabel("Aliment");
		lblAliment.setBounds(30, 60, 61, 16);
		frame.getContentPane().add(lblAliment);
		
		JLabel lblDateArriv = new JLabel("Date Arrive");
		lblDateArriv.setBounds(30, 90, 74, 16);
		frame.getContentPane().add(lblDateArriv);
		
		JLabel lblDatePeremption = new JLabel("Date Peremption");
		lblDatePeremption.setBounds(30, 120, 104, 16);
		frame.getContentPane().add(lblDatePeremption);
		
		JLabel lblQuantit = new JLabel("Quantite");
		lblQuantit.setBounds(30, 150, 61, 16);
		frame.getContentPane().add(lblQuantit);
		
		JLabel lblNewLabel = new JLabel("Prix");
		lblNewLabel.setBounds(30, 180, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(200, 25, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 55, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(200, 85, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 115, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 145, 130, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(200, 175, 130, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(166, 226, 117, 29);
		frame.getContentPane().add(btnEnregistrer);
	}
}
