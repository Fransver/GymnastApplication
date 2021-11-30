package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class CreateNewUserPage { // nog afmaken + unit test op loslaten

    Scanner scanner = new Scanner(System.in);
    JFrame frame = new JFrame();

    JLabel name = new JLabel("Name: ");
    JLabel gender = new JLabel("Gender: ");
    JLabel skilllevel = new JLabel("Level");
    JLabel club = new JLabel("Club: ");
    JLabel points = new JLabel("Points: ");

    JTextArea username = new JTextArea();
    JTextArea userGender = new JTextArea();
    JTextArea userSkilllevel = new JTextArea();
    JTextArea userClub = new JTextArea();
    JTextArea userPoints = new JTextArea();

    JButton register = new JButton("Register");


    public CreateNewUserPage(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

        username.setBounds(120,50,200,30);
        userGender.setBounds(120,150,200,30);
        userSkilllevel.setBounds(120,250,200,30);
        userClub.setBounds(120,350,200,30);
        userPoints.setBounds(120,450,200,30);

        name.setBounds(20,50,200,30);
        gender.setBounds(20,150,200,30);
        skilllevel.setBounds(20,250,200,30);
        club.setBounds(20,350,200,30);
        points.setBounds(20,450,200,30);

        register.setBounds(20,550,200,50);
        register.addActionListener(new ActionListener() { // Output string to data user
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        frame.add(username);
        frame.add(userGender);
        frame.add(userSkilllevel);
        frame.add(userClub);
        frame.add(username);
        frame.add(userGender);
        frame.add(userSkilllevel);
        frame.add(userClub);
        frame.add(userPoints);
        frame.add(name);
        frame.add(gender);
        frame.add(skilllevel);
        frame.add(club);
        frame.add(points);
        frame.add(register);
    }

}
