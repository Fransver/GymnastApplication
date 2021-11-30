package campus;

import java.util.Scanner;

public class SuggestAlterCourse { // Main function for deciding if user benefits from another course.

    private int frustrationScore;
    private String feedbackCourse;
    private int attemptsExercise;

    Scanner scanner = new Scanner(System.in);

    public SuggestAlterCourse(int frustrationScore, String feedbackCourse, int attemptsExercise){

        this.frustrationScore = frustrationScore;
        this.feedbackCourse = feedbackCourse;
        this.attemptsExercise = attemptsExercise;
    }

    public int getAttemptsExercise() {
        System.out.println("Give an estimate of the number of attempts: ");
        scanner.nextInt();
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


    public String getFeedbackCourse() {
        System.out.println("Any tips for improvement ??");
        feedbackCourse = scanner.next();
        return feedbackCourse;
    }

    public void collectFeedbackAlterCourse(int frustrationScore, int attemptsExercise, String feedbackCourse){
        getFrustrationScore();
        getFeedbackCourse();
        getAttemptsExercise();
    }
}
