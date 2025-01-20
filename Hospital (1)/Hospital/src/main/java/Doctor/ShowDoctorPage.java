package Doctor;

import javax.swing.*;

public class ShowDoctorPage {
    JFrame frame;
    public ShowDoctorPage(){
        frame = new JFrame("Hospital management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setVisible(true);
    }
}
