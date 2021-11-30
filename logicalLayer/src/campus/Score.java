package campus;

public abstract class Score {
    private int score;

    public Score(int score){
        this.score = score;
    }

    public int currentScore(){
        System.out.println("Points: " + score);
        return score;
    }

}
