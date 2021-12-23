package extension;

import interfaces.IUser;

public class Freerunner implements IUser {

    private int id;
    private String name;
    private String gender;
    private int points;
    private String club;



    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getGender() {
        return null;
    }

    @Override
    public int getPoints() {
        return 0;
    }

    @Override
    public String getClub() {
        return null;
    }
}
