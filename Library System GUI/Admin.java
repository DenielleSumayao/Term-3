package BookRentalSystem;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Admin {

    JFrame AdminFrame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin window = new Admin();
					window.AdminFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminFrame = new JFrame();
		AdminFrame.setTitle("Admin Login");
		AdminFrame.setBounds(100, 100, 1037, 592);
		AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdminFrame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(267, 158, 215, 52);
		AdminFrame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(267, 246, 215, 52);
		AdminFrame.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(482, 168, 222, 35);
		AdminFrame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(482, 256, 222, 35);
		AdminFrame.getContentPane().add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				if (username.contains("Admin1")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Welcome wa = new Welcome();
					wa.WelcomeFrame.setVisible(true);
					AdminFrame.dispose();
				} else if (username.contains("Admin2")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Welcome wa = new Welcome();
					wa.WelcomeFrame.setVisible(true);
					AdminFrame.dispose();
				} else if (username.contains("Admin3")&& password.contains("Password")) {
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null,"Succesfully login");
					Welcome wa = new Welcome();
					wa.WelcomeFrame.setVisible(true);
					AdminFrame.dispose();
				} else {
					JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLogin.setBounds(254, 343, 165, 52);
		AdminFrame.getContentPane().add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login mf = new Login();
				mf.LoginFrame.setVisible(true);
				AdminFrame.dispose();
			}
		});
		btnBack.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBack.setBounds(604, 343, 165, 52);
		AdminFrame.getContentPane().add(btnBack);
		
		JLabel lblAdmin = new JLabel("ADMIN LOGIN");
		lblAdmin.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(254, 72, 515, 58);
		AdminFrame.getContentPane().add(lblAdmin);
		
		JLabel lblNewLabel_1 = new JLabel("Background Image");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\white.png"));
		lblNewLabel_1.setBounds(0, 0, 1019, 551);
		AdminFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Background Image");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\banner-nu-manila(1).png"));
		lblNewLabel_2.setBounds(0, 0, 1019, 551);
		AdminFrame.getContentPane().add(lblNewLabel_2);
	}
}
