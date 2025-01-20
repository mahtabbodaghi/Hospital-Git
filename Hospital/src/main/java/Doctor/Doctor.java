package Doctor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Doctor{
    JFrame frame;
    JPanel bottomPanel;
    String[] texts = {"Add Doctor", "Remove Doctor", "Search Doctors"};
    JButton[] jButtons = new JButton[3];
    public Doctor() {
        frame = new JFrame("Hospital management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 1));

        for (int i = 0; i < 3; i++) {
            jButtons[i] = new JButton(texts[i]);
            jButtons[i].setFont(new Font("Andale Mono", Font.BOLD, 40));
            jButtons[i].setBackground(new Color(109, 194, 244));
            jButtons[i].setBorder(BorderFactory.createLineBorder(Color.blue));
            jButtons[i].setPreferredSize(new Dimension(300, 200));
            bottomPanel.add(jButtons[i]);

            jButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle action for each button
                    if (e.getSource() == jButtons[0]) {
                        frame.dispose();
                        new DoctorAddPage();
                    } else if (e.getSource() == jButtons[1]) {
                        frame.dispose();
                        new DoctorRemovePage();
                    } else if (e.getSource() == jButtons[2]) {
                        frame.dispose();
                        new ShowDoctorPage();
                    }
                }
            });

            bottomPanel.add(jButtons[i]);
        }
        frame.add(bottomPanel);
        frame.setVisible(true);
    }
}
