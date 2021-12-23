//package campus;
//
//import org.junit.jupiter.api.Test;
//import ui.SuggestAlterCourseConsole;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StuckExerciseConsoleTest {
//
//    @Test
//    void stuckExerciseWhenNotEnoughFeedbackPoints() {
//        // Feedback with 3 Stresspoints
//        SuggestAlterCourseConsole testStuck = new SuggestAlterCourseConsole(2, 1);
//
//        // Method Boolean
//        boolean stuckExerciseShowList;
//        int feedbackScore = testStuck.collectFeedbackAlterCourse();
//        if (feedbackScore >=4){
//            stuckExerciseShowList = true;
//
//        } else
//        {
//            stuckExerciseShowList = false;
//        }
//
//        // Assert False, 3 points will not pass the boolean.
//        assertFalse(stuckExerciseShowList);
//    }
//
//    @Test
//    void stuckExerciseWhenEnoughFeedbackPoints() {
//        // Feedback with 6 Stresspoints
//        SuggestAlterCourseConsole testStuck = new SuggestAlterCourseConsole(3, 3);
//
//        // Method Boolean
//        boolean stuckExerciseShowList;
//        int feedbackScore = testStuck.collectFeedbackAlterCourse();
//        if (feedbackScore >=4){
//            stuckExerciseShowList = true;
//
//        } else
//        {
//            stuckExerciseShowList = false;
//        }
//
//        // Assert True, 6 points will pass the boolean
//        assertTrue(stuckExerciseShowList);
//    }
//}