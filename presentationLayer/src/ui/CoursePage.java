package ui;

// Parent of all the course pages.



import campus.Campus;
import models.Gymnast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;


public class CoursePage extends Gymnastpage implements ActionListener {

    Scanner myScanner = new Scanner(System.in);

    JFrame courseFrame = new JFrame();
    JLabel titleLable = new JLabel();
    JButton campusButton = new JButton("Campus");
    JButton startCourse = new JButton("Start");
    JTextArea discription = new JTextArea("");

    Campus campus = new Campus();

    JLabel media = new JLabel(); // label that holds the media.

    Gymnast gymnast = campus.getGymnasts()[0];


    public CoursePage() throws IOException {
        super();

        titleLable.setText("Title / Welcome message");
        titleLable.setBounds(20, 30, 200, 50);
        titleLable.setFont(new Font(null, Font.BOLD, 15));
        titleLable.setVerticalAlignment(JLabel.TOP);

        media.setBounds(20,300,700,150);


        discription.setBounds(20, 100, 350, 150);
        discription.setLineWrap(true);
        discription.setWrapStyleWord(true);
        discription.setText("");

        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));
        nameGymnast.setText("User:" + gymnast.getName());

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));
        pointsGymnast.setText("Points: " + gymnast.getPoints());

        campusButton.setFocusable(false);
        campusButton.addActionListener(this);
        campusButton.setBounds(20, 630, 100, 20);

        startCourse.setFocusable(false);
        startCourse.addActionListener(this);
        startCourse.setBounds(600, 630, 100, 20);

        courseFrame.setSize(750, 750);
        courseFrame.setLayout(null);
        courseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        courseFrame.setVisible(true);

        courseFrame.add(titleLable);
        courseFrame.add(campusButton);
        courseFrame.add(startCourse);
        courseFrame.add(nameGymnast);
        courseFrame.add(pointsGymnast);
        courseFrame.add(discription);
        courseFrame.add(media);


    }


    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == campusButton) {
            try {
                new CampusPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            courseFrame.dispose();
        }

    }


}






