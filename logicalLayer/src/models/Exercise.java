package models;

public class Exercise {

    private double exerciseId;
    private String exerciseName;
    private int exerciseSkillLevel;
    private  String discription;

    public Exercise(double exerciseId, String exerciseName, int exerciseSkillLevel, String discription){
        this.exerciseId = exerciseId;
        this.exerciseName = exerciseName;
        this.exerciseSkillLevel = exerciseSkillLevel;
        this.discription = discription;
    }

    public double getExerciseId() {
        return exerciseId;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public int getExerciseSkillLevel() {
        return exerciseSkillLevel;
    }

    public String getDiscription() {
        return discription;
    }



}
