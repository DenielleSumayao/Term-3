package BookRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Librarian {

	JFrame LibrarianFrame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarian window = new Librarian();
					window.LibrarianFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Librarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		LibrarianFrame = new JFrame();
		LibrarianFrame.setTitle("Librarian Login");
		LibrarianFrame.setBounds(100, 100, 988, 569);
		LibrarianFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LibrarianFrame.getContentPane().setLayout(null);
		
		JLabel lblLibrarian = new JLabel("LIBRARIAN LOGIN");
		lblLibrarian.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibrarian.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblLibrarian.setBounds(222, 49, 515, 63);
		LibrarianFrame.getContentPane().add(lblLibrarian);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblUsername.setBounds(240, 153, 215, 52);
		LibrarianFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPassword.setBounds(240, 237, 215, 52);
		LibrarianFrame.getContentPane().add(lblPassword);
	
		txtUsername = new JTextField();
		txtUsername.setColumns(10);
		txtUsername.setBounds(481, 163, 192, 35);
		LibrarianFrame.getContentPane().add(txtUsername);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(481, 247, 192, 35);
		LibrarianFrame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if (username.contains("Librarian1")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Books lb = new Books();
					lb.Booksframe.setVisible(true);
					LibrarianFrame.dispose();
				} else if (username.contains("Librarian2")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Books lb = new Books();
					lb.Booksframe.setVisible(true);
					LibrarianFrame.dispose();
				} else if (username.contains("Librarian3")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Books lb = new Books();
					lb.Booksframe.setVisible(true);
					LibrarianFrame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLogin.setBounds(222, 343, 165, 52);
		LibrarianFrame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login mf = new Login();
				mf.LoginFrame.setVisible(true);
				LibrarianFrame.dispose();
			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(572, 343, 165, 52);
		LibrarianFrame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("Background Image");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\white.png"));
		lblNewLabel_1.setBounds(0, 0, 1019, 551);
		LibrarianFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Background Image");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\banner-nu-manila(1).png"));
		lblNewLabel_2.setBounds(0, 0, 1019, 551);
		LibrarianFrame.getContentPane().add(lblNewLabel_2);
	}

}
