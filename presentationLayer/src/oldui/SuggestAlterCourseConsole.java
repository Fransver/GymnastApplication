package oldui;

import java.util.Scanner;

public class SuggestAlterCourseConsole { // Main function for deciding if user benefits from another course.

    private int frustrationScore;
    private int attemptsExercise;

    Scanner scanner = new Scanner(System.in);

    public SuggestAlterCourseConsole(int frustrationScore, int attemptsExercise){

        this.frustrationScore = frustrationScore;
        this.attemptsExercise = attemptsExercise;
    }

    public int getAttemptsExercise() {
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

    public int getFrustrationScore() {
        System.out.println("How difficult did the exercise feel on a scale from 1 to 3?");
        System.out.println("1)\tCan't get it quit right. ");
        System.out.println("2)\tSomething feels wrong in my technique and performance. ");
        System.out.println("3)\tI'm frustrated, it is an impossible task. ");
        try {
            frustrationScore = scanner.nextInt();
            System.out.println("You Choose " + frustrationScore);
        } catch (Exception e) {
            System.out.println("Wrong input");
        }            return frustrationScore;

    }




    public int collectFeedbackAlterCourse(){
        int feedbackscore = attemptsExercise + frustrationScore;
        return feedbackscore;
    }
}
