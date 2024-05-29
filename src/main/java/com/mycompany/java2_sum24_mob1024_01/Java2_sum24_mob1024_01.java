package com.mycompany.java2_sum24_mob1024_01;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Java2_sum24_mob1024_01 extends JFrame{

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        // text, image => JLabel
        JLabel label = new JLabel();
        label.setText("Hello from java swing");
        label.setBounds(0, 0, 100, 50);
        label.setForeground(Color.red);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);




        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setTitle("Swing demo");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(label);

        ImageIcon imageIcon = new ImageIcon("vit.gif");
        frame.setIconImage(imageIcon.getImage());
        frame.getContentPane().setBackground(Color.GRAY);

    }
}
