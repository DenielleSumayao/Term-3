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

public class AboutMe {
	JFrame AboutMeFrame;
	
	Inheritance2 info = new Inheritance2();

//Application Launch
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe window = new AboutMe();
					window.AboutMeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Application Creation
	public AboutMe() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		AboutMeFrame = new JFrame();
		AboutMeFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		AboutMeFrame.setBackground(new Color(0, 0, 128));
		AboutMeFrame.setTitle("About Me");
		AboutMeFrame.setBounds(100, 100, 1053, 635);
		AboutMeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AboutMeFrame.setLocationRelativeTo(null);
		AboutMeFrame.getContentPane().setLayout(null);
		
		JLabel Language2 = new JLabel(info.AboutMe2);
		Language2.setForeground(new Color(0, 0, 128));
		Language2.setFont(new Font("Arial", Font.BOLD, 15));
		Language2.setBounds(925, 389, 102, 29);
		AboutMeFrame.getContentPane().add(Language2);
		
		JLabel Language1 = new JLabel(info.AboutMe1);
		Language1.setForeground(new Color(0, 0, 128));
		Language1.setFont(new Font("Arial", Font.BOLD, 15));
		Language1.setBounds(925, 332, 102, 29);
		AboutMeFrame.getContentPane().add(Language1);
		
		JButton Hobbies = new JButton("");
		Hobbies.setForeground(new Color(255, 255, 255));
		Hobbies.setBackground(new Color(9, 26, 85));
		Hobbies.setFont(new Font("Product Sans", Font.BOLD, 15));
		Hobbies.setContentAreaFilled(false);
		Hobbies.setOpaque(false);
		Hobbies.setBorderPainted(false);
		Hobbies.setBounds(0, 311, 224, 51);
		AboutMeFrame.getContentPane().add(Hobbies);
		Hobbies.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMeFrame.dispose();
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
		AboutMeFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMeFrame.dispose();
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
		AboutMeFrame.getContentPane().add(Awards);
		Awards.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMeFrame.dispose();
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
		AboutMeFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				AboutMeFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(AboutMe.class.getResource("/Images/AboutMe.png")));
		Background.setBounds(0, 0, 1037, 596);
		AboutMeFrame.getContentPane().add(Background);
		
	}
}
