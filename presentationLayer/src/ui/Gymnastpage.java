package ui;


import campus.Campus;
import models.Gymnast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Deze pagina wordt overkoepelend voor de cursus, campus, oefening.
 * Hiermee hoef ik na de login maar 1 keer de gebruiker door te geven (dat is het plan).
 */

public abstract class Gymnastpage implements ActionListener {



    JFrame frame = new JFrame();
    JLabel nameGymnast = new JLabel("User: " );
    JLabel pointsGymnast = new JLabel("Points: " );
    Campus campus = new Campus();

    Gymnast gymnast = campus.getGymnasts()[0];


     ; // Deze uiteindelijk via LOGIN meegeven.


    public Gymnastpage(Gymnast gymnast) throws IOException {


        this.gymnast = gymnast;

        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));
        nameGymnast.setText("Hello: " + gymnast.getName());

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));
        pointsGymnast.setText("Points: " + gymnast.getPoints() );

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(nameGymnast);
        frame.add(pointsGymnast);
    }

    public Gymnastpage() throws IOException {
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
