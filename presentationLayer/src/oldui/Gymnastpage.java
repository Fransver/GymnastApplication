package oldui;


import campus.Campus;
import dataConvert.DataLayer;
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

public  class Gymnastpage implements ActionListener {



    JFrame frame = new JFrame();
    JLabel nameGymnast = new JLabel("User: " );
    JLabel pointsGymnast = new JLabel("Points: " );







    public Gymnastpage() throws IOException {



        nameGymnast.setFocusable(false);
        nameGymnast.setBounds(450, 30, 300, 20);
        nameGymnast.setFont(new Font(null, Font.BOLD, 15));
        nameGymnast.setText("Hello: ");

        pointsGymnast.setFocusable(false);
        pointsGymnast.setBounds(600, 30, 300, 20);
        pointsGymnast.setFont(new Font(null, Font.BOLD, 15));
        pointsGymnast.setText("Points: " );

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(nameGymnast);
        frame.add(pointsGymnast);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
