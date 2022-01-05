package campus;

import interfaces.IStuckExercise;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;


class StuckExerciseTest  {


    @Test
    void transferAttemptsToAScoreForLaterBooleanAcces(){

        // Transfer the number of attempts to a attemptsExerciseScore
        int attemptsExercise = 0;
        int attempts = 15;

        if (attempts >= 10){
            attemptsExercise = 2;
        } else if (attempts >=20){
            attemptsExercise =3;
        } else if (attempts <10){
            attemptsExercise =1;
        }

        // Testing the if statement
        int expectedScore = 2;
        int actualScore = attemptsExercise;

        assertEquals(expectedScore, actualScore);

    }

    @Test
    void determineIfUserGetsAccesToAlternativeListWithEnoughPoints(){

        // Variables
        int frustrationScore = 2;
        int attemptsExercise = 3;
        int feedbackScore = frustrationScore + attemptsExercise;

        if (feedbackScore >= 4){
            assertTrue(true);
            assertEquals(5, feedbackScore);
        }
    }

    @Test
    void determineIfUserGetsNoAccesBecauseToLittlePoints(){
        int frustrationScore = 1;
        int attemptsExercise = 2;
        int feedbackScore = frustrationScore + attemptsExercise;

        if (feedbackScore >= 4){
            assertTrue(false);
            assertEquals(3, feedbackScore);
        }

    }


}
