package ui;

import campus.Scoremanager;
import campus.StuckExercise;
import models.Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Deze class bevat veel logica in zich en is een onderdeel van UI.
 * Ik ga uitzoeken hoe ik deze logica in de oorspronkelijke classes kan bouwen om ze hier aan te roepen.
 */

public abstract class ExercisePage extends Gymnastpage implements ActionListener {


    Scanner myScanner = new Scanner(System.in);



    Scoremanager scoremanager = new Scoremanager();
    StuckExercise stuckExercise = new StuckExercise();
//    NextPreviousExercise nextPreviousExercise = new NextPreviousExercise();



    private Exercise[] JsonCourse = campus.getListExercisesFrontflip(); // lege lijst oefeningen. ---> Hoe override ik die?
    private ListIterator<Exercise> exerciseListIterator = Arrays.stream(JsonCourse).toList().listIterator();




    JFrame exerciseFrame = new JFrame();
    JLabel titleLable = new JLabel();
    JLabel nameGymnast = new JLabel("User: " + gymnast.getName() );
    JLabel pointsGymnast = new JLabel("Points: " );
    JButton completeButton = new JButton("Complete");
    JButton campusButton = new JButton("Campus");
    JButton previousButton = new JButton("Previous");
    JButton stuckButton = new JButton("Stuck");
    JTextArea discription = new JTextArea();
    JCheckBox checkBox1 = new JCheckBox("test1");
    JCheckBox checkBox2 = new JCheckBox("test2");
    JCheckBox checkBox3 = new JCheckBox("test3");
    private Object IOException;


    public ExercisePage() throws IOException {




        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
        checkBox1.setBounds(20, 450, 300, 20);
        checkBox2.setBounds(20, 500, 300, 20);
        checkBox3.setBounds(20, 550, 300, 20);

        titleLable.setText("Title Exercise");
        titleLable.setBounds(20, 30, 200, 50);
        titleLable.setFont(new Font(null, Font.BOLD, 15));
        titleLable.setVerticalAlignment(JLabel.TOP);

        discription.setBounds(20, 100, 250, 250);
        discription.setLineWrap(true);
        discription.setWrapStyleWord(true);


        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));
        nameGymnast.setText("User:" + gymnast.getName());

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));
        pointsGymnast.setText("Points: " + gymnast.getPoints());

        completeButton.setFocusable(false);
        completeButton.addActionListener(this);
        completeButton.setBounds(600, 630, 100, 20);

        stuckButton.setFocusable(false);
        stuckButton.addActionListener(this);
        stuckButton.setBounds(480, 630, 100, 20);

        previousButton.setFocusable(false);
        previousButton.addActionListener(this);
        previousButton.setBounds(140, 630, 100, 20);

        campusButton.setFocusable(false);
        campusButton.addActionListener(this);
        campusButton.setBounds(20, 630, 100, 20);

        exerciseFrame.setSize(750, 750);
        exerciseFrame.setLayout(null);
        exerciseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        exerciseFrame.setVisible(true);

        exerciseFrame.add(completeButton);
        exerciseFrame.add(stuckButton);
        exerciseFrame.add(previousButton);
        exerciseFrame.add(nameGymnast);
        exerciseFrame.add(pointsGymnast);
        exerciseFrame.add(campusButton);
        exerciseFrame.add(titleLable);
        exerciseFrame.add(checkBox1);
        exerciseFrame.add(checkBox2);
        exerciseFrame.add(checkBox3);
        exerciseFrame.add(discription);

    }

//    public int getScoreUser() {
//        return scoreUser;
//    }

    public void completeExercise() throws IOException {
        if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) { // with JSON data -> ONLY NEXT
            JOptionPane.showMessageDialog(null, "Great job, continue to the next exercise! ");
            if (exerciseListIterator.hasNext()) {

                Exercise nextEx = exerciseListIterator.next();

                // Kan ik deze data naar de JSON-File sturen?
                int score = scoremanager.distributescoreExercise() + gymnast.getPoints(); // SR vanuit DistributeExercise Class
                pointsGymnast.setText("Points: " + score);
                gymnast.setPoints(score);

                titleLable.setText(nextEx.getExerciseName());
                discription.setText(nextEx.getDiscription());



                // Als er op complete gedrukt wordt resetten de checkboxes weer en verdwijnen ze.
                checkBox1.setVisible(false);
                checkBox2.setVisible(false);
                checkBox3.setVisible(false);
                checkBox1.setSelected(false);
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
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

    public void previousExercise() {
        if (exerciseListIterator.hasPrevious()) {
            Exercise previousEx = exerciseListIterator.previous();
            titleLable.setText(previousEx.getExerciseName());
            discription.setText(previousEx.getDiscription());
            int score =   gymnast.getPoints() + scoremanager.subtractscoreExercise(); // Ook hier de CAMPUS-Class gebruikt voor de -score
            pointsGymnast.setText("Points: " + score);
        }
    }




    @Override
    public void actionPerformed(ActionEvent e)  {
        /**
         * Hier staan alle actie-methods voor de oefeningenpagina's.
         *
         * -- stelregel weinig code in action performed.
         *
         */

        if (e.getSource() == completeButton) {
            try {
                completeExercise();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if (e.getSource() == completeButton) {
                checkBox1.setVisible(true);
                checkBox2.setVisible(true);
                checkBox3.setVisible(true);
            }
        }
        if(e.getSource()==previousButton){   // Actie van vorige oefening.
           previousExercise();
        }

        if (e.getSource() == campusButton) {
            try {
                new CampusPage();
            } catch (java.io.IOException ex) {
                ex.printStackTrace();
            }
            exerciseFrame.dispose();



        }

        if (e.getSource() == stuckButton){
            stuckExercise.stuckExercise();
        }

    }
}

