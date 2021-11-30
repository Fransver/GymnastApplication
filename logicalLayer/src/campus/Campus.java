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
//    private ArrayList<Course> listCourses;
//    private ArrayList<Exercise> listexercisesFrontflip;
    private Exercise[] listExercisesFrontflip;
    private Exercise[] listExercisesHandspring;

    Scanner myScanner = new Scanner(System.in);
    DataLayer dataLayer = new DataLayer();



    public Campus() throws IOException {
        this.listGymnasts = dataLayer.getGymnasts();
        this.listExercisesFrontflip = dataLayer.getExercisesFrontflip();
        this.listExercisesHandspring = dataLayer.getExercisesHandspring();

         // niet meer nodig
//        ArrayList<Exercise> listexercisesHandspring = ListexercisesHandspring();
//        ArrayList<Exercise> listexercisesFrontflip = ListexercisesFrontflip();
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


//    public static ArrayList<Gymnast> Listgymnasts() { // speciaal gehouden voor login info, daar werkt de List niet
//        ArrayList<Gymnast> gymnasts = new ArrayList<>();
//        Gymnast gym1 = new Gymnast(1,"Iris", "Female", 5, 500, "TVSomeren");
//        Gymnast gym2 = new Gymnast(2,"Evelien", "Female", 7, 1000, "Olympia");
//        Gymnast gym3 = new Gymnast(3,"Lianne", "Female", 3, 650, "Heerenveen");
//        Gymnast gym4 = new Gymnast(4,"Rob", "Male", 2, 500, "FlikFlak");
//        gymnasts.add(gym1);
//        gymnasts.add(gym2);
//        gymnasts.add(gym3);
//        gymnasts.add(gym4);
//        return gymnasts;
//    }


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

    //list Exercises
//    public static ArrayList<Exercise> ListexercisesHandspring() {
//        ArrayList<Exercise> exercises = new ArrayList<>();
//        Exercise exHandspring1 = new Exercise(1.1, "Handstand", 1,
//                "Perform a straight handstand in a still position for 2 seconds. ");
//        Exercise exHandspring2 = new Exercise(1.3, "Quick press Handstand", 2,
//                "nog doen");
//        Exercise exHandspring3 = new Exercise(1.4, "Block 2 Trampoline 2 Handstand laydown", 3,
//                "nog doen");
//        Exercise exHandspring4 = new Exercise(1.5, "Run 2 Trampoline 2 Handstand laydown", 3,
//                "nog doen");
//        Exercise exHandspring5 = new Exercise(1.6, "Run 2 Reuther 2 Handstand laydown", 4,
//                "nog doen");
//        Exercise exHandspring6 = new Exercise(1.7, "Handspring over softblocks", 5,
//                "nog doen");
//        Exercise exHandspring7 = new Exercise(1.8, "Handspring over low Pegasus", 6,
//                "nog doen");
//        Exercise exHandspringGoal = new Exercise(1.9, "Handspring Competition Height", 7,
//                "nog doen");
//        exercises.add(exHandspring1);
//        exercises.add(exHandspring2);
//        exercises.add(exHandspring3);
//        exercises.add(exHandspring4);
//        exercises.add(exHandspring5);
//        exercises.add(exHandspring6);
//        exercises.add(exHandspring7);
//        exercises.add(exHandspringGoal);
//        return exercises;
//    }

//    public static ArrayList<Exercise> ListexercisesFrontflip(){ // In JSON overgezet
//        ArrayList<Exercise> exercises = new ArrayList<>();
//        Exercise exFrontFlip1 = new Exercise(1.1, "LaydownTuck", 1,
//                "Lay down on your back and try to stand up using a tucked position. Watch the movie as an example.");
//        Exercise exFrontFlip2 = new Exercise(1.2, "Fast Tucked Roll", 2,
//                "Perform a fast tucked roll. Start with standing upright, tuck in and stand up without using your hands.");
//        Exercise exFrontFlip3 = new Exercise(1.3, "Jump&Roll", 2,
//                "nog doen");
//        Exercise exFrontFlip4 = new Exercise(1.4, "Jump&Roll2", 3,
//                "nog doen");
//        Exercise exFrontFlip5 = new Exercise(1.5, "Jump&Roll3", 3,
//                "nog doen");
//        Exercise exFrontFlip6 = new Exercise(1.6, "JumpTuckedSit", 4,
//                "nog doen");
//        Exercise exFrontFlip7 = new Exercise(1.7, "FrontFlip Spotted Elevation", 5,
//                "nog doen");
//        Exercise exFrontFlip8 = new Exercise(1.8, "FrontFlip Spotted on Mat", 6,
//                "nog doen");
//        Exercise exFrontFlipGoal = new Exercise(1.9, "Front Flip", 6,
//                "nog doen");
//        exercises.add(exFrontFlip1);
//        exercises.add(exFrontFlip2);
//        exercises.add(exFrontFlip3);
//        exercises.add(exFrontFlip4);
//        exercises.add(exFrontFlip5);
//        exercises.add(exFrontFlip6);
//        exercises.add(exFrontFlip7);
//        exercises.add(exFrontFlip8);
//        exercises.add(exFrontFlipGoal);
//        return exercises;
//    }

//    public ArrayList<Gymnast> getListGymnasts() {
//        return listGymnasts;
//    }

//    public ArrayList<Course> getListCourses() {
//        return listCourses;
//    }



}



