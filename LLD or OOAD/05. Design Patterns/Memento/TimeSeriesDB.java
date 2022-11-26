package Memento;

import java.time.LocalTime;
import java.util.HashMap;

// CareTaker
public class TimeSeriesDB {
    static HashMap<LocalTime, CarSnapshot> db;

    TimeSeriesDB() {
        db = new HashMap<>();
    }

    public void save(CarSnapshot car) {
        db.put(car.getTimestamp(), car);
    }

    public CarSnapshot getSnapshot(LocalTime time) {
        return db.get(time);
    }
}
