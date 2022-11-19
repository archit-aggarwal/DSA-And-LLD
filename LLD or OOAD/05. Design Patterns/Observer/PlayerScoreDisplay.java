package Observer;

public class PlayerScoreDisplay implements Observer {

    @Override
    public void update(Subject s) {
        System.out.println("Player Score Display: -- ");
        CricketData data = (CricketData) s;
        System.out.println(data.getRuns() + " / " + data.getWickets());
    }
}
