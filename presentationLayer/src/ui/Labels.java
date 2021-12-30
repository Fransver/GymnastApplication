package ui;

import javax.swing.*;
import java.awt.*;

public class Labels {

    private JLabel welcomeLabel = new JLabel();
    private JLabel welcomeLabel2 = new JLabel();
    private JLabel id = new JLabel();
    private JLabel nameGymnast = new JLabel();
    private JLabel pointsGymnast = new JLabel();
    private JLabel titleLable = new JLabel();


    public Labels() {
        titleLable.setText("Title Exercise");
        titleLable.setBounds(20, 70, 200, 20);
        titleLable.setFont(new Font(null, Font.BOLD, 15));
        titleLable.setVerticalAlignment(JLabel.TOP);
        titleLable.setVisible(false);

        welcomeLabel.setBounds(20, 30, 320, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 25));
        welcomeLabel.setText("Gymnast-Application");

        id.setBounds(300, 0, 100, 35);
        id.setFont(new Font(null, Font.BOLD, 20));

        welcomeLabel2.setBounds(20, 550, 500, 100);
        welcomeLabel2.setFont(new Font(null, Font.ITALIC, 20));
        welcomeLabel2.setText("Please select a Course");

        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));





    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JLabel getWelcomeLabel2() {
        return welcomeLabel2;
    }

    public JLabel getId() {
        return id;
    }

    public JLabel getNameGymnast() {
        return nameGymnast;
    }

    public JLabel getPointsGymnast() {
        return pointsGymnast;
    }

    public JLabel getTitleLable() {
        return titleLable;
    }
}
