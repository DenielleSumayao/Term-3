import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class Login extends JFrame {
    final private Font mainFont = new FontUIResource("Cambria", Font.BOLD, 18);

    JLabel lbUserName, lbPassword;

    JTextField tfUserName;

    JPasswordField jpPassword;

    JButton btnLogin, btnClear;

    public void LoadForm(){

        lbUserName = new JLabel("User Name");
        lbUserName.setFont(mainFont);

        lbPassword = new JLabel("Password");
        lbPassword.setFont(mainFont);

        tfUserName = new JTextField();
        tfUserName.setFont(mainFont);

        jpPassword = new JPasswordField();
        jpPassword.setFont(mainFont);

        btnLogin = new JButton("Login");
        btnLogin.setFont(mainFont);
        btnLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String userName = tfUserName.getText();
                String password = new String(jpPassword.getPassword());
    
                //To check user log in
                if(userName.equals("Denielle Sumayao") && password.equals("Skywalker15")){
                    JOptionPane.showMessageDialog(rootPane, "Log In Successful!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Log In Failed. User Name/Password Invalid.");
                }
            }
            
        });

        btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                tfUserName.setText("");
                jpPassword.setText("");
            } 
            
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbUserName);
        formPanel.add(tfUserName);
        formPanel.add(lbPassword);
        formPanel.add(jpPassword);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnClear);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        this.add(mainPanel);

        setTitle("Login Form");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200, 100));
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Login main = new Login();
        main.LoadForm();
    }
}
