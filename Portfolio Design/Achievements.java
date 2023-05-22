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

public class Achievements{
	JFrame AchievementsFrame;

	//Application Launch
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Achievements window = new Achievements();
						window.AchievementsFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	//Application Creation
		public Achievements() {
			initialize();
		}

	//Initializing the contents of the frame
		private void initialize() {
			AchievementsFrame = new JFrame();
			AchievementsFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
			AchievementsFrame.setBackground(new Color(0, 0, 128));
			AchievementsFrame.setTitle("Welcome!");
			AchievementsFrame.setBounds(100, 100, 1038, 592);
			AchievementsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			AchievementsFrame.getContentPane().setLayout(null);
			
			JButton btnProceed = new JButton("Return");
			btnProceed.setForeground(new Color(255, 255, 255));
			btnProceed.setBackground(new Color(9, 26, 85));
			btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
			btnProceed.setBounds(882, 519, 87, 23);
			AchievementsFrame.getContentPane().add(btnProceed);
			btnProceed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					AchievementsFrame.dispose();
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				}
			});
		
			JLabel lblNewsletter = new JLabel("Became an editorial cartoonist of the Benildean Newsletter");
			lblNewsletter.setBackground(new Color(0, 0, 0));
			lblNewsletter.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNewsletter.setForeground(new Color(0, 64, 128));
			lblNewsletter.setBounds(526, 170, 443, 61);
			AchievementsFrame.getContentPane().add(lblNewsletter);
			
			JLabel lblBDC = new JLabel("Became an official member of Benilde Dance Crew");
			lblBDC.setForeground(new Color(0, 64, 128));
			lblBDC.setFont(new Font("Dialog", Font.BOLD, 15));
			lblBDC.setBackground(Color.BLACK);
			lblBDC.setBounds(555, 252, 391, 48);
			AchievementsFrame.getContentPane().add(lblBDC);
			
			JLabel lblTeatro = new JLabel("Became an official member of Teatro Benildo.");
			lblTeatro.setForeground(new Color(0, 64, 128));
			lblTeatro.setFont(new Font("Dialog", Font.BOLD, 15));
			lblTeatro.setBackground(Color.BLACK);
			lblTeatro.setBounds(504, 337, 442, 35);
			AchievementsFrame.getContentPane().add(lblTeatro);
			
			JLabel lblNationality = new JLabel("Elected senator under SMCB Student Government");
			lblNationality.setForeground(new Color(0, 64, 128));
			lblNationality.setFont(new Font("Dialog", Font.BOLD, 15));
			lblNationality.setBackground(Color.BLACK);
			lblNationality.setBounds(387, 399, 541, 35);
			AchievementsFrame.getContentPane().add(lblNationality);
			
			JLabel lblMotto = new JLabel("Became a graphic designer under the OPRO of NU Wizards Circle");
			lblMotto.setForeground(new Color(0, 64, 128));
			lblMotto.setFont(new Font("Dialog", Font.BOLD, 15));
			lblMotto.setBackground(Color.BLACK);
			lblMotto.setBounds(334, 475, 612, 35);
			AchievementsFrame.getContentPane().add(lblMotto);
			
			JLabel Background = new JLabel("Background Image");
			Background.setForeground(new Color(0, 0, 0));
			Background.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Achievementsbg.png"));
			Background.setBounds(0, 0, 1019, 551);
			AchievementsFrame.getContentPane().add(Background);
			
		}
	}
