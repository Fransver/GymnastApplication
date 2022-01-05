package oldui;

import interfaces.IStuckExercise;

import javax.swing.*;
import java.util.Scanner;

public class StuckExerciseConsole implements IStuckExercise {

    Scanner scanner = new Scanner(System.in);

    private int frustrationScore;
    private int attemptsExercise;

public StuckExerciseConsole(){

}

    public int collectFeedbackAlterCourse(){
        int feedbackscore = attemptsExercise + frustrationScore;
        return feedbackscore;
    }

    @Override
    public boolean userIsStuck() {
        attemptsExercise();
        frustrationScore();
        int feedbackScore = collectFeedbackAlterCourse();
        if (feedbackScore >= 4){
            return true;
        } else if (feedbackScore <= 3){
            JOptionPane.showMessageDialog(null, "Please try a little longer");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect input");
        } return  false;
    }

    @Override
    public int attemptsExercise() {
        System.out.println("Give an estimate of the number of attempts: ");
        System.out.println("1)\t0-10 Attempts ");
        System.out.println("2)\t11-20 Attempts ");
        System.out.println("3)\tLost the count, far to many!");

        try {
            attemptsExercise = scanner.nextInt();
            System.out.println("You choose " + attemptsExercise);
        } catch (Exception e){
            System.out.printf("Wrong Input");
        }
        return attemptsExercise;
    }

    @Override
    public int frustrationScore() {
        System.out.println("How difficult did the exercise feel on a scale from 1 to 3?");
        System.out.println("1)\tCan't get it quit right. ");
        System.out.println("2)\tSomething feels wrong in my technique and performance. ");
        System.out.println("3)\tI'm frustrated, it is an impossible task. ");
        try {
            frustrationScore = scanner.nextInt();
            System.out.println("You Choose " + frustrationScore);
        } catch (Exception e) {
            System.out.println("Wrong input");
        } return frustrationScore;
    }
}
