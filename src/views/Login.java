package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPasswordField;

public class Login {

	private JFrame frmAuthentification;
	private JTextField textID;

	private String IDUser = "admin";
	private String Password = "admin";
	//private MainScreen mainScreen;
	private JPasswordField passwordField;
	private JLabel lblInformationIncorrectVeuillez;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmAuthentification.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		frmAuthentification = new JFrame();
		frmAuthentification.setResizable(false);
		frmAuthentification.setTitle("Authentification");
		frmAuthentification.setBounds(100, 100, 332, 188);
		frmAuthentification.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAuthentification.getContentPane().setLayout(null);
		
		//
		
		lblInformationIncorrectVeuillez = new JLabel("Information Incorrect, Veuillez recommencer!");
		lblInformationIncorrectVeuillez.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblInformationIncorrectVeuillez.setForeground(Color.RED);
		lblInformationIncorrectVeuillez.setBounds(38, 83, 250, 14);
		lblInformationIncorrectVeuillez.setVisible(false);
		frmAuthentification.getContentPane().add(lblInformationIncorrectVeuillez);
		
		JLabel lblIdUtilisateur = new JLabel("ID Utilisateur : ");
		lblIdUtilisateur.setBounds(38, 33, 88, 14);
		frmAuthentification.getContentPane().add(lblIdUtilisateur);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe : ");
		lblMotDePasse.setBounds(38, 58, 88, 14);
		frmAuthentification.getContentPane().add(lblMotDePasse);
		
		textID = new JTextField();
		textID.setToolTipText("ID Utilisateur");
		textID.setBounds(135, 30, 153, 20);
		frmAuthentification.getContentPane().add(textID);
		textID.setColumns(10);
		
		JButton btnNewButton = new JButton("Valider");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(textID.getText().equals(IDUser) && passwordField.getText().equals(Password)){
					lblInformationIncorrectVeuillez.setVisible(false);
					//mainScreen = new MainScreen();
					//mainScreen.main(null);
					frmAuthentification.dispose();
				}else{
					lblInformationIncorrectVeuillez.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(86, 115, 89, 21);
		frmAuthentification.getContentPane().add(btnNewButton);
		
		JButton btnAnnuler = new JButton("Interrompre");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAuthentification.dispose();
			}
		});
		btnAnnuler.setBounds(185, 115, 103, 21);
		frmAuthentification.getContentPane().add(btnAnnuler);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Mot de passe");
		passwordField.setBounds(135, 58, 153, 20);
		frmAuthentification.getContentPane().add(passwordField);
	}
}

