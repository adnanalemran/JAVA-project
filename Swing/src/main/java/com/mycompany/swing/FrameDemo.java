package com.mycompany.swing;

import javax.swing.JFrame;

public class FrameDemo {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }
}
