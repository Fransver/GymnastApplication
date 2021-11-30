package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HandspringPage extends CoursePage implements ActionListener {

    ImageIcon picturehandspring = new ImageIcon("src/media/handspring1.png"); // tip: copy full path


    public HandspringPage() throws IOException {
        super();
        titleLable.setText("Handspring Course");
        discription.setText("Nog vullen met welkom");
        media.setIcon(picturehandspring); // setting coursepicture handspring.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (e.getSource() == startCourse) {

            try {
                new HandspringExercisePage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            courseFrame.dispose();
        }
    }
}




