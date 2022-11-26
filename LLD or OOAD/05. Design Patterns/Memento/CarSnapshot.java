package Memento;

import java.time.LocalTime;

// Way 1: This is not preferred
// class CarSnapshotWay1 {
//     Car car;
//     LocalTime timestamp;

//     CarSnapshotWay1(Car car) {
//         this.car = car;
//         timestamp = LocalTime.now();
//     }

//     // This should not happen for snapshot
//     public void setData() {
//         car.setColor(null);
//     }
// }

// Way 2: This is preferred
// Once snapshot is saved, data state cannot be changed
public class CarSnapshot {
    private String color, name;
    LocalTime timestamp;

    public LocalTime getTimestamp() {
        return timestamp;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    CarSnapshot(Car car) {
        this.color = car.getColor();
        this.name = car.getName();
        timestamp = LocalTime.now();
    }

    public String toString() {
        return ("Color : " + color + " , Name : " + name);
    }
}
