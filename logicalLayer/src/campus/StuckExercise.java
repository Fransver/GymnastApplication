package campus;

import oldui.AlternativeExercisePage;

import javax.swing.*;

public class StuckExercise {

private SuggestAlterCourse alterCourse = new SuggestAlterCourse(0, "", 0);

public StuckExercise(){

}

    public boolean stuckExercise() {
        alterCourse.getAttemptsExercise();
        alterCourse.getFeedbackCourse();
        int feedbackscore = alterCourse.getFrustrationScore(); // Decides if user stays at current or goes to alternative course.
        if (feedbackscore == 2 || feedbackscore == 3) {
            return true;
        } else if (feedbackscore == 1) {
            JOptionPane.showMessageDialog(null, "Please try a little longer");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect input");

        } return false;
    }

}
