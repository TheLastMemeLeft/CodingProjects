package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class Calculator {
    private JPanel MainPanel;
    private JPanel Stuff;
    private JTextField INPUT;
    private JButton Plus;
    private JButton Mult;
    private JTextArea OUTPUT;
    private JButton Minus;
    private JButton Division;
    private JTextField INPUT2;

    public Calculator() {
        Plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Plus(e);
            }
        });
        Minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Minus(e);
            }
        });
        Mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mult(e);
            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Division(e);
            }
        });
    }
        private void Plus (ActionEvent e){
            String numberstr = new String(INPUT.getText());
            int number = parseInt(numberstr);
            String numberstr2 = new String(INPUT2.getText());
            int number2 = parseInt(numberstr);
            number = number + number2;
            JOptionPane.showMessageDialog(OUTPUT, number);
    }
        private void Minus (ActionEvent e){
            String numberstr = new String(INPUT.getText());
            int number = parseInt(numberstr);
            String numberstr2 = new String(INPUT2.getText());
            int number2 = parseInt(numberstr);
            number = number - number2;
            JOptionPane.showMessageDialog(OUTPUT, number);
        }
        private void Mult (ActionEvent e){
            String numberstr = new String(INPUT.getText());
            int number = parseInt(numberstr);
            String numberstr2 = new String(INPUT2.getText());
            int number2 = parseInt(numberstr);
            number = number * number2;
            JOptionPane.showMessageDialog(OUTPUT, number);
        }
        private void Division (ActionEvent e){
            String numberstr = new String(INPUT.getText());
            int number = parseInt(numberstr);
            String numberstr2 = new String(INPUT2.getText());
            int number2 = parseInt(numberstr);
            number = number / number2;
            JOptionPane.showMessageDialog(OUTPUT, number);
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My Login Screen");
            frame.setContentPane(new Calculator().MainPanel);
            frame.setVisible(true);
        }
    }

