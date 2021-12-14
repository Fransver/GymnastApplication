package oldui;


import campus.Campus;
import models.Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * alle logica van de alternatieve cursus zit nu hier. Hoe kan ik deze ombouwen naar het domeinmodel "Course"?
 * Dit uitzoeken gezien
 */

public class AlternativeExercisePage extends Gymnastpage implements ActionListener {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Please Choose a alternative Exercise");
    JTextArea discription = new JTextArea("");
    JButton campusButton = new JButton("Campus");

    JList<Exercise> alterlistFrontflip;
    Campus campus = new Campus();


    public  AlternativeExercisePage() throws Exception {
        super();


        List<String> alternativefrontflipExercises = new ArrayList<>(0);
        String[] namesfrontflip = new String[0];

        for (Exercise exercise : campus.getListExercisesFrontflip()){
            alternativefrontflipExercises.add(exercise.getExerciseName());
        }
        namesfrontflip = alternativefrontflipExercises.toArray(new String[0]);
        alterlistFrontflip = new JList(namesfrontflip);


        alterlistFrontflip.setFocusable(false);
        alterlistFrontflip.setBounds(20, 100, 350, 300);
        alterlistFrontflip.setVisibleRowCount(9);
        alterlistFrontflip.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        welcomeLabel.setBounds(20,0,500,35);
        welcomeLabel.setFont(new Font(null, Font.BOLD,25));

        frame.add(campusButton);
        frame.add(alterlistFrontflip);
        frame.add(welcomeLabel);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
