package models;

import interfaces.IUser;

public class Gymnast implements IUser {

    private int id;
    private String name;
    private String gender;
    private int points;
    private String club;



    /**
     * To do
     * 1. Field meegeven zoals: Current Exercise
     * 2. Field meegeven Current Course.
     * 3. Field ID meegeven voor de login.
     *
     */

    public Gymnast(int id, String name, String gender, int points, String club) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.points = points;
        this.club = club;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }


    public int getPoints() {
        return points;
    }

    public String getClub() {
        return club;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}

