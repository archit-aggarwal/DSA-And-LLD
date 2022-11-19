package Observer;

public class Client {
    public static void main(String[] args) {
        CricketData data = new CricketData();
        data.setBalls(1);
        // no observers

        ScoreCardDisplay score = new ScoreCardDisplay();
        NetRunRateDisplay runrate = new NetRunRateDisplay();
        PlayerScoreDisplay player = new PlayerScoreDisplay();

        // register
        data.addObserver(score);
        data.addObserver(runrate);
        data.addObserver(player);

        data.setBalls(2);
        data.setRuns(4);

        data.setBalls(3);
        data.setWickets(1);

        // unregister
        data.removeObserver(player);

        data.setBalls(3);
        data.setRuns(2);
    }
}
