package ui;

import javax.swing.*;

public class Images {

    private JLabel media = new JLabel(); // label that holds the media.

    private ImageIcon frontflipCourse = new ImageIcon("Media/frontflip1.png");
    private ImageIcon handspringCourse = new ImageIcon("Media/handspring1.png");

    public Images(){

        media.setBounds(20,250,700,150);
        media.setVisible(true);
        media.setFocusable(true);





    }

    public JLabel getMedia() {
        return media;
    }

    public ImageIcon getFrontflipCourse() {
        return frontflipCourse;
    }

    public ImageIcon getHandspringCourse() {
        return handspringCourse;
    }
}
