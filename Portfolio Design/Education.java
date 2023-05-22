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

public class Education{
	JFrame EducationFrame;

	//Application Launch
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Education window = new Education();
						window.EducationFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	//Application Creation
		public Education() {
			initialize();
		}

	//Initializing the contents of the frame
		private void initialize() {
			EducationFrame = new JFrame();
			EducationFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
			EducationFrame.setBackground(new Color(0, 0, 128));
			EducationFrame.setTitle("Welcome!");
			EducationFrame.setBounds(100, 100, 1038, 592);
			EducationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			EducationFrame.getContentPane().setLayout(null);
			
			JButton btnProceed = new JButton("Return");
			btnProceed.setForeground(new Color(255, 255, 255));
			btnProceed.setBackground(new Color(9, 26, 85));
			btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
			btnProceed.setBounds(882, 519, 87, 23);
			EducationFrame.getContentPane().add(btnProceed);
			btnProceed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					EducationFrame.dispose();
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				}
			});
			
			JLabel lblNU = new JLabel("National University of the Philippines");
			lblNU.setForeground(new Color(0, 64, 128));
			lblNU.setFont(new Font("Dialog", Font.BOLD, 18));
			lblNU.setBackground(Color.BLACK);
			lblNU.setBounds(429, 452, 428, 35);
			EducationFrame.getContentPane().add(lblNU);
			
			JLabel lblSBIS = new JLabel("St. Benilde Integrated School (Baliuag)");
			lblSBIS.setForeground(new Color(0, 64, 128));
			lblSBIS.setFont(new Font("Dialog", Font.BOLD, 18));
			lblSBIS.setBackground(Color.BLACK);
			lblSBIS.setBounds(605, 203, 350, 35);
			EducationFrame.getContentPane().add(lblSBIS);
			
			JLabel lblSMCB = new JLabel("St. Mary's College of Baliuag");
			lblSMCB.setForeground(new Color(0, 64, 128));
			lblSMCB.setFont(new Font("Dialog", Font.BOLD, 18));
			lblSMCB.setBackground(Color.BLACK);
			lblSMCB.setBounds(553, 335, 304, 35);
			EducationFrame.getContentPane().add(lblSMCB);
			
			JLabel lblKinder = new JLabel("Kinder 1 - Grade 10");
			lblKinder.setForeground(new Color(0, 64, 128));
			lblKinder.setFont(new Font("Dialog", Font.BOLD, 15));
			lblKinder.setBackground(Color.BLACK);
			lblKinder.setBounds(605, 242, 148, 35);
			EducationFrame.getContentPane().add(lblKinder);
			
			JLabel lblSHS = new JLabel("Senior High School - STEM");
			lblSHS.setForeground(new Color(0, 64, 128));
			lblSHS.setFont(new Font("Dialog", Font.BOLD, 15));
			lblSHS.setBackground(Color.BLACK);
			lblSHS.setBounds(553, 377, 229, 35);
			EducationFrame.getContentPane().add(lblSHS);
			
			JLabel lblBSIT = new JLabel("BSIT - Multimedia Arts & Animation");
			lblBSIT.setForeground(new Color(0, 64, 128));
			lblBSIT.setFont(new Font("Dialog", Font.BOLD, 15));
			lblBSIT.setBackground(Color.BLACK);
			lblBSIT.setBounds(429, 491, 291, 35);
			EducationFrame.getContentPane().add(lblBSIT);
			
			JLabel Background = new JLabel("Background Image");
			Background.setForeground(new Color(0, 0, 0));
			Background.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Educationbg.png"));
			Background.setBounds(0, 0, 1019, 551);
			EducationFrame.getContentPane().add(Background);
		}
	}
