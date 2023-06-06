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

public class Education {
	JFrame EducationFrame;
	
	Inheritance2 info = new Inheritance2();

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
		EducationFrame.setTitle("Educational Background");
		EducationFrame.setBounds(100, 100, 1053, 635);
		EducationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		EducationFrame.setLocationRelativeTo(null);
		EducationFrame.getContentPane().setLayout(null);
		
		JLabel SBIS = new JLabel(info.Education1);
		SBIS.setForeground(new Color(0, 0, 128));
		SBIS.setFont(new Font("Arial", Font.BOLD, 15));
		SBIS.setBounds(647, 324, 288, 29);
		EducationFrame.getContentPane().add(SBIS);
		
		JLabel SMCB = new JLabel(info.Education2);
		SMCB.setForeground(new Color(0, 0, 128));
		SMCB.setFont(new Font("Arial", Font.BOLD, 15));
		SMCB.setBounds(261, 489, 283, 29);
		EducationFrame.getContentPane().add(SMCB);
		
		JLabel NU = new JLabel(info.Education3);
		NU.setForeground(new Color(0, 0, 128));
		NU.setFont(new Font("Arial", Font.BOLD, 15));
		NU.setBounds(256, 324, 288, 29);
		EducationFrame.getContentPane().add(NU);
		
		JButton AboutMe = new JButton("");
		AboutMe.setForeground(new Color(255, 255, 255));
		AboutMe.setBackground(new Color(9, 26, 85));
		AboutMe.setFont(new Font("Product Sans", Font.BOLD, 15));
		AboutMe.setContentAreaFilled(false);
		AboutMe.setOpaque(false);
		AboutMe.setBorderPainted(false);
		AboutMe.setBounds(0, 240, 224, 57);
		EducationFrame.getContentPane().add(AboutMe);
		AboutMe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EducationFrame.dispose();
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
		EducationFrame.getContentPane().add(Hobbies);
		Hobbies.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EducationFrame.dispose();
				Hobbies window = new Hobbies();
				window.HobbiesFrame.setVisible(true);
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
		EducationFrame.getContentPane().add(Awards);
		Awards.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EducationFrame.dispose();
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
		EducationFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				EducationFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		JLabel SBIS2 = new JLabel(info.Education4);
		SBIS2.setForeground(new Color(0, 0, 128));
		SBIS2.setFont(new Font("Arial", Font.BOLD, 15));
		SBIS2.setBounds(647, 346, 288, 29);
		EducationFrame.getContentPane().add(SBIS2);
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(Education.class.getResource("/Images/Education.png")));
		Background.setBounds(0, 0, 1037, 596);
		EducationFrame.getContentPane().add(Background);
		
	}
}
