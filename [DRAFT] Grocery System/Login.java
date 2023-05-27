package LoginRegister2;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Color;
import java.awt.Window.Type;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login {

	protected static Component frmLoginSystem = null;
	private JFrame LoginUI;
	private JTextField textField;
	private JPasswordField passwordField;
	Connection connection=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.LoginUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			Class.forName("org.h2.Driver");
			connection= DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
					} 
		catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		LoginUI = new JFrame();
		LoginUI.setType(Type.POPUP);
		LoginUI.setTitle("Login");
		LoginUI.setBackground(Color.BLUE);
		LoginUI.getContentPane().setBackground(new Color(255, 255, 255));
		LoginUI.setForeground(Color.BLACK);
		LoginUI.getContentPane().setForeground(Color.DARK_GRAY);
		LoginUI.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginUI.setBounds(200, 200, 799, 499);
		LoginUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginUI.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Online Grocery");
		lblNewLabel.setBounds(51, 66, 245, 38);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		LoginUI.getContentPane().add(lblNewLabel);
		
		JLabel lblSystem = new JLabel("System");
		lblSystem.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSystem.setBounds(51, 92, 245, 38);
		LoginUI.getContentPane().add(lblSystem);
		
		JLabel lblKmd = new JLabel("KMD");
		lblKmd.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblKmd.setBounds(51, 25, 245, 38);
		LoginUI.getContentPane().add(lblKmd);
		
		JLabel lblWelcomeUser = new JLabel("Welcome User!");
		lblWelcomeUser.setHorizontalAlignment(SwingConstants.TRAILING);
		lblWelcomeUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblWelcomeUser.setBounds(491, 37, 245, 38);
		LoginUI.getContentPane().add(lblWelcomeUser);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(51, 152, 90, 30);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginUI.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(51, 247, 75, 30);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginUI.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(51, 181, 245, 38);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginUI.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(51, 275, 245, 38);
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 15));
		LoginUI.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setBounds(183, 350, 113, 23);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				
				
				try{
					String validate= "SELECT * FROM USERTABLE WHERE USER=? AND PASS=? ";
					PreparedStatement statement = connection.prepareStatement(validate);
					statement.setString(1, textField.getText());
					statement.setString(2, passwordField.getText());
					ResultSet set = statement.executeQuery();
				if(set.next()){
					
                    LoginUI.setVisible(false);
					FrameScreen info= new FrameScreen();
					FrameScreen.main(null);
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid Login Details","Login System Error",JOptionPane.ERROR_MESSAGE);
					passwordField.setText(null);
					textField.setText(null);
				}
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		});
		LoginUI.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(0, 0, 0));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(51, 350, 112, 23);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passwordField.setText(null);
				textField.setText(null);	
			}
		});
		LoginUI.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.setBounds(183, 384, 113, 23);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginSystem= new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","Login Systems",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(1);
				}
			}
		});
		LoginUI.getContentPane().add(btnExit);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setForeground(new Color(0, 0, 0));
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register.main(null);
				LoginUI.setVisible(false);
			}
		});
		btnRegister.setBounds(51, 384, 113, 23);
		LoginUI.getContentPane().add(btnRegister);
		
		JLabel Logo = new JLabel("New label");
		Logo.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\Open_Shopping_Cart_1_-removebg-preview.png"));
		Logo.setBounds(101, 115, 635, 281);
		LoginUI.getContentPane().add(Logo);
		
		JLabel Background = new JLabel("");
		Background.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\Open Shopping Cart.png"));
		Background.setBounds(0, 0, 783, 460);
		LoginUI.getContentPane().add(Background);
		
	}
}
