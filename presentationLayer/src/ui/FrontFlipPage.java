package ui;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FrontFlipPage extends CoursePage implements ActionListener {

    ImageIcon picturefrontflip = new ImageIcon("src/media/frontflip1.png"); // tip: copy full path



    public FrontFlipPage() throws IOException {
        super();
        titleLable.setText("Front Flip Course");
        discription.setText("Welcome to the FrontFlip course.\n\n In this course you will learn how to" +
        "perform a high jumped tucked frontflip that you can use in all sort of ways. After completing" +
                "this course you can implement the flip on floor and beam.\n\n Later you can build on the flip to" +
                "create a piked, straight or even twisted layout. Goodluck!!");
        media.setIcon(picturefrontflip); // setting course media fronflip

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == startCourse){
            try {
                new FrontFlipExercisePage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            courseFrame.dispose();
        }
    }

}


