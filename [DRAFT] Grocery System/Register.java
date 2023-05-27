package LoginRegister2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Register {

	private JFrame RegisterUI;
	private JTextField mailField;
	private JTextField nameField;
	private JTextField phoneField;
	private JLabel lblUsername;
	private JTextField userField;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JButton btnRegister;
	private JButton btnReset;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.RegisterUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}
	Connection connection=null;
	private JLabel lblNewLabel;
	public void createTableNew(){

		try {
			DatabaseMetaData dmd=connection.getMetaData();
			ResultSet set=dmd.getTables(null, null, "USERTABLE", null);
			 if(set.next()){
				 
			 }
			 else{
				 String creat_table="create table USERTABLE ("
						 +"email varchar2(20),"
						 +"name varchar2(30), "
						 +"phone varchar2(12), "
						 +"user varchar2(30), "
						 +"pass varchar2 (20))";
				 PreparedStatement statement = connection.prepareStatement(creat_table);
				 statement.executeUpdate();
				 JOptionPane.showMessageDialog(null, "Table create sucessfull");
			 }
		}
		catch (Exception e){
			
		}
		
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
		RegisterUI = new JFrame();
		RegisterUI.setTitle("REGISTER");
		RegisterUI.setType(Type.POPUP);
		RegisterUI.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 15));
		RegisterUI.getContentPane().setBackground(new Color(255, 255, 255));
		RegisterUI.setBounds(200, 200, 400, 536);
		RegisterUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RegisterUI.getContentPane().setLayout(null);
		
		JLabel lblRegisterSystem = new JLabel("Register");
		lblRegisterSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegisterSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRegisterSystem.setBounds(10, 31, 364, 35);
		RegisterUI.getContentPane().add(lblRegisterSystem);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddress.setBounds(37, 146, 103, 35);
		RegisterUI.getContentPane().add(lblAddress);
		
		mailField = new JTextField();
		mailField.setBounds(138, 146, 204, 35);
		RegisterUI.getContentPane().add(mailField);
		mailField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(37, 83, 103, 35);
		RegisterUI.getContentPane().add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(138, 83, 204, 35);
		RegisterUI.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPhone.setBounds(37, 210, 103, 35);
		RegisterUI.getContentPane().add(lblPhone);
		
		phoneField = new JTextField();
		phoneField.setBounds(138, 210, 204, 35);
		RegisterUI.getContentPane().add(phoneField);
		phoneField.setColumns(10);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(37, 278, 103, 35);
		RegisterUI.getContentPane().add(lblUsername);
		
		userField = new JTextField();
		userField.setBounds(138, 278, 204, 35);
		RegisterUI.getContentPane().add(userField);
		userField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(37, 343, 103, 35);
		RegisterUI.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(138, 343, 204, 35);
		RegisterUI.getContentPane().add(passwordField);
		
		btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					String insert_data=" insert into USERTABLE values(?,?,?,?,?)";
					PreparedStatement statement= connection.prepareStatement(insert_data);
					statement.setString(1, mailField.getText());
					statement.setString(2, nameField.getText());
					statement.setString(3, phoneField.getText());
					statement.setString(4, userField.getText());
					statement.setString(5, passwordField.getText());
					int data_entered= statement.executeUpdate();
					if (data_entered>0)
					{
						JOptionPane.showMessageDialog(null, "Data inserted into table sucessfull");
					}
					else 
						JOptionPane.showMessageDialog(null, "Data insert false");
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnRegister.setBounds(243, 412, 97, 35);
		RegisterUI.getContentPane().add(btnRegister);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.main(null);
				RegisterUI.setVisible(false);
			}
		});
		btnCancel.setBounds(29, 412, 97, 35);
		RegisterUI.getContentPane().add(btnCancel);
		
		btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText(null);
				mailField.setText(null);
				nameField.setText(null);
				phoneField.setText(null);
				userField.setText(null);
			}
		});
		btnReset.setBounds(136, 412, 97, 35);
		RegisterUI.getContentPane().add(btnReset);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\Open Shopping Cart.png"));
		lblNewLabel.setBounds(0, -17, 384, 514);
		RegisterUI.getContentPane().add(lblNewLabel);
		
	}
}
