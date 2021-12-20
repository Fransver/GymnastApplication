package campus;

import oldui.AlternativeExercisePage;

import javax.swing.*;

public class StuckExercise {

private SuggestAlterCourse alterCourse = new SuggestAlterCourse(0, 0);

public StuckExercise(){

}


    public boolean stuckExercise(){
    alterCourse.getAttemptsExercise();
    alterCourse.getFrustrationScore();
    int feedbackScore = alterCourse.collectFeedbackAlterCourse();
    if (feedbackScore >= 4){
         return true;
        } else if (feedbackScore <= 3){
        JOptionPane.showMessageDialog(null, "Please try a little longer");
    } else {
        JOptionPane.showMessageDialog(null, "Incorrect input");
    } return  false;
    }

}
