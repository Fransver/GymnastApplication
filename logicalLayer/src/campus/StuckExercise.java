package campus;

import oldui.AlternativeExercisePage;

import javax.swing.*;

public class StuckExercise {

private SuggestAlterCourse alterCourse = new SuggestAlterCourse(0, "", 0);

public StuckExercise(){

}

    public void stuckExercise() {
        alterCourse.getAttemptsExercise();
        alterCourse.getFeedbackCourse();
        int feedbackscore = alterCourse.getFrustrationScore(); // Decides if user stays at current or goes to alternative course.
        if (feedbackscore == 2 || feedbackscore == 3) {
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?", "Alternative option", JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {

                try {
                    new AlternativeExercisePage();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (feedbackscore == 1) {
            JOptionPane.showMessageDialog(null, "Please try a little longer");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect input");

        }
    }

}
