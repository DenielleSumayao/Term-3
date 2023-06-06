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

public class Artworks {
	JFrame ArtworksFrame;

	Inheritance2 info = new Inheritance2();
	
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
		ArtworksFrame.setTitle("Artworks");
		ArtworksFrame.setBounds(100, 100, 1053, 635);
		ArtworksFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ArtworksFrame.setLocationRelativeTo(null);
		ArtworksFrame.getContentPane().setLayout(null);
		
		JLabel Leia = new JLabel(info.Artwork1);
		Leia.setHorizontalAlignment(SwingConstants.CENTER);
		Leia.setForeground(new Color(0, 0, 128));
		Leia.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Leia.setBounds(257, 500, 198, 29);
		ArtworksFrame.getContentPane().add(Leia);
		
		JLabel Totoro = new JLabel(info.Artwork2);
		Totoro.setHorizontalAlignment(SwingConstants.CENTER);
		Totoro.setForeground(new Color(0, 0, 128));
		Totoro.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Totoro.setBounds(492, 489, 273, 29);
		ArtworksFrame.getContentPane().add(Totoro);
		
		JLabel Jane = new JLabel(info.Artwork3);
		Jane.setHorizontalAlignment(SwingConstants.CENTER);
		Jane.setForeground(new Color(0, 0, 128));
		Jane.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Jane.setBounds(803, 500, 198, 29);
		ArtworksFrame.getContentPane().add(Jane);
		
		JButton AboutMe = new JButton("");
		AboutMe.setForeground(new Color(255, 255, 255));
		AboutMe.setBackground(new Color(9, 26, 85));
		AboutMe.setFont(new Font("Product Sans", Font.BOLD, 15));
		AboutMe.setContentAreaFilled(false);
		AboutMe.setOpaque(false);
		AboutMe.setBorderPainted(false);
		AboutMe.setBounds(0, 240, 224, 57);
		ArtworksFrame.getContentPane().add(AboutMe);
		AboutMe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArtworksFrame.dispose();
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
		ArtworksFrame.getContentPane().add(Hobbies);
		Hobbies.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArtworksFrame.dispose();
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
		ArtworksFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArtworksFrame.dispose();
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
		ArtworksFrame.getContentPane().add(Awards);
		Awards.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ArtworksFrame.dispose();
				Awards window = new Awards();
				window.AwardsFrame.setVisible(true);
			}
		});
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(Artworks.class.getResource("/Images/Artworks.png")));
		Background.setBounds(0, 0, 1037, 596);
		ArtworksFrame.getContentPane().add(Background);
		
	}
}
