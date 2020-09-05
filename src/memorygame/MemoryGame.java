package memorygame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class MemoryGame {

    private JPanel MainPanel;
    private JPanel TitlePanel;
    private JPanel ScorePanel;
    private JPanel ButtonPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JTextField textField1;
    private JLabel P2ScoreTExt;
    private JLabel P1ScoreText;
    private JTextField textField2;
    private JButton playAgainButton;

    ImageIcon b1= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/Arthur.jpg");
    ImageIcon b2= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/SplishSplash80x80.png");
    ImageIcon b3= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/Minecreft.jpg");
    ImageIcon b4= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/StonksMan80x80.png");
    ImageIcon b5= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/x.jpg");
    ImageIcon b6= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/o.png");
    ImageIcon b7= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/Toilet.jpg");
    ImageIcon b8= getImageIcon("file:///C:/Users/aryan/coding/CodingProjects/src/memorygame/images/Corona.png");
    ImageIcon[]images={b1,b1,b2,b2,b3,b3,b4,b4,b5,b5,b6,b6,b7,b7,b8,b8};


    private ImageIcon getImageIcon (String s) {
        URL url = null; //this.getClass().getResource(s);
        try {
            url = new URL(s);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (url != null) {
            return new ImageIcon(url);
        }
        return null;
    }


    public MemoryGame() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPressed(e);

            }




        };
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button10.addActionListener(listener);
        button11.addActionListener(listener);
        button12.addActionListener(listener);
        button13.addActionListener(listener);
        button14.addActionListener(listener);
        button15.addActionListener(listener);
        button16.addActionListener(listener);
    }

    private void buttonPressed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        int command= Integer.parseInt(btn.getActionCommand());
        btn.setIcon(images[command]);
    }

    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Memory Game");
        frame.setContentPane(new MemoryGame().MainPanel);
        frame.setVisible(true);
    }
}




