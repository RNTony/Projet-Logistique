package views;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import dao.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Ajouter/* implements ActionListener */{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private static Statement st;
	private static Connection con;

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
		
		JLabel lblFournisseur = new JLabel("Livraison");
		lblFournisseur.setBounds(30, 30, 74, 16);
		frame.getContentPane().add(lblFournisseur);
		
		JLabel lblAliment = new JLabel("Aliment");
		lblAliment.setBounds(30, 60, 61, 16);
		frame.getContentPane().add(lblAliment);
		
		/*JLabel lblDateArriv = new JLabel("Date Arrive");
		lblDateArriv.setBounds(30, 90, 74, 16);
		frame.getContentPane().add(lblDateArriv);
		
		JLabel lblDatePeremption = new JLabel("Date Peremption");
		lblDatePeremption.setBounds(30, 120, 104, 16);
		frame.getContentPane().add(lblDatePeremption);*/
		
		JLabel lblQuantit = new JLabel("Poid");
		lblQuantit.setBounds(30, 90, 61, 16);
		frame.getContentPane().add(lblQuantit);
		
		/*JLabel lblNewLabel = new JLabel("Prix");
		lblNewLabel.setBounds(30, 180, 61, 16);
		frame.getContentPane().add(lblNewLabel);*/
		
		textField = new JTextField();
		textField.setBounds(200, 25, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 55, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		/*textField_2 = new JTextField();
		textField_2.setBounds(200, 85, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(200, 115, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);*/
		
		textField_4 = new JTextField();
		textField_4.setBounds(200, 85, 130, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		/*textField_5 = new JTextField();
		textField_5.setBounds(200, 175, 130, 26);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);*/
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(166, 226, 117, 29);
		frame.getContentPane().add(btnEnregistrer);}
		/*btnEnregistrer.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e){
				da();
			}
			
				});
	}
	
	public void da() {
		
		String s1= textField_1.getText();
		String s2 = textField_4.getText(); 
		String  url="jdbc:mysql://localhost:3306/logistique";
		String user="root";
		String mdp="P1212121";
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, user, mdp);
        Statement stat = con.createStatement();
        stat.executeQuery("insert into logistique.aliment (nom,poid) values('"+s1+"','"+s2+"')");}
		catch(ClassNotFoundException e1) {
			 System.out.println("Impossible de charger le driver "+e1.getMessage());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}*/
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
*/

		
	}

	
	

