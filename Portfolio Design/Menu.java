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

public class Menu {
	JFrame MenuFrame;

//Application Launch
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.MenuFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Application Creation
	public Menu() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		MenuFrame = new JFrame();
		MenuFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		MenuFrame.setBackground(new Color(0, 0, 128));
		MenuFrame.setTitle("Welcome!");
		MenuFrame.setBounds(100, 100, 1047, 634);
		MenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MenuFrame.getContentPane().setLayout(null);
		
		JButton Exit = new JButton("Exit");
		Exit.setForeground(new Color(255, 255, 255));
		Exit.setBackground(new Color(9, 26, 85));
		Exit.setFont(new Font("Product Sans", Font.BOLD, 8));
		Exit.setBounds(1031, 0, 0, 6);
		MenuFrame.getContentPane().add(Exit);
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
			}
		});
		
		JButton Achievements = new JButton("Achievements");
		Achievements.setForeground(new Color(255, 255, 255));
		Achievements.setBackground(new Color(9, 26, 85));
		Achievements.setFont(new Font("Product Sans", Font.BOLD, 15));
		Achievements.setBounds(733, 166, 199, 50);
		MenuFrame.getContentPane().add(Achievements);
		Achievements.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
				Achievements window = new Achievements();
				window.AchievementsFrame.setVisible(true);
			}
		});
		
		JButton Artworks = new JButton("Digital Artworks");
		Artworks.setForeground(new Color(255, 255, 255));
		Artworks.setBackground(new Color(9, 26, 85));
		Artworks.setFont(new Font("Product Sans", Font.BOLD, 15));
		Artworks.setBounds(480, 380, 199, 50);
		MenuFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		JButton Hobbies = new JButton("Hobbies");
		Hobbies.setForeground(new Color(255, 255, 255));
		Hobbies.setBackground(new Color(9, 26, 85));
		Hobbies.setFont(new Font("Product Sans", Font.BOLD, 15));
		Hobbies.setBounds(480, 271, 199, 50);
		MenuFrame.getContentPane().add(Hobbies);
		Hobbies.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
				Hobbies window = new Hobbies();
				window.HobbiesFrame.setVisible(true);
			}
		});

		JButton Biography = new JButton("Biography");
		Biography.setForeground(new Color(255, 255, 255));
		Biography.setBackground(new Color(9, 26, 85));
		Biography.setFont(new Font("Product Sans", Font.BOLD, 15));
		Biography.setBounds(480, 166, 199, 50);
		MenuFrame.getContentPane().add(Biography);
		Biography.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
				Biography window = new Biography();
				window.BiographyFrame.setVisible(true);
			}
		});
		
		JButton Education = new JButton("Education");
		Education.setForeground(new Color(255, 255, 255));
		Education.setBackground(new Color(9, 26, 85));
		Education.setFont(new Font("Product Sans", Font.BOLD, 15));
		Education.setBounds(733, 271, 199, 50);
		MenuFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MenuFrame.dispose();
				Education window = new Education();
				window.EducationFrame.setVisible(true);
			}
		});


		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\National University\\Downloads\\GUI\\Menubg.png"));
		lblNewLabel_2.setBounds(0, -15, 1057, 623);
		MenuFrame.getContentPane().add(lblNewLabel_2);
	}
}
