package Nurse;

import javax.swing.*;

public class ShowNursePage {
    JFrame frame;
    public ShowNursePage(){
        frame = new JFrame("Hospital management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);



        frame.setVisible(true);
    }
}
