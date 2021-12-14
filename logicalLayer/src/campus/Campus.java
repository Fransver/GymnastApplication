package campus;

import dataConvert.DataLayer;
import models.Course;
import models.Exercise;
import models.Gymnast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Campus {

    private Gymnast[] listGymnasts;
    private Exercise[] listExercisesFrontflip;
    private Exercise[] listExercisesHandspring;

    Scanner myScanner = new Scanner(System.in);
    DataLayer dataLayer = new DataLayer();



    public Campus() throws IOException {
        this.listGymnasts = dataLayer.getGymnasts();
        this.listExercisesFrontflip = dataLayer.getExercisesFrontflip();
        this.listExercisesHandspring = dataLayer.getExercisesHandspring();

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

    public Gymnast[] getListGymnasts() {
        return listGymnasts;
    }


    //////////////////// List Courses
    public static ArrayList<Course> Listcourses() {
        ArrayList<Course> courses = new ArrayList<>();
        Course frontFlip = new Course("TuckedFrontFlip", 9, 4, 200);
        Course layout = new Course("Full Layout", 10, 10, 400);
        Course handspring = new Course("Handspring", 12, 6, 300);
        courses.add(frontFlip);
        courses.add(layout);
        courses.add(handspring);
        return courses;
    }


}



