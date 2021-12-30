package ui;

import interfaces.IStuckExercise;

import javax.swing.*;

public class SwingStuckExercise implements IStuckExercise {

    JTextField attemptsField = new JTextField();
    JTextField frustrationField = new JTextField();
    JButton submitatt = new JButton();
    JButton submitfrus = new JButton();
    JButton alterCourse = new JButton();
    JLabel attempts = new JLabel();
    JLabel frustration = new JLabel();


    private int frustrationScore;
    private int attemptsExercise;

    public SwingStuckExercise(){

        attemptsField.setVisible(false);
        attemptsField.setFocusable(true);
        attemptsField.setBounds(400, 100, 175,25);
        attemptsField.setText(attemptsField.getText());
        submitatt.setVisible(false);
        submitatt.setFocusable(true);
        submitatt.setBounds(600, 100,80,25);
        submitatt.setText("Submit");
        attempts.setText("Number attempts: " );
        attempts.setBounds(400, 70, 175, 25);
        attempts.setVisible(false);
        attempts.setFocusable(true);


        frustrationField.setVisible(false);
        frustrationField.setFocusable(true);
        frustrationField.setBounds(400, 175, 175, 25);
        frustrationField.setText(frustrationField.getText());
        submitfrus.setVisible(false);
        submitfrus.setFocusable(true);
        submitfrus.setBounds(600,175, 80, 25);
        submitfrus.setText("Submit");
        frustration.setText("Frustration Score 1-3");
        frustration.setVisible(false);
        frustration.setFocusable(true);
        frustration.setBounds(400,144,175,25);




        alterCourse.setVisible(false);
        alterCourse.setFocusable(true);
        alterCourse.setBounds(400,230,120,25);
        alterCourse.setText("Alter Course ");

    }



    public JButton getAlterCourse() {
        return alterCourse;
    }

    public JLabel getAttempts() {
        return attempts;
    }

    public JLabel getFrustration() {
        return frustration;
    }

    public JTextField getAttemptsField() {
        return attemptsField;
    }

    public JTextField getFrustrationField() {
        return frustrationField;
    }

    public JButton getSubmitatt() {
        return submitatt;
    }

    public JButton getSubmitfrus() {
        return submitfrus;
    }



    @Override
    public int attemptsExercise() { // Omzetten aantal herhalingen naar een score voor alternatieve cursus.
        try {

            int attempts = Integer.parseInt(attemptsField.getText());
            if (attempts >= 10){
                attemptsExercise = 2;
            } else if (attempts >=20){
                attemptsExercise =3;
            } else if (attempts <10){
                attemptsExercise =1;
            } else {
                JOptionPane.showMessageDialog(null,"Wrong Input");

            }
            return attemptsExercise;

        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Input");
        } return 0;
    }

    @Override
    public int frustrationScore() {
        try {
            frustrationScore = Integer.parseInt(frustrationField.getText());
            if (frustrationScore <=3){
                return frustrationScore;
            } else if (frustrationScore >4) {
                JOptionPane.showMessageDialog(null, "Please rank from 1-3");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Input");

        }
        return 0;
    }

    @Override
    public boolean userIsStuck() {

        int feedbackScore = frustrationScore + attemptsExercise;
        if (feedbackScore >= 4) {
            return true;
        } else if (feedbackScore <= 3){
        JOptionPane.showMessageDialog(null, "Please try a little longer");
    }
        return false;
    }

    public void stuckExerciseFieldsVisibleTrue(){
        attempts.setVisible(true);
        frustration.setVisible(true);
        attemptsField.setVisible(true);
        frustrationField.setVisible(true);
        submitfrus.setVisible(true);
        submitatt.setVisible(true);
        alterCourse.setVisible(true);

    }

    public void stuckExerciseFieldsVisibleFalse(){
        attempts.setVisible(false);
        frustration.setVisible(false);
        attemptsField.setVisible(false);
        frustrationField.setVisible(false);
        submitfrus.setVisible(false);
        submitatt.setVisible(false);
        alterCourse.setVisible(false);

    }
}
