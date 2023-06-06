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

public class HobbiesB {
	JFrame HobbiesBFrame;
	
	Inheritance2 info = new Inheritance2();

//Application Launch
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HobbiesB window = new HobbiesB();
					window.HobbiesBFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Application Creation
	public HobbiesB() {
		initialize();
	}

//Initializing the contents of the frame
	private void initialize() {
		HobbiesBFrame = new JFrame();
		HobbiesBFrame.setFont(new Font("Product Sans", Font.PLAIN, 12));
		HobbiesBFrame.setBackground(new Color(0, 0, 128));
		HobbiesBFrame.setTitle("Hobbies");
		HobbiesBFrame.setBounds(100, 100, 1053, 635);
		HobbiesBFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HobbiesBFrame.setLocationRelativeTo(null);
		HobbiesBFrame.getContentPane().setLayout(null);
		
		JLabel Play1 = new JLabel(info.Play4);
		Play1.setHorizontalAlignment(SwingConstants.CENTER);
		Play1.setForeground(new Color(0, 0, 128));
		Play1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Play1.setBounds(267, 295, 205, 29);
		HobbiesBFrame.getContentPane().add(Play1);
		
		JLabel Play2 = new JLabel(info.Play5);
		Play2.setHorizontalAlignment(SwingConstants.CENTER);
		Play2.setForeground(new Color(0, 0, 128));
		Play2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Play2.setBounds(507, 326, 243, 29);
		HobbiesBFrame.getContentPane().add(Play2);
		
		JLabel Play3 = new JLabel(info.Play6);
		Play3.setHorizontalAlignment(SwingConstants.CENTER);
		Play3.setForeground(new Color(0, 0, 128));
		Play3.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 15));
		Play3.setBounds(805, 295, 162, 29);
		HobbiesBFrame.getContentPane().add(Play3);
		
		JButton AboutMe = new JButton("");
		AboutMe.setForeground(new Color(255, 255, 255));
		AboutMe.setBackground(new Color(9, 26, 85));
		AboutMe.setFont(new Font("Product Sans", Font.BOLD, 15));
		AboutMe.setContentAreaFilled(false);
		AboutMe.setOpaque(false);
		AboutMe.setBorderPainted(false);
		AboutMe.setBounds(0, 240, 224, 57);
		HobbiesBFrame.getContentPane().add(AboutMe);
		AboutMe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesBFrame.dispose();
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
		HobbiesBFrame.getContentPane().add(Education);
		Education.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesBFrame.dispose();
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
		HobbiesBFrame.getContentPane().add(Awards);
		Awards.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesBFrame.dispose();
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
		HobbiesBFrame.getContentPane().add(Artworks);
		Artworks.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesBFrame.dispose();
				Artworks window = new Artworks();
				window.ArtworksFrame.setVisible(true);
			}
		});
		
		JButton Return = new JButton("");
		Return.setForeground(new Color(255, 255, 255));
		Return.setBackground(new Color(9, 26, 85));
		Return.setFont(new Font("Product Sans", Font.BOLD, 15));
		Return.setContentAreaFilled(false);
		Return.setOpaque(false);
		Return.setBorderPainted(false);
		Return.setBounds(257, 240, 118, 44);
		HobbiesBFrame.getContentPane().add(Return);
		Return.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				HobbiesBFrame.dispose();
				HobbiesA window = new HobbiesA();
				window.HobbiesAFrame.setVisible(true);
			}
		});
		
		JLabel Role1 = new JLabel(info.Role4);
		Role1.setHorizontalAlignment(SwingConstants.CENTER);
		Role1.setForeground(new Color(0, 0, 128));
		Role1.setFont(new Font("Arial", Font.BOLD, 13));
		Role1.setBounds(293, 531, 162, 29);
		HobbiesBFrame.getContentPane().add(Role1);
		
		JLabel Role2 = new JLabel(info.Role6);
		Role2.setHorizontalAlignment(SwingConstants.CENTER);
		Role2.setForeground(new Color(0, 0, 128));
		Role2.setFont(new Font("Arial", Font.BOLD, 13));
		Role2.setBounds(805, 538, 162, 29);
		HobbiesBFrame.getContentPane().add(Role2);
		
		JLabel Role3 = new JLabel(info.Role2);
		Role3.setHorizontalAlignment(SwingConstants.CENTER);
		Role3.setForeground(new Color(0, 0, 128));
		Role3.setFont(new Font("Arial", Font.BOLD, 13));
		Role3.setBounds(507, 501, 243, 29);
		HobbiesBFrame.getContentPane().add(Role3);
		
		
		JLabel Background = new JLabel("Background Image");
		Background.setForeground(new Color(0, 0, 0));
		Background.setIcon(new ImageIcon(HobbiesB.class.getResource("/Images/HobbiesB.png")));
		Background.setBounds(0, 0, 1037, 596);
		HobbiesBFrame.getContentPane().add(Background);
		
	}
}
