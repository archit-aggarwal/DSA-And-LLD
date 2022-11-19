package Observer;

public class ScoreCardDisplay implements Observer {

    @Override
    public void update(Subject s) {
        System.out.println("Score Card Display: -- ");
        CricketData data = (CricketData) s;

        System.out.println(data.getRuns() + " / " + data.getWickets());
        System.out.println(data.getBalls());
    }
}
