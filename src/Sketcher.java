import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.black;

public class Sketcher {
    private JPanel mainPanel;
    private JPanel paintPanel;
    private JPanel buttonPanel;
    private JButton redButton;
    private JButton blueButton;
    private JButton greenButton;
    private JButton blackButton;
    private JButton RESETButton;
    private JButton plusButton;
    private JButton minusButton;
    private int brushSize = 1;
    Color colour=black;

    private Point lastpoint;
    public Sketcher() {

        paintPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                lastpoint= new Point(e.getX(),e.getY());
            }
        });


        paintPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                handleDrawing(e);


            }
        });
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour=Color.red;

            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour=Color.blue;
            }
        });
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour=Color.green;
            }
        });
        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                colour=Color.black;
            }
        });
        RESETButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brushSize++;

            }
        });
    }

    private void reset() {
        paintPanel.repaint();
    }

    private void handleDrawing(MouseEvent e){
        Graphics2D g =(Graphics2D)paintPanel.getGraphics();
        g.setColor(colour);
        g.setStroke(new BasicStroke(brushSize));
        g.drawLine((int)lastpoint.x, lastpoint.y, e.getX(), e.getY());
        lastpoint=new Point(e.getX(), e.getY());
        g.dispose();

    }


    public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MS PAINT");
        frame.setContentPane(new Sketcher().mainPanel);
        frame.setVisible(true);
    }
}