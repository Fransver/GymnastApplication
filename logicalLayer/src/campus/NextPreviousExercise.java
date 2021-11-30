package campus;


import dataConvert.DataLayer;
import models.Exercise;
import models.Gymnast;

import java.io.IOException;
import java.util.Arrays;
import java.util.ListIterator;

public class NextPreviousExercise  { // Vanuit deze klas de previous en next button in gaan richten !

    /**
     * Hoe laat ik deze class samenwerken met de UI in ExercisePage.
     * Met name de iterator lijkt niet te weten vanuit waar hij de oefening moet aanroepen in de UI.
     */

   DataLayer dataLayer = new DataLayer();

    private Exercise[] JsonCourse = dataLayer.getEmptyExerciseList(); // lege lijst oefeningen. ---> Hoe override ik die?
    private ListIterator<Exercise> exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
    private int scoreUser = dataLayer.getGymnasts()[0].getPoints(); // Ik hoef alleen hier de startpunten aan te passen.
    private Gymnast user = dataLayer.getGymnasts()[0]; // Ik hoef alleen hier de user aan te passen.

    public NextPreviousExercise() throws IOException {
        super();



    }

}
