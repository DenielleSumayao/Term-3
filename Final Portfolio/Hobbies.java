package Portfolio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Hobbies {
	JFrame HobbiesFrame;
	
	Inheritance2 info = new Inheritance2();

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
		HobbiesFrame.setTitle("Hobbies");
		HobbiesFrame.setBounds(100, 100, 1053, 635);
		HobbiesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HobbiesFrame.setLocationRelativeTo(null);
		HobbiesFrame.getContentPane().setLayout(null);
		
		JLabel Hobby1 = new JLabel(info.Hobby1);
		Hobby1.setHorizontalAlignment(SwingConstants.CENTER);
		Hobby1.setForeground(new Color(0, 0, 128));
		Hobby1.setFont(new Font("Arial", Font.BOLD, 15));
		Hobby1.setBounds(234, 283, 243, 29);
		HobbiesFrame.getContentPane().add(Hobby1);
		
		JLabel Hobby2 = new JLabel(info.Hobby2);
		Hobby2.setHorizontalAlignment(SwingConstants.CENTER);
		Hobby2.setForeground(new Color(0, 0, 128));
		Hobby2.setFont(new Font("Arial", Font.BOLD, 15));
		Hobby2.setBounds(498, 283, 268, 29);
		HobbiesFrame.getContentPane().add(Hobby2);
		
		JLabel Hobby3 = new JLabel(info.Hobby3);
		Hobby3.setHorizontalAlignment(SwingConstants.CENTER);
		Hobby3.setForeground(new Color(0, 0, 128));
		Hobby3.setFont(new Font("Arial", Font.BOLD, 15));
		Hobby3.setBounds(789, 283, 238, 29);
		HobbiesFrame.getContentPane().add(Hobby3);
		
		JButton AboutMe = new JButton("");
		AboutMe.setForeground(new Color(255, 255, 255));
		AboutMe.setBackground(new Color(9, 26, 85));
		AboutMe.setFont(new Font("Product Sans", Font.BOLD, 15));
		AboutMe.setContentAreaFilled(false);
		AboutMe.setOpaque(false);
		AboutMe.setBorderPainted(false);
		AboutMe.setBounds(0, 240, 224, 57);
		HobbiesFrame.getContentPane().add(AboutMe);
		AboutMe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesFrame.dispose();
				AboutMe window = new AboutMe();
				window.AboutMeFrame.setVisible(true);
			}
		});
		
		JButton Education = new JButton("");
		Education.setForeground(new Color(255, 255, 255));
		Education.setBackground(new Color(9, 26, 85));
		Education.setFont(new Font("Product Sans", Font.BOLD, 15));
		Education.setContentAreaFilled(false);
		Education.setOpaque(false);
		Education.setBorderPainted(false);
		Education.setBounds(0, 379, 224, 57);
		HobbiesFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesFrame.dispose();
				Education window = new Education();
				window.EducationFrame.setVisible(true);
			}
		});
		
		JButton Awards = new JButton("");
		Awards.setForeground(new Color(255, 255, 255));
		Awards.setBackground(new Color(9, 26, 85));
		Awards.setFont(new Font("Product Sans", Font.BOLD, 15));
		Awards.setContentAreaFilled(false);
		Awards.setOpaque(false);
		Awards.setBorderPainted(false);
		Awards.setBounds(0, 447, 224, 57);
		HobbiesFrame.getContentPane().add(Awards);
		Awards.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesFrame.dispose();
				Awards window = new Awards();
				window.AwardsFrame.setVisible(true);
			}
		});
		
		JButton Artworks = new JButton("");
		Artworks.setForeground(new Color(255, 255, 255));
		Artworks.setBackground(new Color(9, 26, 85));
		Artworks.setFont(new Font("Product Sans", Font.BOLD, 15));
		Artworks.setContentAreaFilled(false);
		Artworks.setOpaque(false);
		Artworks.setBorderPainted(false);
		Artworks.setBounds(0, 521, 229, 51);
		HobbiesFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		JButton HobbiesA = new JButton("");
		HobbiesA.setForeground(new Color(255, 255, 255));
		HobbiesA.setBackground(new Color(9, 26, 85));
		HobbiesA.setFont(new Font("Product Sans", Font.BOLD, 15));
		HobbiesA.setContentAreaFilled(false);
		HobbiesA.setOpaque(false);
		HobbiesA.setBorderPainted(false);
		HobbiesA.setBounds(841, 510, 157, 35);
		HobbiesFrame.getContentPane().add(HobbiesA);
		HobbiesA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesFrame.dispose();
				HobbiesA window = new HobbiesA();
				window.HobbiesAFrame.setVisible(true);
			}
		});
		
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(Hobbies.class.getResource("/Images/Hobbies.png")));
		Background.setBounds(0, 0, 1037, 596);
		HobbiesFrame.getContentPane().add(Background);
		
	}
}
