package ui;

import javax.swing.*;

public class Checkboxes {

    private JCheckBox checkBox1 = new JCheckBox("");
    private JCheckBox checkBox2 = new JCheckBox("");
    private JCheckBox checkBox3 = new JCheckBox("");


    public Checkboxes(){

        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
        checkBox1.setBounds(20,450,300,20);
        checkBox2.setBounds(20,500,300,20);
        checkBox3.setBounds(20,550,300,20);


    }

    public JCheckBox getCheckBox1() {
        return checkBox1;
    }

    public JCheckBox getCheckBox2() {
        return checkBox2;
    }

    public JCheckBox getCheckBox3() {
        return checkBox3;
    }

    public void visibleCheckboxesFrontFlip(){
        checkBox1.setVisible(true);
        checkBox2.setVisible(true);
        checkBox3.setVisible(true);
        checkBox1.setText("I can stick the landing");
        checkBox2.setText("My performance is technical correct");
        checkBox3.setText("I can perform 5 good tries in a row");
    }

    public void visibleCheckboxesHandspring(){
        checkBox1.setVisible(true);
        checkBox2.setVisible(true);
        checkBox3.setVisible(true);
        checkBox1.setText("I can maintain core tension");
        checkBox2.setText("my arms are straight, shoulders open");
        checkBox3.setText("I can perform 5 good tries in a row");
    }

    public void visibleCheckboxesFalse(){
        checkBox1.setVisible(false);
        checkBox2.setVisible(false);
        checkBox3.setVisible(false);
//        checkBox1.setSelected(false);
//        checkBox2.setSelected(false);
//        checkBox3.setSelected(false);
    }

    public void visibleCheckboxesTrue(){
        checkBox1.setVisible(true);
        checkBox2.setVisible(true);
        checkBox3.setVisible(true);
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
}
