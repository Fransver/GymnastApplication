package campus;


import interfaces.IDataLayer;
import models.Exercise;
import models.Gymnast;

import java.io.IOException;
import java.util.Scanner;


public class Campus {

    private Gymnast[] listGymnasts;
    private Exercise[] listExercisesFrontflip;
    private Exercise[] listExercisesHandspring;
    private Exercise[] listAlterExercisesFrontflip;


    Scanner myScanner = new Scanner(System.in);
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




}



