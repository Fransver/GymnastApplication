package ui;

import campus.Campus;
import models.Exercise;
import models.Gymnast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CampusPage implements ActionListener{

    private Gymnast gymnast;
    private Campus campus;
    private Exercise[] JsonCourse;
    private ListIterator<Exercise> exerciseListIterator;

    // Swing Components
    private Buttons buttons = new Buttons();
    private Labels labels = new Labels();
    private Checkboxes checkboxes = new Checkboxes();
    private SwingStuckExercise stuckExerciseSwing = new SwingStuckExercise();
    private TextAreas textAreas = new TextAreas();
    private Images images = new Images();


    JFrame frame = new JFrame();
    JList<Exercise> alterlistFrontflip;

    // Labels
    JLabel welcomeLabel = labels.getWelcomeLabel();
    JLabel welcomeLabel2 = labels.getWelcomeLabel2();
    JLabel id = labels.getId();
    JLabel nameGymnast = labels.getNameGymnast();
    JLabel pointsGymnast = labels.getPointsGymnast();
    JLabel titleLable = labels.getTitleLable();
    JLabel attemptsLabel = stuckExerciseSwing.getAttempts();
    JLabel frustrationLabel = stuckExerciseSwing.getFrustration();
    JLabel media = images.getMedia();


    // Buttons
    JButton completeButton = buttons.getCompleteButton();
    JButton previousButton = buttons.getPreviousButton();
    JButton stuckButton = buttons.getStuckButton();
    JButton courseButton = buttons.getCourseButton();
    JButton frontFlip = buttons.getFrontFlip();
    JButton fullLayout = buttons.getFullLayout();
    JButton handspring = buttons.getHandspring();
    JButton select = buttons.getSelect();
    JButton submitAtt = stuckExerciseSwing.getSubmitatt();
    JButton submitFrus = stuckExerciseSwing.getSubmitfrus();
    JButton alterCourse = stuckExerciseSwing.getAlterCourse();
    JButton homeButton = buttons.getHome();

    // Checkboxes
    JCheckBox checkBox1 = checkboxes.getCheckBox1();
    JCheckBox checkBox2 = checkboxes.getCheckBox2();
    JCheckBox checkBox3 = checkboxes.getCheckBox3();

    // Textfields + Area's
    JTextField attempts = stuckExerciseSwing.getAttemptsField();
    JTextField frustration = stuckExerciseSwing.getFrustrationField();
    JTextArea discription = textAreas.getDiscription();

    // Images
    ImageIcon titleScreen = images.getTitleScreen();



    public CampusPage(Campus campus) throws IOException {

        this.campus = campus;
        this.gymnast = campus.getGymnasts()[0];
        JlistAlterExercisesFrontflip();

        // Media
        media.setIcon(titleScreen);

        // Action Listener
        completeButton.addActionListener(this);
        stuckButton.addActionListener(this);
        previousButton.addActionListener(this);
        courseButton.addActionListener(this);
        handspring.addActionListener(this);
        fullLayout.addActionListener(this);
        frontFlip.addActionListener(this);
        submitAtt.addActionListener(this);
        submitFrus.addActionListener(this);
        alterCourse.addActionListener(this);
        homeButton.addActionListener(this);
        select.addActionListener(this);


        // Interaction User
        nameGymnast.setText("Name: " + gymnast.getName());
        pointsGymnast.setText("Points: " + gymnast.getPoints());
        discription.setText("Hello " + gymnast.getName() + "\n\n");
        textAreas.standardWelcome();



        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] nummers = alterlistFrontflip.getSelectedIndices();
                for (int i = 0; i <nummers.length ; i++) {
                    System.out.println("test waarde oefening:  " + nummers[i]);
                    int selection = nummers[i];
                    Exercise ex = campus.getListAlterExercisesFrontflip()[selection];
                    discription.setText(ex.getDiscription());
                    titleLable.setText(ex.getExerciseName());
                }
            }
        });


        alterlistFrontflip.setFocusable(false);
        alterlistFrontflip.setBounds(400,100,250,100);
        alterlistFrontflip.setVisibleRowCount(9);
        alterlistFrontflip.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        alterlistFrontflip.setVisible(false);

        frame.add(welcomeLabel);
        frame.add(welcomeLabel2);
        frame.add(frontFlip);
        frame.add(fullLayout);
        frame.add(handspring);
        frame.add(discription);
        frame.add(id);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);
        frame.add(completeButton);
        frame.add(stuckButton);
        frame.add(previousButton);
        frame.add(courseButton);
        frame.add(homeButton);
        frame.add(select);
        frame.add(nameGymnast);
        frame.add(pointsGymnast);
        frame.add(titleLable);
        frame.add(alterlistFrontflip);
        frame.add(attempts);
        frame.add(frustration);
        frame.add(submitAtt);
        frame.add(submitFrus);
        frame.add(frustrationLabel);
        frame.add(attemptsLabel);
        frame.add(alterCourse);
        frame.add(media);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frontFlip) {
            frontFlipCourse();
        }

        if (e.getSource() == handspring) {
            handspringCourse();
        }

        if (e.getSource() == fullLayout) {
            JOptionPane.showMessageDialog((Component) null, "Not active yet ");
        }

        if (e.getSource() == completeButton) {
            completeExercise();
            checkboxes.visibleCheckboxesTrue();





        }

        if (e.getSource() == previousButton) {
            previousExercise();
        }

        if (e.getSource() == courseButton) {
            visibleCourseTrue();
            buttons.visibleExerciseButtonsFalse();
            homeButton.setVisible(true);
        }

        if (e.getSource() == stuckButton) {
            stuckExerciseSwing.stuckExerciseFieldsVisibleTrue();
            alterlistFrontflip.setVisible(false);
        }

        if (e.getSource() == homeButton){
            homeScreen();
        }

        if (e.getSource() == submitAtt){
            stuckExerciseSwing.attemptsExercise();
            stuckExerciseSwing.attempts.setText("Number attempts: " + attempts.getText());

        }

        if (e.getSource() == submitFrus){
            stuckExerciseSwing.frustrationScore();
            stuckExerciseSwing.frustration.setText("Frustration Score 1-3: " + frustration.getText());
        }

        if (e.getSource() == alterCourse){
            if (stuckExerciseSwing.userIsStuck()){
                stuckExerciseSwing.stuckExerciseFieldsVisibleFalse();
                alterlistFrontflip.setVisible(true);
                select.setVisible(true);

            }
        }

        if (e.getSource() == select){
            alterCourseFrontflip();
            alterlistFrontflip.setVisible(false);
            checkboxes.visibleCheckboxesFrontFlip();
        }


    }


    public boolean completeExercise()  { // Hier is de implementatie van de interface COMPLETE opgenomen


        if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Great job, continue to the next exercise! ");
            checkboxes.visibleCheckboxesFalse();

            Exercise nextEx = exerciseListIterator.next();
            if (exerciseListIterator.hasNext()) {
                titleLable.setText(nextEx.getExerciseName());
                discription.setText(nextEx.getDiscription());
                int score = campus.distributescoreExercise() + gymnast.getPoints();
                pointsGymnast.setText("Points: " + score);




            } else {
                JOptionPane.showMessageDialog(null, "Congrats, you have completed the course!");
                int score = campus.distributescoreCourse() + gymnast.getPoints();
                pointsGymnast.setText("Points" + score);
                gymnast.setPoints(score);
            }

        } else if (checkBox1.isSelected() && checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Maybe you can train a little longer before completing!");

        } else if (checkBox2.isSelected() && checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Maybe you can train a little longer before completing!");
        } else if (checkBox1.isSelected() && checkBox2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Maybe you can train a little longer before completing!");
        } else if (checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "If you can't complete 2 to 3 requirements, maybe it is better" +
                    "to practice with the previous exercise. ");
        }
        return false;
    }


    public void homeScreen(){
        media.setIcon(titleScreen);
        visibleCourseTrue();
        welcomeLabel.setText("Gymnast-Application");
        welcomeLabel.setVisible(true);
        checkboxes.visibleCheckboxesFalse();
        titleLable.setText("");
        discription.setText("Hello gymnast, welcome to the Gymnast-Application\n\nWith this awesome app we will help you " +
                "improve your technique in a fun, safe and correct way. You will learn all sorts of fun exercises that" +
                "will help you with your journey to the next level!  ");

    }

    public void visibleCourseTrue() {
        frontFlip.setVisible(true);
        handspring.setVisible(true);
        fullLayout.setVisible(true);
        welcomeLabel2.setVisible(true);
    }

    public void visibleExerciseButtonsTrue() {
        completeButton.setVisible(true);
        stuckButton.setVisible(true);
        previousButton.setVisible(true);
        courseButton.setVisible(true);
        welcomeLabel2.setVisible(false);
        titleLable.setVisible(true);
        discription.setText("Check all 3 boxes to start the Course, Have Fun! ");


    }

    public void JlistAlterExercisesFrontflip(){
        List<String> alternativefrontflipExercises = new ArrayList<>(0);
        String[] namesfrontflip = new String[0];

        for (Exercise exercise : campus.getListAlterExercisesFrontflip()){
            alternativefrontflipExercises.add(exercise.getExerciseName());
        }
        namesfrontflip = alternativefrontflipExercises.toArray(new String[0]);
        alterlistFrontflip = new JList(namesfrontflip);

    }


    public void previousExercise() {
        if (exerciseListIterator.hasPrevious()) {
            Exercise previousEx = exerciseListIterator.previous();
            titleLable.setText(previousEx.getExerciseName());
            discription.setText(previousEx.getDiscription());
            int score =   gymnast.getPoints() + campus.subtractscoreExercise(); // Ook hier de CAMPUS-Class gebruikt voor de -score
            pointsGymnast.setText("Points: " + score);
        }
    }

    public void alterCourseFrontflip(){
        JsonCourse = campus.getListAlterExercisesFrontflip();
        exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
        checkboxes.visibleCheckboxesCourse();
        buttons.visibleCoursebuttonseFalse();
        media.setIcon(images.getFrontflipCourse());
        visibleExerciseButtonsTrue();
        select.setVisible(false);
        // Tijdelijke oplossing doordat ik een lijst gebruik in plaats van de gebruiker een CURRENTEXERCISE meegeef.
        // Dit doe ik volgende keer zeker anders.
        discription.setText(Arrays.stream(campus.getListAlterExercisesFrontflip()).toList().get(0).getDiscription());
        titleLable.setText(Arrays.stream(campus.getListAlterExercisesFrontflip()).toList().get(0).getExerciseName());
    }

    public void frontFlipCourse(){
        JsonCourse = campus.getListExercisesFrontflip();
        exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
        checkboxes.visibleCheckboxesFrontFlip();
        buttons.visibleCoursebuttonseFalse();
        media.setIcon(images.getFrontflipCourse());
        visibleExerciseButtonsTrue();
        welcomeLabel.setText("Frontflip Course");
    }

    public void handspringCourse(){
        JsonCourse = campus.getListExercisesHandspring();
        exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
        checkboxes.visibleCheckboxesHandspring();
        buttons.visibleCoursebuttonseFalse();
        media.setIcon(images.getHandspringCourse());
        visibleExerciseButtonsTrue();
        welcomeLabel.setText("Handspring Course");

    }


}
