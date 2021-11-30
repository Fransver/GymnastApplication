package ui;

import models.Exercise;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Iterator;

public class FrontFlipExercisePage extends ExercisePage implements ActionListener {


//    private ArrayList<Exercise> choosencourse = Campus.ListexercisesFrontflip();
//    private ListIterator<Exercise> listIterator = choosencourse.listIterator();

    private Exercise[] JsonCourse;
    private Iterator exerciseListIterator;



    public FrontFlipExercisePage() throws IOException {
        super();



//        discription.setText(choosencourse.get(0).getDiscription());
//        titleLable.setText(choosencourse.get(0).getExerciseName());


        checkBox1.setText("I can stick the landing");
        checkBox2.setText("My performance is technical correct");
        checkBox3.setText("I can perform 5 good tries in a row");

    }

}












