package ui;

import campus.Campus;
import campus.Scoremanager;
import campus.StuckExercise;
import models.Exercise;
import models.Gymnast;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CampusPage implements ActionListener {

    private Gymnast gymnast;
    private Campus campus;
    private Scoremanager scoremanager = new Scoremanager();
    private StuckExercise stuckExercise = new StuckExercise();
    private Exercise[] JsonCourse; // lege lijst oefeningen. ---> Hoe override ik die?
    private ListIterator<Exercise> exerciseListIterator;

    JFrame frame = new JFrame();
    JTextArea discription = new JTextArea("");
    JList<Exercise> alterlistFrontflip;
    DefaultListModel<Exercise> model = new DefaultListModel<>();

    JLabel welcomeLabel = new JLabel();
    JLabel welcomeLabel2 = new JLabel();
    JLabel id = new JLabel();
    JLabel nameGymnast = new JLabel();
    JLabel pointsGymnast = new JLabel();
    JLabel titleLable = new JLabel();

    JButton completeButton = new JButton("Complete");
    JButton previousButton = new JButton("Previous");
    JButton stuckButton = new JButton("Stuck");
    JButton frontFlip = new JButton("Front Flip");
    JButton fullLayout = new JButton("Full Layout");
    JButton handspring = new JButton("Handspring");
    JButton courseButton = new JButton("Course");
    JButton select = new JButton("Select");

    JCheckBox checkBox1 = new JCheckBox("Start");
    JCheckBox checkBox2 = new JCheckBox("This");
    JCheckBox checkBox3 = new JCheckBox("Course");


    public CampusPage(Campus campus, Gymnast gymnast) throws IOException {

        this.gymnast = gymnast;
        this.campus = campus;
        JlistAlterExercisesFrontflip();

        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));
        nameGymnast.setText("Name: " + gymnast.getName());

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));
        pointsGymnast.setText("Points: " + gymnast.getPoints());

        discription.setBounds(20, 100, 350, 200);
        discription.setLineWrap(true);
        discription.setWrapStyleWord(true);
        discription.setText("Hello gymnast, welcome to the Gymnast-Application\n\nWith this awesome app we will help you " +
                "improve your technique in a fun, safe and correct way. You will learn all sorts of fun exercises that" +
                "will help you with your journey to the next level!  ");

        titleLable.setText("Title Exercise");
        titleLable.setBounds(20, 70, 200, 20);
        titleLable.setFont(new Font(null, Font.BOLD, 15));
        titleLable.setVerticalAlignment(JLabel.TOP);
        titleLable.setVisible(false);

        welcomeLabel.setBounds(20, 30, 320, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 25));
        welcomeLabel.setText("Gymnast-Application");

        id.setBounds(300, 0, 100, 35);
        id.setFont(new Font(null, Font.BOLD, 20));

        welcomeLabel2.setBounds(20, 550, 500, 100);
        welcomeLabel2.setFont(new Font(null, Font.ITALIC, 20));
        welcomeLabel2.setText("Please select a Course");

        frontFlip.setBounds(20, 630, 100, 25);
        frontFlip.setFocusable(false);
        frontFlip.addActionListener(this);

        fullLayout.setBounds(140, 630, 100, 25);
        fullLayout.setFocusable(false);
        fullLayout.addActionListener(this);

        handspring.setBounds(260, 630, 100, 25);
        handspring.setFocusable(false);
        handspring.addActionListener(this);

        courseButton.setFocusable(false);
        courseButton.addActionListener(this);
        courseButton.setVisible(false);
        courseButton.setBounds(20, 630, 100, 20);

        completeButton.setFocusable(false);
        completeButton.addActionListener(this);
        completeButton.setBounds(600, 630, 100, 20);
        completeButton.setVisible(false);



        select.setFocusable(false);
        select.setBounds(550,325,100,20);
        select.setVisible(false);
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] nummers = alterlistFrontflip.getSelectedIndices();
                for (int i = 0; i <nummers.length ; i++) {
                    Exercise ex = campus.getListAlterExercisesFrontflip()[i];
                    discription.setText(ex.getDiscription());
                    titleLable.setText(ex.getExerciseName());
                }
            }
        });


        stuckButton.setFocusable(false);
        stuckButton.addActionListener(this);
        stuckButton.setBounds(480,630,100,20);
        stuckButton.setVisible(false);

        previousButton.setFocusable(false);
        previousButton.addActionListener(this);
        previousButton.setBounds(360,630,100,20);
        previousButton.setVisible(false);

        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
        checkBox1.setBounds(20,450,300,20);
        checkBox2.setBounds(20,500,300,20);
        checkBox3.setBounds(20,550,300,20);

        alterlistFrontflip.setFocusable(false);
        alterlistFrontflip.setBounds(400,100,250,200);
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
        frame.add(select);
        frame.add(nameGymnast);
        frame.add(pointsGymnast);
        frame.add(titleLable);
        frame.add(alterlistFrontflip);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frontFlip) {
            JsonCourse = campus.getListExercisesFrontflip();
            exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
            visibleCheckboxesCourse();
            visibleCoursebuttonseFalse();
            visibleExerciseButtonsTrue();

        }

        if (e.getSource() == handspring) {
            JsonCourse = campus.getListExercisesHandspring();
            exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();
            visibleCheckboxesCourse();
            visibleCoursebuttonseFalse();
            visibleExerciseButtonsTrue();

        }

        if (e.getSource() == fullLayout) {
            JOptionPane.showMessageDialog((Component) null, "Not active yet ");
        }

        if (e.getSource() == completeButton) {

            visibleCheckboxesFrontFlip();
            try {
                completeExercise();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == previousButton) {
            previousExercise();
        }

        if (e.getSource() == courseButton) {
            visibleCourseTrue();
            visibleExerciseButtonsFalse();
        }

        if (e.getSource() == stuckButton) {
            JOptionPane.showMessageDialog(null, "Please go to the console! ");
            if (stuckExercise.stuckExercise()) {
                alterlistFrontflip.setVisible(true);
                select.setVisible(true);
            }
        }

        if (e.getSource() == select){

        }


    }


    public void completeExercise() throws IOException {

        if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Great job, continue to the next exercise! ");

            Exercise nextEx = exerciseListIterator.next();
            if (exerciseListIterator.hasNext()) {
                titleLable.setText(nextEx.getExerciseName());
                discription.setText(nextEx.getDiscription());
                int score = scoremanager.distributescoreExercise() + gymnast.getPoints();
                pointsGymnast.setText("Points: " + score);
                visibleCheckboxesFalse();


            } else {
                JOptionPane.showMessageDialog(null, "Congrats, you have completed the course!");
                int score = scoremanager.distributescoreCourse() + gymnast.getPoints();
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
    }






    public void visibleCoursebuttonseFalse() {
        frontFlip.setVisible(false);
        handspring.setVisible(false);
        fullLayout.setVisible(false);
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

    public void visibleExerciseButtonsFalse() {
        completeButton.setVisible(false);
        stuckButton.setVisible(false);
        previousButton.setVisible(false);
        courseButton.setVisible(false);
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


    public void visibleCheckboxesFrontFlip(){
        checkBox1.setVisible(true);
        checkBox2.setVisible(true);
        checkBox3.setVisible(true);
        checkBox1.setText("I can stick the landing");
        checkBox2.setText("My performance is technical correct");
        checkBox3.setText("I can perform 5 good tries in a row");
    }

    public void visibleCheckboxesFalse(){
        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
    }

    public void visibleCheckboxesCourse(){
        checkBox1.setText("Start");
        checkBox2.setText("This");
        checkBox3.setText("Course");
        checkBox1.setVisible(true);
        checkBox2.setVisible(true);
        checkBox3.setVisible(true);
    }


    public void previousExercise() {
        if (exerciseListIterator.hasPrevious()) {
            Exercise previousEx = exerciseListIterator.previous();
            titleLable.setText(previousEx.getExerciseName());
            discription.setText(previousEx.getDiscription());
            int score =   gymnast.getPoints() + scoremanager.subtractscoreExercise(); // Ook hier de CAMPUS-Class gebruikt voor de -score
            pointsGymnast.setText("Points: " + score);
        }
    }


}
