package models;

/**
 * To do
 * 1. Methode meegeven die kan vertellen welke cursus een gebruiker gebruikt.
 * 2. Methode toevoegen van alternatieve cursus optie.
 */

public class Course {
    private String nameCourse;
    private int numberExercises;
    private int skillLevel;
    private int pointsCompletion;

    public Course(String nameCourse, int numberExercises, int skillLevel, int pointsCompletion) {
        this.nameCourse = nameCourse;
        this.numberExercises = numberExercises;
        this.skillLevel = skillLevel;
        this.pointsCompletion = pointsCompletion;
    }

    public String getnameCourse() {
        return nameCourse ;
    }

    public int getNumberExercises() {
        return numberExercises;
    }

    public int getskillLevel() {
        return skillLevel;
    }

    public int getPointsCompletion() {
        return pointsCompletion;
    }

}
