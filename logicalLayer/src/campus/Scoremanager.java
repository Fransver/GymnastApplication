package campus;

import interfaces.IScoreDistributer;

public class Scoremanager implements IScoreDistributer {
    private int score;

    public Scoremanager(){
        this.score = score;

    }

    @Override
    public int distributescoreCourse() {
        score += 50;
        return score;
    }

    @Override
    public int distributescoreExercise() {
        score += 10;
        return score;
    }

    @Override
    public int subtractscoreExercise() {
        score -= 10;
        return score;
    }
}
