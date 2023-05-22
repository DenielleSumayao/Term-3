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

public class Biography{
	JFrame BiographyFrame;

	//Application Launch
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Biography window = new Biography();
						window.BiographyFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	//Application Creation
		public Biography() {
			initialize();
		}

	//Initializing the contents of the frame
		private void initialize() {
			BiographyFrame = new JFrame();
			BiographyFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
			BiographyFrame.setBackground(new Color(0, 0, 128));
			BiographyFrame.setTitle("Welcome!");
			BiographyFrame.setBounds(100, 100, 1038, 592);
			BiographyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			BiographyFrame.getContentPane().setLayout(null);
			
			JButton btnProceed = new JButton("Return");
			btnProceed.setForeground(new Color(255, 255, 255));
			btnProceed.setBackground(new Color(9, 26, 85));
			btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
			btnProceed.setBounds(417, 483, 199, 35);
			BiographyFrame.getContentPane().add(btnProceed);
			btnProceed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					BiographyFrame.dispose();
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				}
			});
		
			JLabel lblName = new JLabel("Luke Denielle L. Sumayao");
			lblName.setBackground(new Color(0, 0, 0));
			lblName.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblName.setForeground(new Color(0, 64, 128));
			lblName.setBounds(475, 180, 250, 35);
			BiographyFrame.getContentPane().add(lblName);
			
			JLabel lblAge = new JLabel("19");
			lblAge.setBackground(new Color(0, 0, 0));
			lblAge.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblAge.setForeground(new Color(0, 64, 128));
			lblAge.setBounds(839, 180, 112, 46);
			BiographyFrame.getContentPane().add(lblAge);
			
			JLabel lblBirthday = new JLabel("October 15, 2003");
			lblBirthday.setForeground(new Color(0, 64, 128));
			lblBirthday.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblBirthday.setBackground(Color.BLACK);
			lblBirthday.setBounds(542, 241, 172, 35);
			BiographyFrame.getContentPane().add(lblBirthday);
			
			JLabel lblEyes = new JLabel("Black");
			lblEyes.setForeground(new Color(0, 64, 128));
			lblEyes.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblEyes.setBackground(Color.BLACK);
			lblEyes.setBounds(839, 237, 112, 46);
			BiographyFrame.getContentPane().add(lblEyes);
			
			JLabel lblHeight = new JLabel("5ft 9in");
			lblHeight.setForeground(new Color(0, 64, 128));
			lblHeight.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblHeight.setBackground(Color.BLACK);
			lblHeight.setBounds(513, 303, 172, 35);
			BiographyFrame.getContentPane().add(lblHeight);
			
			JLabel lblWeight = new JLabel("52kg");
			lblWeight.setForeground(new Color(0, 64, 128));
			lblWeight.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblWeight.setBackground(Color.BLACK);
			lblWeight.setBounds(839, 294, 112, 46);
			BiographyFrame.getContentPane().add(lblWeight);
			
			JLabel lblNationality = new JLabel("Filipino");
			lblNationality.setForeground(new Color(0, 64, 128));
			lblNationality.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblNationality.setBackground(Color.BLACK);
			lblNationality.setBounds(486, 365, 172, 35);
			BiographyFrame.getContentPane().add(lblNationality);
			
			JLabel lblMotto = new JLabel("You can't do everything perfectly; but always strive to be better.");
			lblMotto.setForeground(new Color(0, 64, 128));
			lblMotto.setFont(new Font("Product Sans", Font.BOLD, 18));
			lblMotto.setBackground(Color.BLACK);
			lblMotto.setBounds(339, 421, 612, 35);
			BiographyFrame.getContentPane().add(lblMotto);
			
			JLabel Background = new JLabel("Background Image");
			Background.setForeground(new Color(0, 0, 0));
			Background.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Biographybg.png"));
			Background.setBounds(0, 0, 1019, 551);
			BiographyFrame.getContentPane().add(Background);
			
		}
	}
