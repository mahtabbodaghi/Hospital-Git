package Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientRemovePage {
    JFrame frame;
    public PatientRemovePage() {
        frame = new JFrame("Hospital Management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(2, 1));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        panel.setBackground(new Color(40, 152, 255));
        JLabel nationalIdLabel = new JLabel("National ID: ");
        nationalIdLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        nationalIdLabel.setHorizontalAlignment(JLabel.CENTER);
        nationalIdLabel.setVerticalAlignment(JLabel.CENTER);
        JTextField nationalIdField = new JTextField();
        nationalIdField.setFont(new Font("Andale Mono", Font.BOLD, 18));

        panel.add(nationalIdLabel);
        panel.add(nationalIdField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(new Color(40, 152, 255));


        JButton submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Andale Mono", Font.BOLD, 24));
        submitButton.setVerticalAlignment(JButton.CENTER);
        submitButton.setAlignmentX(JButton.CENTER);
        submitButton.setSize(400, 200);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nationalId = nationalIdField.getText();

                // Print the input values
                System.out.println("National ID: " + nationalId);

                //database remove a patient
            }
        });

        bottomPanel.add(submitButton);

        frame.add(panel);
        frame.add(bottomPanel);
        frame.setVisible(true);
    }
}
