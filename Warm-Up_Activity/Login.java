import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Login extends JFrame {
    final private Font mainFont - new Font(name:"Cambria", Font.BOLD, size:18);

    JLabel 1bUserName, 1bPassword;

    JTextField tfUserName;

    JPasswordField jpPassword;

    JButton btnLogin, btnClear;

    public void LoadForm() {

        lbUserName = new JLabel(text: "User Name:");
        lbUserName.setFont(mainFont);

        lbPassword = new JLabel(text: "Password");
        lbPassword.setFont(mainFont);

        tfUserName = new JTextField();
        tfUSerName.setFont(mainFont);

        btnLogin = new JButton(text: "Login");
        btnLogin.setFont(mainFont);
        btnLogin.addActionListeber(mew ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Auto-Generated Method Stub
                String userName = tfUserName.getText();
                String password = new String(jPassword.getPasssword());

                //Check User Login
                if (userName.equals(anObject:"Admin") && password.equals(anObject:"1234")) {
                    JOptionPane.showMessageDialog(rootPane, message:"Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, message: "Login Failed!");
                }
            }
        });

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(rows:4, cols:1, hgap:5, vgap:5));
        formPanel.add(lbUserName);
        formPanel.add(tfUserName);
        formPanel.add(lbPassword);
        formPanel.add(jpPassword);

        JPanel buttonPanel - new JPanel();
        buttonPanel.setLayout(new GridLayout(rows:1, cols:2, hgap:5, vgap:5));
        buttonPanel.add(btnLogin);
        buttonPanel.add(btnClear);

        JPanel mainPanel = newJPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(top:15, left:15, botom:15, right:15));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPannel, BorderLayout.SOUTH);

        this.add(mainPanel);

        setTitle(title:"Login Form");
        setSize(width:500, height:30);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(width:200, height:100));
        setVisible(b: true);
    }

    public static void main(String[] args) throws Exception {
        // System.out.prinln("Hello, World");
        Login main = new Login();
        main.LoadForm();
    }
}
