package BookRentalSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Books {

	JFrame Booksframe;
	private JTextField txtBookNum;
	private int[] bookList = {3, 4, 5, 1, 2};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Books window = new Books();
					window.Booksframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Books() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Booksframe = new JFrame();
		Booksframe.setTitle("Library");
		Booksframe.setBounds(100, 100, 1037, 592);
		Booksframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Booksframe.getContentPane().setLayout(null);
		
		JLabel AvailBooks = new JLabel("NU LIBRARY");
		AvailBooks.setForeground(Color.BLACK);
		AvailBooks.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		AvailBooks.setHorizontalAlignment(SwingConstants.CENTER);
		AvailBooks.setBounds(324, 21, 369, 49);
		Booksframe.getContentPane().add(AvailBooks);
		
		JLabel Book1 = new JLabel("Artemis Fowl (2001)");
		Book1.setForeground(Color.BLACK);
		Book1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		Book1.setHorizontalAlignment(SwingConstants.CENTER);
		Book1.setBounds(81, 121, 232, 19);
		Booksframe.getContentPane().add(Book1);
		
		JLabel Author1 = new JLabel("Eoin Colfer");
		Author1.setForeground(Color.BLACK);
		Author1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		Author1.setBounds(81, 141, 232, 19);
		Booksframe.getContentPane().add(Author1);
		
		JLabel Author1_1 = new JLabel("Copies Available: 3");
		Author1_1.setForeground(Color.BLACK);
		Author1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		Author1_1.setBounds(81, 159, 232, 19);
		Booksframe.getContentPane().add(Author1_1);
		
		JLabel lblBookTitles = new JLabel("Listed below are the books still available today:");
		lblBookTitles.setForeground(Color.BLACK);
		lblBookTitles.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookTitles.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblBookTitles.setBounds(324, 62, 363, 29);
		Booksframe.getContentPane().add(lblBookTitles);
		
		JLabel lblNewLabel = new JLabel("BOOK CODE:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel.setBounds(321, 482, 142, 56);
		Booksframe.getContentPane().add(lblNewLabel);
		
		txtBookNum = new JTextField();
		txtBookNum.setForeground(Color.BLACK);
		txtBookNum.setBounds(459, 493, 118, 36);
		Booksframe.getContentPane().add(txtBookNum);
		txtBookNum.setColumns(10);
		
		JButton btnBorrow = new JButton("BORROW");
		btnBorrow.setForeground(Color.BLACK);
		btnBorrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnBorrow) {
		            int bookNum = Integer.parseInt(txtBookNum.getText());
		            if (bookNum >= 0 && bookNum < bookList.length && bookList[bookNum] > 0) {
		                bookList[bookNum]--;
		                
		                JOptionPane.showMessageDialog(Booksframe, "Book borrowed successfully!");
		            } 
		            else if
		            
		            	(bookNum >= 5) {
			             
			             JOptionPane.showMessageDialog(Booksframe, "INDEX DOES NOT EXIST, try again");
		            	
		            }
		      
		            else {
		                JOptionPane.showMessageDialog(Booksframe, "Book not available.");
		            }
		        }
			}
		});
		btnBorrow.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnBorrow.setBounds(606, 500, 109, 21);
		Booksframe.getContentPane().add(btnBorrow);
		
		JLabel Author1_1_1 = new JLabel("Copies Available: 4");
		Author1_1_1.setForeground(Color.BLACK);
		Author1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		Author1_1_1.setBounds(394, 159, 232, 19);
		Booksframe.getContentPane().add(Author1_1_1);
		
		JLabel lblVeronicaRoth = new JLabel("Veronica Roth");
		lblVeronicaRoth.setForeground(Color.BLACK);
		lblVeronicaRoth.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeronicaRoth.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblVeronicaRoth.setBounds(394, 141, 232, 19);
		Booksframe.getContentPane().add(lblVeronicaRoth);
		
		JLabel lblDivergent = new JLabel("Divergent (2011)");
		lblDivergent.setForeground(Color.BLACK);
		lblDivergent.setHorizontalAlignment(SwingConstants.CENTER);
		lblDivergent.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblDivergent.setBounds(394, 121, 232, 19);
		Booksframe.getContentPane().add(lblDivergent);
		
		JLabel Author1_1_2 = new JLabel("Copies Available: 5");
		Author1_1_2.setForeground(Color.BLACK);
		Author1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		Author1_1_2.setBounds(720, 159, 232, 19);
		Booksframe.getContentPane().add(Author1_1_2);
		
		JLabel lblRickRiordan = new JLabel("Rick Riordan");
		lblRickRiordan.setForeground(Color.BLACK);
		lblRickRiordan.setHorizontalAlignment(SwingConstants.CENTER);
		lblRickRiordan.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblRickRiordan.setBounds(720, 141, 232, 19);
		Booksframe.getContentPane().add(lblRickRiordan);
		
		JLabel lblPercyJackson = new JLabel("Percy Jackson (2005)");
		lblPercyJackson.setForeground(Color.BLACK);
		lblPercyJackson.setHorizontalAlignment(SwingConstants.CENTER);
		lblPercyJackson.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPercyJackson.setBounds(720, 121, 232, 19);
		Booksframe.getContentPane().add(lblPercyJackson);
		
		JLabel lblCode = new JLabel("Code: 1");
		lblCode.setForeground(Color.BLACK);
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCode.setBounds(394, 103, 232, 19);
		Booksframe.getContentPane().add(lblCode);
		
		JLabel lblCode_2 = new JLabel("Code: 2");
		lblCode_2.setForeground(Color.BLACK);
		lblCode_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCode_2.setBounds(720, 102, 232, 19);
		Booksframe.getContentPane().add(lblCode_2);
		
		JLabel lblCode_3 = new JLabel("Code: 0");
		lblCode_3.setForeground(Color.BLACK);
		lblCode_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCode_3.setBounds(81, 102, 232, 19);
		Booksframe.getContentPane().add(lblCode_3);
		
		JLabel Author1_1_1_1 = new JLabel("Copies Available: 2");
		Author1_1_1_1.setForeground(Color.BLACK);
		Author1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1_1_1.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		Author1_1_1_1.setBounds(567, 345, 232, 19);
		Booksframe.getContentPane().add(Author1_1_1_1);
		
		JLabel lblVeronicaRoth_1 = new JLabel("Veronica Roth");
		lblVeronicaRoth_1.setForeground(Color.BLACK);
		lblVeronicaRoth_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVeronicaRoth_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblVeronicaRoth_1.setBounds(567, 327, 232, 19);
		Booksframe.getContentPane().add(lblVeronicaRoth_1);
		
		JLabel lblToKillA = new JLabel("To Kill a Mockingbird (1960)");
		lblToKillA.setForeground(Color.BLACK);
		lblToKillA.setHorizontalAlignment(SwingConstants.CENTER);
		lblToKillA.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblToKillA.setBounds(567, 307, 232, 19);
		Booksframe.getContentPane().add(lblToKillA);
		
		JLabel lblCode_4 = new JLabel("Code: 4");
		lblCode_4.setForeground(Color.BLACK);
		lblCode_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCode_4.setBounds(567, 289, 232, 19);
		Booksframe.getContentPane().add(lblCode_4);
		
		JLabel Author1_1_1_2 = new JLabel("Copies Available: 1");
		Author1_1_1_2.setForeground(Color.BLACK);
		Author1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		Author1_1_1_2.setFont(new Font("Trebuchet MS", Font.ITALIC, 12));
		Author1_1_1_2.setBounds(222, 345, 232, 19);
		Booksframe.getContentPane().add(Author1_1_1_2);
		
		JLabel lblJaneAusten = new JLabel("Jane Austen");
		lblJaneAusten.setForeground(Color.BLACK);
		lblJaneAusten.setHorizontalAlignment(SwingConstants.CENTER);
		lblJaneAusten.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblJaneAusten.setBounds(222, 327, 232, 19);
		Booksframe.getContentPane().add(lblJaneAusten);
		
		JLabel lblPridePrejudice = new JLabel("Pride & Prejudice (1813)");
		lblPridePrejudice.setForeground(Color.BLACK);
		lblPridePrejudice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPridePrejudice.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblPridePrejudice.setBounds(222, 307, 232, 19);
		Booksframe.getContentPane().add(lblPridePrejudice);
		
		JLabel lblCode_5 = new JLabel("Code: 3");
		lblCode_5.setForeground(Color.BLACK);
		lblCode_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblCode_5.setBounds(222, 289, 232, 19);
		Booksframe.getContentPane().add(lblCode_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\Divergent.png"));
		lblNewLabel_1_1.setBounds(481, 183, 60, 94);
		Booksframe.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\PercyJackson.png"));
		lblNewLabel_1_1_1.setBounds(807, 183, 60, 94);
		Booksframe.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\PrideandPrejudice.png"));
		lblNewLabel_1_1_1_1.setBounds(311, 376, 60, 94);
		Booksframe.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\ToKillAMockingbird.png"));
		lblNewLabel_1_1_1_1_1.setBounds(656, 376, 60, 94);
		Booksframe.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Logo");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\National_University_seal4.png"));
		lblNewLabel_4.setBounds(349, 341, 706, 229);
		Booksframe.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Background Image");
		Booksframe.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("New label");
		lblNewLabel_1_1_2.setBackground(new Color(238, 238, 238));
		lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\Artemis Fowl2.png"));
		lblNewLabel_1_1_2.setBounds(170, 190, 60, 94);
		Booksframe.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\white.png"));
		lblNewLabel_2.setBounds(0, 0, 1021, 553);
		Booksframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Sumayao\\Downloads\\banner-nu-manila(1).png"));
		lblNewLabel_1.setBounds(0, 0, 1021, 553);
		Booksframe.getContentPane().add(lblNewLabel_1);
	}
}
