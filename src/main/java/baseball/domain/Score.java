package baseball.domain;

public class Score {

    private int strike;
    private int ball;
    private int total;

    public Score(int strike, int ball, int total) {
        this.strike = strike;
        this.ball = ball;
        this.total = total;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
