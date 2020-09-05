package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter {
    private JPanel MainPanel;
    private JPanel Stuff;
    private JTextField INPUT;
    private JButton FtoC;
    private JButton CtoF;
    private JTextArea ScamArea;
    private JTextArea OUTPUT;

    public TemperatureConverter() {
        FtoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FtoCPressed(e);
            }
        });
        CtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CtoFPressed(e);
            }
        });
    }
    private void FtoCPressed(ActionEvent e) {
        String numberstr = new String(INPUT.getText());
        double number = Double.parseDouble(numberstr);
        number = (number-32) * 5/9;
        JOptionPane.showMessageDialog(OUTPUT, number);
    }


    private void CtoFPressed(ActionEvent e) {
        String numberstr = new String(INPUT.getText());
        double number = Double.parseDouble(numberstr);
        number = (number*9/5)+32;
        JOptionPane.showMessageDialog(OUTPUT, number);
    }


    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Login Screen");
        frame.setContentPane(new TemperatureConverter().MainPanel);
        frame.setVisible(true);
    }

}
