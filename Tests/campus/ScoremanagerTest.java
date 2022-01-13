package campus;

import models.Gymnast;
import oldLogica.Scoremanager;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ScoremanagerTest {

    Scoremanager testScoremanager = new Scoremanager(); // Voor het testen van de score hier toch de oude gebruikt.
    //


    @org.junit.jupiter.api.Test // met aangemaakte Gymnast
    void distributescoreCourse() {

        // mock gymnast
        Gymnast gym1 = new Gymnast(1, "test", "male", 200, "testclub");

        int expectedScore = 250;
        int actualScore = gym1.getPoints() + testScoremanager.distributescoreCourse();

        assertEquals(expectedScore,actualScore);

    }

    @org.junit.jupiter.api.Test // mockito krijg ik niet werkend. Missende Jar??
    void distributescoreExercise() {
        Gymnast gym2 = Mockito.mock(Gymnast.class);
        Mockito.when(gym2.getPoints()).thenReturn(100);

        int expectedScore = 110;
        int actualScore = gym2.getPoints() + testScoremanager.distributescoreExercise();

        assertEquals(expectedScore, actualScore);
    }

    @org.junit.jupiter.api.Test
    void subtractscoreExercise() {
        // mock gymnast
        Gymnast gym1 = new Gymnast(1, "test", "male", 200, "testclub");


        int expectedScore = 190;
        int actualScore = gym1.getPoints() + testScoremanager.subtractscoreExercise();

        assertEquals(expectedScore,actualScore);
    }
}