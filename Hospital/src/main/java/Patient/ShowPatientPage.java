package Patient;

import javax.swing.*;

public class ShowPatientPage {
    JFrame frame;
    public ShowPatientPage(){
        frame = new JFrame("Hospital management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);


        //database show patient table
        frame.setVisible(true);
    }
}
