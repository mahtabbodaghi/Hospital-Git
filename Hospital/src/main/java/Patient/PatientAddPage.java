package Patient;

import Models.Patient;
import DataBase.DataBase;
import org.example.Index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PatientAddPage {
        JFrame frame;

        public PatientAddPage() {
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


            JTextField nameField = new JTextField();
            nameField.setFont(new Font("Andale Mono", Font.BOLD, 18));


            JLabel lastNameLabel = new JLabel("Last Name: ");
            lastNameLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
            lastNameLabel.setHorizontalAlignment(JLabel.CENTER);
            lastNameLabel.setVerticalAlignment(JLabel.CENTER);

            JTextField lastNameField = new JTextField();
            lastNameField.setFont(new Font("Andale Mono", Font.BOLD, 18));

            JLabel ageLabel = new JLabel("Age: ");
            ageLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
            ageLabel.setHorizontalAlignment(JLabel.CENTER);
            ageLabel.setVerticalAlignment(JLabel.CENTER);

            JTextField ageField = new JTextField();
            ageField.setFont(new Font("Andale Mono", Font.BOLD, 18));

            JLabel nationalIdLabel = new JLabel("National ID: ");
            nationalIdLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
            nationalIdLabel.setHorizontalAlignment(JLabel.CENTER);
            nationalIdLabel.setVerticalAlignment(JLabel.CENTER);

            JTextField nationalIdField = new JTextField();
            nationalIdField.setFont(new Font("Andale Mono", Font.BOLD, 18));

            JLabel illnessLabel = new JLabel("Illness: ");
            illnessLabel.setFont(new Font("Andale Mono", Font.BOLD, 24));
            illnessLabel.setHorizontalAlignment(JLabel.CENTER);
            illnessLabel.setVerticalAlignment(JLabel.CENTER);

            JTextField illnessField = new JTextField();
            illnessField.setFont(new Font("Andale Mono", Font.BOLD, 18));



            panel.add(nameLabel);
            panel.add(nameField);
            panel.add(lastNameLabel);
            panel.add(lastNameField);
            panel.add(ageLabel);
            panel.add(ageField);
            panel.add(nationalIdLabel);
            panel.add(nationalIdField);
            panel.add(illnessLabel);
            panel.add(illnessField);

            JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            bottomPanel.setBackground(new Color(40, 152, 255));


            JButton submitButton = new JButton("Submit");
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
                    String illness = illnessField.getText();

                    if(
                            name.isEmpty()
                            || lastName.isEmpty()
                            || age.isEmpty()
                            || nationalId.isEmpty()
                            || illness.isEmpty()
                    ){
                        JOptionPane.showInternalMessageDialog(null, "Please Fill All Fields");
                        return;
                    }

                    Patient patient = new Patient();
                    patient.setName(name);
                    patient.setLastName(lastName);
                    patient.setAge(Integer.parseInt(age));
                    patient.setNationalId(nationalId);
                    patient.setIllness(illness);

                    // Print the input values
                    DataBase dataBase = new DataBase();
                    dataBase.addPatient(patient);
                }
            });

            JButton back = new JButton("Back");
            back.setFont(new Font("Andale Mono", Font.BOLD, 24));
            back.setVerticalAlignment(JButton.CENTER);
            back.setAlignmentX(JButton.CENTER);
            back.setSize(400,200);
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    new Index();
                }
            });
            bottomPanel.add(back);

            bottomPanel.add(submitButton);

            frame.add(panel);
            frame.add(bottomPanel);
            frame.setVisible(true);
        }
}
