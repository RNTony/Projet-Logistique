package views;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ChoixAction {

	private JFrame frame;
	private Ajouter ajouter;
	private InterfaceDesPlats idp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixAction window = new ChoixAction();
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
	public ChoixAction() {
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
		
		JButton btnNewButton = new JButton("Stock");
		btnNewButton.setBounds(166, 124, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(295, 124, 117, 29);
		frame.getContentPane().add(btnAjouter);
		btnAjouter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			ajouter = new Ajouter();
			ajouter.main(null);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Voir Plats");
		btnNewButton_1.setBounds(37, 124, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			idp = new InterfaceDesPlats();
			idp.main(null);
			}
		});
	}

}
