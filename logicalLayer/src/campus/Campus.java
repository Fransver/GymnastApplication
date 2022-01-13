package campus;


import interfaces.ICompleteExercise;
import interfaces.IDataLayer;
import interfaces.IScoreDistributer;
import models.Exercise;
import models.Gymnast;

import java.io.IOException;
import java.util.Scanner;


public class Campus implements ICompleteExercise, IScoreDistributer {

    private Gymnast[] listGymnasts;
    private Exercise[] listExercisesFrontflip;
    private Exercise[] listExercisesHandspring;
    private Exercise[] listAlterExercisesFrontflip;
    private int score;


    IDataLayer dataLayer;

    public Campus(IDataLayer dataLayer) throws IOException {
        this.dataLayer = dataLayer;
        this.listGymnasts = dataLayer.getGymnasts();
        this.listExercisesFrontflip = dataLayer.getExercisesFrontflip();
        this.listExercisesHandspring = dataLayer.getExercisesHandspring();
        this.listAlterExercisesFrontflip = dataLayer.getAlterExercisesFrontflip();


    }

    public Exercise[] getListAlterExercisesFrontflip() {
        return listAlterExercisesFrontflip;
    }

    public Exercise[] getListExercisesFrontflip() {
        return listExercisesFrontflip;
    }

    public Exercise[] getListExercisesHandspring() {
        return listExercisesHandspring;
    }

    public Gymnast[] getGymnasts(){
        return  listGymnasts;
    }


    @Override
    public boolean completeExercise() {
        return false;
    }

    @Override
    public int distributescoreCourse() {
        score += 50;
        return score;
    }

    @Override
    public int distributescoreExercise() {
        score += 10;
        return score;
    }

    @Override
    public int subtractscoreExercise() {
        score -= 10;
        return score;
    }
}



