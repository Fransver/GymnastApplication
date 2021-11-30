package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CampusPage extends Gymnastpage implements ActionListener {

    JFrame frame = new JFrame();

    JLabel welcomeLabel = new JLabel();
    JLabel welcomeLabel2 = new JLabel("Please select a Course");
    JTextArea discription = new JTextArea("");
    JLabel id = new JLabel("id: " + gymnast.getId());


    JButton frontFlip = new JButton("Front Flip");
    JButton fullLayout = new JButton("Full Layout");
    JButton handspring = new JButton("Handspring");
    JButton newuser = new JButton("New User");


    public CampusPage()  throws IOException{


        discription.setBounds(20, 100, 350, 150);
        discription.setLineWrap(true);
        discription.setWrapStyleWord(true);
        discription.setText("Hello gymnast, welcome to the Gymnast-Application\n\nWith this awesome app we will help you " +
                "improve your technique in a fun, safe and correct way. You will learn all sorts of fun exercises that" +
                "will help you with your journey to the next level!  ");

        welcomeLabel.setBounds(20,0,320,35);
        welcomeLabel.setFont(new Font(null, Font.BOLD,20));
        welcomeLabel.setText("Hello: " + gymnast.getName());

        id.setBounds(300,0,100,35);
        id.setFont(new Font(null, Font.BOLD,20));


        welcomeLabel2.setBounds(20,0, 500, 100);
        welcomeLabel2.setFont(new Font(null, Font.ITALIC,15));

        frontFlip.setBounds(20,630,100,25);
        frontFlip.setFocusable(false);
        frontFlip.addActionListener(this);

        fullLayout.setBounds(140,630,100,25);
        fullLayout.setFocusable(false);
        fullLayout.addActionListener(this);

        handspring.setBounds(260,630,100,25);
        handspring.setFocusable(false);
        handspring.addActionListener(this);

        newuser.setBounds(600,630,100,25);

        frame.add(welcomeLabel);
        frame.add(welcomeLabel2);
        frame.add(frontFlip);
        frame.add(fullLayout);
        frame.add(handspring);
        frame.add(newuser);
        frame.add(discription);
        frame.add(id);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==frontFlip){
            try {
                new FrontFlipPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            frame.dispose();
        }

        if (e.getSource()==handspring){
            try {
                new HandspringPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            frame.dispose();
        }

        if (e.getSource()==fullLayout){
            JOptionPane.showMessageDialog((Component)null, "Not active yet ");
        }

        if (e.getSource() == newuser){
            new CreateNewUserPage();
            frame.dispose();
        }


    }
}
