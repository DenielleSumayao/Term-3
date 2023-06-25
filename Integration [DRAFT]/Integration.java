package Integration;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Integration {
	JFrame IntegrationFrame;

//Application Launch
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Integration window = new Integration();
					window.IntegrationFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Application Creation
	public Integration() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		IntegrationFrame = new JFrame();
		IntegrationFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		IntegrationFrame.setBackground(new Color(0, 0, 128));
		IntegrationFrame.setTitle("Integration");
		IntegrationFrame.setBounds(100, 100, 1053, 635);
		IntegrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		IntegrationFrame.setLocationRelativeTo(null);
		IntegrationFrame.getContentPane().setLayout(null);
		
		JButton btnMau = new JButton("");
		btnMau.setForeground(new Color(255, 255, 255));
		btnMau.setBackground(new Color(9, 26, 85));
		btnMau.setFont(new Font("Product Sans", Font.BOLD, 15));
		btnMau.setContentAreaFilled(false);
		btnMau.setOpaque(false);
		btnMau.setBorderPainted(false);
		btnMau.setBounds(157, 399, 132, 42);
		IntegrationFrame.getContentPane().add(btnMau);
		btnMau.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMe.main(null);
				IntegrationFrame.setVisible(false);
			}
		});
		
		JButton btnKat = new JButton("");
		btnKat.setForeground(new Color(255, 255, 255));
		btnKat.setBackground(new Color(9, 26, 85));
		btnKat.setFont(new Font("Product Sans", Font.BOLD, 15));
		btnKat.setContentAreaFilled(false);
		btnKat.setOpaque(false);
		btnKat.setBorderPainted(false);
		btnKat.setBounds(409, 399, 132, 48);
		IntegrationFrame.getContentPane().add(btnKat);
		btnKat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMe.main(null);
				IntegrationFrame.setVisible(false);
			}
		});
		
		JButton btnDen = new JButton("");
		btnDen.setForeground(new Color(255, 255, 255));
		btnDen.setBackground(new Color(9, 26, 85));
		btnDen.setFont(new Font("Product Sans", Font.BOLD, 15));
		btnDen.setContentAreaFilled(false);
		btnDen.setOpaque(false);
		btnDen.setBorderPainted(false);
		btnDen.setBounds(656, 399, 138, 48);
		IntegrationFrame.getContentPane().add(btnDen);
		btnDen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMe.main(null);
				IntegrationFrame.setVisible(false);
			}
		});
		
		JLabel Background = new JLabel("Background Image");
		Background.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\IntegrationGUI.png"));
		Background.setForeground(new Color(0, 0, 0));
		Background.setBounds(0, 0, 1037, 596);
		IntegrationFrame.getContentPane().add(Background);
		
	}
}
