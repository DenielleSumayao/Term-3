package SumayaoPortfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcome {
	JFrame WelcomeFrame;

//Application Launch
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

//Application Creation
	public Welcome() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		WelcomeFrame = new JFrame();
		WelcomeFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		WelcomeFrame.setBackground(new Color(0, 0, 128));
		WelcomeFrame.setTitle("Welcome!");
		WelcomeFrame.setBounds(100, 100, 1038, 592);
		WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeFrame.getContentPane().setLayout(null);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.setForeground(new Color(255, 255, 255));
		btnProceed.setBackground(new Color(9, 26, 85));
		btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
		btnProceed.setBounds(417, 465, 199, 35);
		WelcomeFrame.getContentPane().add(btnProceed);
		btnProceed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				WelcomeFrame.dispose();
				Menu window = new Menu();
				window.MenuFrame.setVisible(true);
			}
		});
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\GUI\\Portfoliobg.png"));
		Background.setBounds(0, 0, 1019, 551);
		WelcomeFrame.getContentPane().add(Background);
		
	}
}
