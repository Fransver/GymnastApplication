package campus;



import models.Gymnast;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CampusTest {



    @Test
    void getPointGymnastValidation(){

        Gymnast gym1 = new Gymnast(1, "test1", "male", 200, "testclub1");

        int actualPoints = gym1.getPoints();
        int expectedPoints = 200;

        assertEquals(actualPoints, expectedPoints);

    }


    @Test
    void completeExercise() {

    }



}