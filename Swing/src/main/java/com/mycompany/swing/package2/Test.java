package com.mycompany.swing.package2;

import javax.swing.JFrame;

public class Test extends JFrame {

    Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 500, 500);
        setTitle("Package 2 title");
    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);

    }

}
