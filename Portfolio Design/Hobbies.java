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

public class Hobbies{
	JFrame HobbiesFrame;

	//Application Launch
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Hobbies window = new Hobbies();
						window.HobbiesFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	//Application Creation
		public Hobbies() {
			initialize();
		}

	//Initializing the contents of the frame
		private void initialize() {
			HobbiesFrame = new JFrame();
			HobbiesFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
			HobbiesFrame.setBackground(new Color(0, 0, 128));
			HobbiesFrame.setTitle("Welcome!");
			HobbiesFrame.setBounds(100, 100, 1038, 592);
			HobbiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			HobbiesFrame.getContentPane().setLayout(null);
			
			JButton btnProceed = new JButton("Return");
			btnProceed.setForeground(new Color(255, 255, 255));
			btnProceed.setBackground(new Color(9, 26, 85));
			btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
			btnProceed.setBounds(882, 519, 87, 23);
			HobbiesFrame.getContentPane().add(btnProceed);
			btnProceed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					HobbiesFrame.dispose();
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				}
			});
			
			JLabel lblDraw = new JLabel("Drawing");
			lblDraw.setForeground(new Color(0, 64, 128));
			lblDraw.setFont(new Font("Dialog", Font.BOLD, 15));
			lblDraw.setBackground(Color.BLACK);
			lblDraw.setBounds(465, 336, 58, 35);
			HobbiesFrame.getContentPane().add(lblDraw);
			
			JLabel lblSing = new JLabel("Singing");
			lblSing.setForeground(new Color(0, 64, 128));
			lblSing.setFont(new Font("Dialog", Font.BOLD, 15));
			lblSing.setBackground(Color.BLACK);
			lblSing.setBounds(658, 336, 54, 35);
			HobbiesFrame.getContentPane().add(lblSing);
			
			JLabel lblDance = new JLabel("Dancing");
			lblDance.setForeground(new Color(0, 64, 128));
			lblDance.setFont(new Font("Dialog", Font.BOLD, 15));
			lblDance.setBackground(Color.BLACK);
			lblDance.setBounds(850, 336, 58, 35);
			HobbiesFrame.getContentPane().add(lblDance);
			
			JLabel Background = new JLabel("Background Image");
			Background.setForeground(new Color(0, 0, 0));
			Background.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Hobbiesbg.png"));
			Background.setBounds(0, 0, 1019, 551);
			HobbiesFrame.getContentPane().add(Background);
			
		}
	}
