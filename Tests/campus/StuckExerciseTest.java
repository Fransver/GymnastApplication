package campus;

import interfaces.IStuckExercise;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


class StuckExerciseTest  {




    @Test
    void UserPutsInEnoughPointsAttemptsForAccesAlternativeRoute(){

        int attemptsExercise = 0;
        int attempts = 15;

        if (attempts >= 10){
            attemptsExercise = 2;
        } else if (attempts >=20){
            attemptsExercise =3;
        } else if (attempts <10){
            attemptsExercise =1;
        }

        int expectedScore = 2;
        int actualScore = attemptsExercise;

        assertEquals(expectedScore, actualScore);

    }


}
