package org.example;

import javax.swing.*;

public class ShowStaffPage {
    JFrame frame;
    public ShowStaffPage(){
        frame = new JFrame("Hospital management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);



        frame.setVisible(true);
    }
}
