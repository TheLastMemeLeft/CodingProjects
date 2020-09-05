package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel mainpanel;
    private JPanel titlePanel;
    private JLabel lblTitle;
    private JPanel bodyPanel;
    private JLabel lblUsername;
    private JTextField txtUsername;
    private JLabel lblPassword;
    private JPasswordField txtPassword;
    private JButton LoginButton;

    public Login() {
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent  e) {
                loginPressed(e);
            }
        });
    }

    private void loginPressed(ActionEvent e) {
        String pass= new String (txtPassword.getPassword());
        String user= new String (txtUsername.getText());
        JOptionPane.showMessageDialog(mainpanel,"User= "+user+"\n Password ="+pass);
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Login Screen");
        frame.setContentPane(new Login().mainpanel);
        frame.setVisible(true);
    }
}

