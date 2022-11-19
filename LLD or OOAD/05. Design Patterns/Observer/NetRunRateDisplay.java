package Observer;

public class NetRunRateDisplay implements Observer {

    @Override
    public void update(Subject s) {
        System.out.println("Net Run Rate Display: -- ");
        CricketData data = (CricketData) s;
        System.out.println((data.getRuns() / data.getBalls()) * 6);
    }
}
