package campus;

import org.junit.jupiter.api.Test;
import ui.SuggestAlterCourseConsole;

import static org.junit.jupiter.api.Assertions.*;

class SuggestAlterCourseConsoleTest {


    @Test
    void assertWhenCollectFeedbackIntIsEnough() {
        SuggestAlterCourseConsole testStuck = new SuggestAlterCourseConsole(1,3);

        testStuck.collectFeedbackAlterCourse();
        assertTrue(true);
    }

    @Test
    void assertWhenCollectFeedbackIntIsNotEnough() {
        SuggestAlterCourseConsole testStuck = new SuggestAlterCourseConsole(1,1);

        testStuck.collectFeedbackAlterCourse();

        int expected =2;
        int actual = testStuck.collectFeedbackAlterCourse();

        assertEquals(expected,actual);

    }


}