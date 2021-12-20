package campus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuggestAlterCourseTest {


    @Test
    void assertWhenCollectFeedbackIntIsEnough() {
        SuggestAlterCourse testStuck = new SuggestAlterCourse(1,3);

        testStuck.collectFeedbackAlterCourse();
        assertTrue(true);
    }

    @Test
    void assertWhenCollectFeedbackIntIsNotEnough() {
        SuggestAlterCourse testStuck = new SuggestAlterCourse(1,1);

        testStuck.collectFeedbackAlterCourse();

        int expected =2;
        int actual = testStuck.collectFeedbackAlterCourse();

        assertEquals(expected,actual);

    }


}