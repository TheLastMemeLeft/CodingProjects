package Backup;

import javax.swing.*;

public class Login {
    private JPanel mainpanel;
    private JPanel titlePanel;
    private JLabel lblTitle;
    private JPanel bodyPanel;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel txtPassword;
    private JPasswordField passwordField1;
    private JButton LoginButton;

    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Login Screen");
        frame.setContentPane(new Login().mainpanel);
        frame.setVisible(true);
    }
}

