package ui;

import models.Exercise;

import java.awt.event.ActionListener;
import java.io.IOException;

public class HandspringExercisePage extends ExercisePage implements ActionListener {



    private Exercise[] JsonCourse;




    public HandspringExercisePage() throws IOException {
        super();






        checkBox1.setText("My handstand is a straight line");
        checkBox2.setText("I push from the shoulders, not the elbows");
        checkBox3.setText("I can systain my body tension trough the exercise");


    }

}


