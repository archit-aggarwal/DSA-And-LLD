package Memento;

import java.time.LocalTime;

public class Client {
    public static void main(String[] args) {
        Car blacklistEasy = new Car();
        blacklistEasy.setColor("red");
        blacklistEasy.setName("BMW");

        Car blacklistMedium = new Car();
        blacklistMedium.setColor("green");
        blacklistMedium.setName("Ferrari");

        Car blacklistHard = new Car();
        blacklistHard.setColor("black");
        blacklistHard.setName("Mustang");

        CarSnapshot s1 = new CarSnapshot(blacklistEasy);
        CarSnapshot s2 = new CarSnapshot(blacklistMedium);
        CarSnapshot s3 = new CarSnapshot(blacklistHard);

        TimeSeriesDB db = new TimeSeriesDB();

        db.save(s1);
        db.save(s2);
        db.save(s3);

        LocalTime time = s2.getTimestamp();
        System.out.println(db.getSnapshot(time));
    }
}
