package campus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StuckExerciseTest {

    @Test
    void stuckExerciseWhenNotEnoughFeedbackPoints() {
        // Feedback with 3 Stresspoints
        SuggestAlterCourse testStuck = new SuggestAlterCourse(2, 1);

        // Method Boolean
        boolean stuckExerciseShowList;
        int feedbackScore = testStuck.collectFeedbackAlterCourse();
        if (feedbackScore >=4){
            stuckExerciseShowList = true;

        } else
        {
            stuckExerciseShowList = false;
        }

        // Assert False, 3 points will not pass the boolean.
        assertFalse(stuckExerciseShowList);
    }

    @Test
    void stuckExerciseWhenEnoughFeedbackPoints() {
        // Feedback with 6 Stresspoints
        SuggestAlterCourse testStuck = new SuggestAlterCourse(3, 3);

        // Method Boolean
        boolean stuckExerciseShowList;
        int feedbackScore = testStuck.collectFeedbackAlterCourse();
        if (feedbackScore >=4){
            stuckExerciseShowList = true;

        } else
        {
            stuckExerciseShowList = false;
        }

        // Assert True, 6 points will pass the boolean
        assertTrue(stuckExerciseShowList);
    }
}