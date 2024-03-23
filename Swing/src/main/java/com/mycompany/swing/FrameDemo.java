package com.mycompany.swing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;

public class FrameDemo extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel userLabel;

    FrameDemo() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);

        c.setBackground(Color.cyan);

        userLabel = new JLabel();
        userLabel.setText("Adnan al emran ");
        userLabel.setBounds(20, 20, 150, 30);
        c.add(userLabel);

    }


    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setLocation(200,50);
        // frame.setBounds(200, 50, 400, 300);
        frame.setTitle("This a title");
        frame.setResizable(false);
    }
}
