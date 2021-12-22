package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    private JButton completeButton = new JButton("Complete");
    private JButton previousButton = new JButton("Previous");
    private JButton stuckButton = new JButton("Stuck");
    private JButton courseButton = new JButton("Course");

    private JButton frontFlip = new JButton("Front Flip");
    private JButton fullLayout = new JButton("Full Layout");
    private JButton handspring = new JButton("Handspring");
    private JButton select = new JButton("Select");

    public Buttons(){


        completeButton.setFocusable(false);
        completeButton.setBounds(600, 630, 100, 20);
        completeButton.setVisible(false);

        stuckButton.setFocusable(false);
        stuckButton.setBounds(480,630,100,20);
        stuckButton.setVisible(false);

        previousButton.setFocusable(false);
        previousButton.setBounds(360,630,100,20);
        previousButton.setVisible(false);

        courseButton.setFocusable(false);
        courseButton.setVisible(false);
        courseButton.setBounds(20, 630, 100, 20);

        frontFlip.setBounds(20, 630, 100, 25);
        frontFlip.setFocusable(false);

        fullLayout.setBounds(140, 630, 100, 25);
        fullLayout.setFocusable(false);

        handspring.setBounds(260, 630, 100, 25);
        handspring.setFocusable(false);

        select.setFocusable(false);
        select.setBounds(550,325,100,20);
        select.setVisible(false);

    }

    public JButton getCompleteButton() {
        return completeButton;
    }

    public JButton getPreviousButton() {
        return previousButton;
    }

    public JButton getStuckButton() {
        return stuckButton;
    }

    public JButton getCourseButton() {
        return courseButton;
    }

    public JButton getFrontFlip() {
        return frontFlip;
    }

    public JButton getFullLayout() {
        return fullLayout;
    }

    public JButton getHandspring() {
        return handspring;
    }

    public JButton getSelect() {
        return select;
    }

    public void visibleExerciseButtonsFalse() {
        completeButton.setVisible(false);
        stuckButton.setVisible(false);
        previousButton.setVisible(false);
        courseButton.setVisible(false);
    }
    public void visibleCoursebuttonseFalse() {
        frontFlip.setVisible(false);
        handspring.setVisible(false);
        fullLayout.setVisible(false);
    }


}
