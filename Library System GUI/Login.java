package BookRentalSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

public class Login{

	JFrame LoginFrame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.LoginFrame.setVisible(true);
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
		LoginFrame = new JFrame();
		LoginFrame.setTitle("NU Library Management System");
		LoginFrame.setBounds(100, 100, 1037, 592);
		LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginFrame.getContentPane().setLayout(null);
		
		JButton LibrarianBtn = new JButton("LIBRARIAN");
		LibrarianBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Librarian ll = new Librarian();
				ll.LibrarianFrame.setVisible(true);
				LoginFrame.dispose();
			}
		});
		LibrarianBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		LibrarianBtn.setBounds(379, 308, 284, 67);
		LoginFrame.getContentPane().add(LibrarianBtn);
		
		JButton AdminBtn = new JButton("ADMIN");
		AdminBtn.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		AdminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin adm = new Admin();
				adm.AdminFrame.setVisible(true);
				LoginFrame.dispose();
			}
		});
		AdminBtn.setBounds(379, 225, 284, 67);
		LoginFrame.getContentPane().add(AdminBtn);
		
		JLabel libmanLabel = new JLabel("NU Library Management System");
		libmanLabel.setForeground(new Color(0, 0, 0));
		libmanLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		libmanLabel.setHorizontalAlignment(SwingConstants.CENTER);
		libmanLabel.setBounds(205, 55, 637, 67);
		LoginFrame.getContentPane().add(libmanLabel);
		
		JLabel lblNewLabel = new JLabel("LOGIN AS:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(379, 194, 284, 18);
		LoginFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\bulldog.png"));
		lblNewLabel_3.setBounds(-11, 397, 222, 189);
		LoginFrame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\National_University_seal4.png"));
		lblNewLabel_4.setBounds(349, 341, 706, 229);
		LoginFrame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\white.png"));
		lblNewLabel_2.setBounds(0, 0, 1021, 553);
		LoginFrame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\banner-nu-manila(1).png"));
		lblNewLabel_1.setBounds(0, 0, 1021, 553);
		LoginFrame.getContentPane().add(lblNewLabel_1);
	}
}
