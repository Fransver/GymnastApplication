package ui;

import javax.swing.*;

public class TextAreas {

    private JTextArea discription = new JTextArea("");



    public TextAreas(){
        discription.setBounds(20, 100, 350, 100);
        discription.setLineWrap(true);
        discription.setWrapStyleWord(true);


    }

    public JTextArea getDiscription() {
        return discription;
    }

    public void standardWelcome(){
        discription.append("Welcome to the Gymnast-Application\nWith this awesome app we will help you " +
                "improve your technique in a fun, safe and correct way. You will learn all sorts of fun exercises that" +
                "will help you with your journey to the next level!  ");
    }
}
