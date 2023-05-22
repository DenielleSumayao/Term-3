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

public class Artworks{
	JFrame ArtworksFrame;

	//Application Launch
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Artworks window = new Artworks();
						window.ArtworksFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	//Application Creation
		public Artworks() {
			initialize();
		}

	//Initializing the contents of the frame
		private void initialize() {
			ArtworksFrame = new JFrame();
			ArtworksFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
			ArtworksFrame.setBackground(new Color(0, 0, 128));
			ArtworksFrame.setTitle("Welcome!");
			ArtworksFrame.setBounds(100, 100, 1038, 592);
			ArtworksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ArtworksFrame.getContentPane().setLayout(null);
			
			JButton btnProceed = new JButton("Return");
			btnProceed.setForeground(new Color(255, 255, 255));
			btnProceed.setBackground(new Color(9, 26, 85));
			btnProceed.setFont(new Font("Product Sans", Font.BOLD, 15));
			btnProceed.setBounds(882, 519, 87, 23);
			ArtworksFrame.getContentPane().add(btnProceed);
			btnProceed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					ArtworksFrame.dispose();
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				}
			});
			
			JLabel Background = new JLabel("Background Image");
			Background.setForeground(new Color(0, 0, 0));
			Background.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Artworksbg2.png"));
			Background.setBounds(0, 0, 1019, 551);
			ArtworksFrame.getContentPane().add(Background);
			
		}
	}
