package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index {
    JFrame frame;
    JPanel bottomPanel , welcomePanel;
    JLabel label;
    String[] texts = {"Patient" , "Doctor" , "Nurse" , "Staff"};
    JButton[] button = new JButton[4];

    public Index() {
        frame = new JFrame("Hospital Management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // Create panels for bottom
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,2));



        // Add buttons to top panel
        for (int i = 0; i < 4; i++) {
            button[i] = new JButton(texts[i]);
            button[i].setFont(new Font("Andale Mono" , Font.BOLD , 30));
            button[i].setBackground(new Color(109, 194, 244));
            button[i].setBorder(BorderFactory.createLineBorder(Color.blue));
            button[i].setPreferredSize(new Dimension(300, 200));
            bottomPanel.add(button[i]);

            button[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle action for each button
                    if (e.getSource() == button[0]) {
                        frame.dispose();
                        new Patient();
                    } else if (e.getSource() == button[1]) {
                        frame.dispose();
                        new Doctor();
                    } else if (e.getSource() == button[2]) {
                        frame.dispose();
                        new Nurse();
                    } else if (e.getSource() == button[3]) {
                        frame.dispose();
                        new Staff();
                    }
                }
            });

            bottomPanel.add(button[i]);
        }
        welcomePanel = new JPanel();
        welcomePanel.setLayout(new GridLayout());
        welcomePanel.setBackground(new Color(53, 155, 242));
        label = new JLabel();
        label.setText("Welcome To Mehregan Hospital!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("Andale Mono" , Font.BOLD , 54));
        welcomePanel.add(label , BorderLayout.SOUTH);



        //add to frame
        frame.add(welcomePanel);
        frame.add(bottomPanel, BorderLayout.SOUTH);


        frame.setVisible(true);
    }



}
