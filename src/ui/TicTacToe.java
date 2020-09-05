package ui;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class TicTacToe {
    private JPanel MainPanel;
    private JPanel TopPanel;
    private JPanel BottomPanel;
    private JLabel PlayerValues;
    private JButton ButtonT1;
    private JButton ButtonM1;
    private JButton ButtonB1;
    private JButton ButtonT2;
    private JButton ButtonM2;
    private JButton ButtonB2;
    private JButton ButtonT3;
    private JButton ButtonM3;
    private JButton ButtonB3;
    private JTextField player1scoretextfield;
    private JLabel player1score;
    private JLabel turn;
    private JTextField turntextfield;
    private JLabel player2score;
    private JTextField player2textfield;
    private JButton playAgainButton;

    private JButton[] btns = new JButton[] {ButtonT1,
            ButtonM1,
            ButtonB1,
            ButtonT2,
            ButtonM2,
            ButtonB2,
            ButtonT3,
            ButtonM3,
            ButtonB3};

    ImageIcon x = getImageIcon("images/x.jpg");
    ImageIcon o = getImageIcon("images/o.png");
    private boolean isPlayer1 = true;
    int p1=0;
    int p2=0;
    int counting=0;

    public TicTacToe() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPressed(e);
            }
        };
        ButtonT1.addActionListener(listener);
        ButtonM1.addActionListener(listener);
        ButtonB1.addActionListener(listener);
        ButtonT2.addActionListener(listener);
        ButtonM2.addActionListener(listener);
        ButtonB2.addActionListener(listener);
        ButtonT3.addActionListener(listener);
        ButtonM3.addActionListener(listener);
        ButtonB3.addActionListener(listener);
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
    }

    private void disableButtons() {
        flip(false);
    }
    private void enableButtons(){
        flip(true);
    }

    private void flip(boolean status) {
        for (JButton b : btns) {
            b.setEnabled(status);
        }
    }

    private void removeIcons() {
        for (JButton b : btns) {
            b.setIcon(null);
            b.setDisabledIcon(null);
        }
    }
    private void btnPressed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        btn.setEnabled(false);
        counting++;

        if (isPlayer1){
            btn.setIcon(x);
            btn.setDisabledIcon(x);
            turntextfield.setText("Player-2");
        }
        else{
            btn.setIcon(o);
            btn.setDisabledIcon(o);
            turntextfield.setText("Player-1");

        }
        if (win(ButtonT1, ButtonT2, ButtonT3)||
                win(ButtonM1, ButtonM2, ButtonM3)||
                win(ButtonB1, ButtonB2, ButtonB3)||
                win(ButtonT1, ButtonM1, ButtonB1)||
                win(ButtonT2, ButtonM2, ButtonB2)||
                win(ButtonT3, ButtonM3, ButtonB3)||
                win(ButtonT1, ButtonM2, ButtonB3)||
                win(ButtonT3, ButtonB1, ButtonM2)) {

            disableButtons();

                if (isPlayer1) {
                    p1++;
                    player1scoretextfield.setText(p1 + "");
                    JOptionPane.showMessageDialog(MainPanel, "PLayer1 won!");

                } else {
                    p2++;
                    player2textfield.setText(p2 + "");
                    JOptionPane.showMessageDialog(MainPanel, "PLayer2 won!");
                }
            playAgainButton.setVisible(true);

        } else if (counting ==9) {
            JOptionPane.showMessageDialog(MainPanel, "It is a TIE!");
            playAgainButton.setVisible(true);
        }

        isPlayer1=!isPlayer1;

    }

    private void reset() {
        enableButtons();
        removeIcons();
        counting=0;
        playAgainButton.setVisible(false);


    }

    private boolean win(JButton b1, JButton b2, JButton b3) {
        return (b1.getIcon() == b2.getIcon()  && b2.getIcon() == b3.getIcon() && b1.getIcon() != null);
    }

    private ImageIcon getImageIcon(String s) {
        URL url = this.getClass().getResource(s);
        if (url != null) {
            return new ImageIcon(url);
        }
        return null;
    }




    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My Tic Tac Toe Screen");
        frame.setContentPane(new TicTacToe().MainPanel);
        frame.setVisible(true);
    }
}
