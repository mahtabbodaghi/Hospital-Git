package Patient;

import DataBase.DataBase;
import org.example.Index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShowPatientPage {
    JFrame frame;
    public ShowPatientPage(){
        frame = new JFrame("Hospital management System");
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

                if(nationalId.isEmpty()){
                    JOptionPane.showInternalMessageDialog(null, "Please Fill All Fields");
                    return;
                }

                // start of here
                DataBase dataBase = new DataBase();

                ArrayList<String[]> arrayList = dataBase.searchPatient(nationalId);
                for (int i = 0; i < arrayList.size(); i++) {
                    for (int j = 0; j < arrayList.get(i).length; j++) {
                        System.out.print(arrayList.get(i)[j] + " ");
                    }
                    System.out.println();
                }
                // end of there
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
        //database show patient table
        frame.setVisible(true);
    }
}
