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

public class Awards {
	JFrame AwardsFrame;
	
	Inheritance2 info = new Inheritance2();

//Application Launch
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Awards window = new Awards();
					window.AwardsFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Application Creation
	public Awards() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		AwardsFrame = new JFrame();
		AwardsFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		AwardsFrame.setBackground(new Color(0, 0, 128));
		AwardsFrame.setTitle("Academic Awards");
		AwardsFrame.setBounds(100, 100, 1053, 635);
		AwardsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AwardsFrame.setLocationRelativeTo(null);
		AwardsFrame.getContentPane().setLayout(null);
		
		JLabel College = new JLabel(info.College);
		College.setForeground(new Color(0, 0, 128));
		College.setFont(new Font("Arial", Font.BOLD, 15));
		College.setBounds(668, 473, 288, 29);
		AwardsFrame.getContentPane().add(College);
		
		JLabel JHS = new JLabel(info.JHS);
		JHS.setForeground(new Color(0, 0, 128));
		JHS.setFont(new Font("Arial", Font.BOLD, 15));
		JHS.setBounds(668, 293, 288, 29);
		AwardsFrame.getContentPane().add(JHS);
		
		JLabel Elem = new JLabel(info.Elem);
		Elem.setForeground(new Color(0, 0, 128));
		Elem.setFont(new Font("Arial", Font.BOLD, 15));
		Elem.setBounds(267, 423, 288, 29);
		AwardsFrame.getContentPane().add(Elem);
		
		JLabel SHS = new JLabel(info.SHS);
		SHS.setForeground(new Color(0, 0, 128));
		SHS.setFont(new Font("Arial", Font.BOLD, 15));
		SHS.setBounds(267, 293, 288, 29);
		AwardsFrame.getContentPane().add(SHS);
		
		JButton AboutMe = new JButton("");
		AboutMe.setForeground(new Color(255, 255, 255));
		AboutMe.setBackground(new Color(9, 26, 85));
		AboutMe.setFont(new Font("Product Sans", Font.BOLD, 15));
		AboutMe.setContentAreaFilled(false);
		AboutMe.setOpaque(false);
		AboutMe.setBorderPainted(false);
		AboutMe.setBounds(0, 240, 224, 57);
		AwardsFrame.getContentPane().add(AboutMe);
		AboutMe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AwardsFrame.dispose();
				AboutMe window = new AboutMe();
				window.AboutMeFrame.setVisible(true);
			}
		});
		
		JButton Hobbies = new JButton("");
		Hobbies.setForeground(new Color(255, 255, 255));
		Hobbies.setBackground(new Color(9, 26, 85));
		Hobbies.setFont(new Font("Product Sans", Font.BOLD, 15));
		Hobbies.setContentAreaFilled(false);
		Hobbies.setOpaque(false);
		Hobbies.setBorderPainted(false);
		Hobbies.setBounds(0, 311, 224, 51);
		AwardsFrame.getContentPane().add(Hobbies);
		Hobbies.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AwardsFrame.dispose();
				Hobbies window = new Hobbies();
				window.HobbiesFrame.setVisible(true);
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
		AwardsFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AwardsFrame.dispose();
				Education window = new Education();
				window.EducationFrame.setVisible(true);
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
		AwardsFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AwardsFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		JLabel BSIT = new JLabel(info.Program);
		BSIT.setForeground(new Color(0, 0, 0));
		BSIT.setFont(new Font("Arial", Font.PLAIN, 10));
		BSIT.setBounds(668, 489, 276, 29);
		AwardsFrame.getContentPane().add(BSIT);
		
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(Awards.class.getResource("/Images/Awards.png")));
		Background.setBounds(0, 0, 1037, 596);
		AwardsFrame.getContentPane().add(Background);
		
	}
}
