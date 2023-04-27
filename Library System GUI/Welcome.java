package BookRentalSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;

public class Welcome {

	JFrame WelcomeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.WelcomeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		WelcomeFrame = new JFrame();
		WelcomeFrame.setTitle("Welcome!");
		WelcomeFrame.setBounds(100, 100, 1037, 592);
		WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to NU's Library System!");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 128, 192));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(177, 54, 659, 111);
		WelcomeFrame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Proceed to Library >>");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		btnNewButton.setBounds(380, 381, 259, 52);
		WelcomeFrame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				WelcomeFrame.dispose();
				Books window = new Books();
				window.Booksframe.setVisible(true);
			}
		});
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\National_University_seal2.png"));
		lblNewLabel_3.setBounds(438, 177, 129, 147);
		WelcomeFrame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Background Image");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\white.png"));
		lblNewLabel_1.setBounds(0, 0, 1019, 551);
		WelcomeFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Background Image");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\banner-nu-manila(1).png"));
		lblNewLabel_2.setBounds(0, 0, 1019, 551);
		WelcomeFrame.getContentPane().add(lblNewLabel_2);
		
	}
}
