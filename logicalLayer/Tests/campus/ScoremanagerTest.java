package campus;

import models.Gymnast;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ScoremanagerTest {

    Scoremanager testScoremanager = new Scoremanager();
    Gymnast gym1 = new Gymnast(1, "test", "male", 2, 200, "testclub");


    @org.junit.jupiter.api.Test // met aangemaakte Gymnast
    void distributescoreCourse() {

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
        int expectedScore = 190;
        int actualScore = gym1.getPoints() + testScoremanager.subtractscoreExercise();

        assertEquals(expectedScore,actualScore);
    }
}