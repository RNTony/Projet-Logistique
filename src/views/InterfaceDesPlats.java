package views;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class InterfaceDesPlats {

	private JFrame frame;
	private CreerRecette cr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceDesPlats window = new InterfaceDesPlats();
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
	public InterfaceDesPlats() {
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
		
		JButton btnNewButton = new JButton("Ajouter Plat");
		btnNewButton.setBounds(230, 124, 117, 29);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			cr = new CreerRecette();
			cr.main(null);
			}
		});
		
		JButton btnChoisirPlat = new JButton("Choisir Plat");
		btnChoisirPlat.setBounds(101, 124, 117, 29);
		frame.getContentPane().add(btnChoisirPlat);
	}

}
