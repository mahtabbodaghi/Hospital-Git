package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorAddPage {
    JFrame frame;
    JTextField nameField, lastNameField, ageField, nationalIdField, SpeciField;
    JButton submitButton;
    public DoctorAddPage(){
        frame = new JFrame("Hospital Management System");
        frame.setBounds(200, 100, 1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(2,1));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 8));
        panel.setBackground(new Color(40, 152, 255));

        JLabel nameLabel = new JLabel("Name: ");
        nameLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        nameLabel.setVerticalAlignment(JLabel.CENTER);


        nameField = new JTextField();
        nameField.setFont(new Font("Andale Mono", Font.BOLD, 18));


        JLabel lastNameLabel = new JLabel("Last Name: ");
        lastNameLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        lastNameLabel.setHorizontalAlignment(JLabel.CENTER);
        lastNameLabel.setVerticalAlignment(JLabel.CENTER);

        lastNameField = new JTextField();
        lastNameField.setFont(new Font("Andale Mono", Font.BOLD, 18));

        JLabel ageLabel = new JLabel("Age: ");
        ageLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        ageLabel.setHorizontalAlignment(JLabel.CENTER);
        ageLabel.setVerticalAlignment(JLabel.CENTER);

        ageField = new JTextField();
        ageField.setFont(new Font("Andale Mono", Font.BOLD, 18));

        JLabel nationalIdLabel = new JLabel("National ID: ");
        nationalIdLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        nationalIdLabel.setHorizontalAlignment(JLabel.CENTER);
        nationalIdLabel.setVerticalAlignment(JLabel.CENTER);

        nationalIdField = new JTextField();
        nationalIdField.setFont(new Font("Andale Mono", Font.BOLD, 18));

        JLabel SpeciLabel = new JLabel("Specialization: ");
        SpeciLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
        SpeciLabel.setHorizontalAlignment(JLabel.CENTER);
        SpeciLabel.setVerticalAlignment(JLabel.CENTER);

        SpeciField = new JTextField();
        SpeciField.setFont(new Font("Andale Mono", Font.BOLD, 18));



        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(nationalIdLabel);
        panel.add(nationalIdField);
        panel.add(SpeciLabel);
        panel.add(SpeciField);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.setBackground(new Color(40, 152, 255));


        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Andale Mono", Font.BOLD, 24));
        submitButton.setVerticalAlignment(JButton.CENTER);
        submitButton.setAlignmentX(JButton.CENTER);
        submitButton.setSize(400,200);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String lastName = lastNameField.getText();
                String age = ageField.getText();
                String nationalId = nationalIdField.getText();
                String spec = SpeciField.getText();

                // Print the input values
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastName);
                System.out.println("Age: " + age);
                System.out.println("National ID: " + nationalId);
                System.out.println("Specialization: " + spec);
            }
        });

        bottomPanel.add(submitButton);

        frame.add(panel);
        frame.add(bottomPanel);
        frame.setVisible(true);
    }
}
