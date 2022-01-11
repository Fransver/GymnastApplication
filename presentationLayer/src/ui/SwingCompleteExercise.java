package ui;

import interfaces.ICompleteExercise;
import models.Exercise;

import javax.swing.*;
import java.util.ListIterator;

public class SwingCompleteExercise implements ICompleteExercise {

    private JCheckBox checkBox1 = new JCheckBox("");
    private JCheckBox checkBox2 = new JCheckBox("");
    private JCheckBox checkBox3 = new JCheckBox("");


    public SwingCompleteExercise(){
        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
        checkBox1.setBounds(20,450,300,20);
        checkBox2.setBounds(20,500,300,20);
        checkBox3.setBounds(20,550,300,20);
    }

    @Override
    public boolean completeExercise() {

        if (checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Great job, continue to the next exercise! ");
           return true;

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

}
