package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtstname;
    private JTextField txtrno;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks3;
    private JTextField txtavg;
    private JTextField txtgrade;
    private JButton calButton;
    private JTextField txttotal;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1, m2, m3, tot;
                double avg;

                m1=Integer.parseInt(txtmarks1.getText());
                m2=Integer.parseInt(txtmarks2.getText());
                m3=Integer.parseInt(txtmarks3.getText());

                tot = m1+ m2 + m3;
                txttotal.setText(String.valueOf(tot));

                avg = tot/3;
                txtavg.setText(String.valueOf(avg));

                if(avg>=90){
                    txtgrade.setText("A+");
                }else if (avg>=80){
                    txtgrade.setText("A");
                }else if (avg>=70){
                    txtgrade.setText("B");
                }else if (avg>=60){
                    txtgrade.setText("C");
                }else if (avg>=50){
                    txtgrade.setText("D");
                }else {
                    txtgrade.setText("F");
                }



            }
        });
    }
}
