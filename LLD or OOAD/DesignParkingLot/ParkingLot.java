import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class ParkingLot {
    List<Slot> bikes, cars, trucks;

    ParkingLot() {
        bikes = new ArrayList<>();
        cars = new ArrayList<>();
        trucks = new ArrayList<>();
    }

    void initSlots() {
        for (int i = 1; i <= 8; i++)
            bikes.add(new Slot("B" + i));
        for (int i = 1; i <= 5; i++)
            cars.add(new Slot("C" + i));
        for (int i = 1; i <= 4; i++)
            trucks.add(new Slot("T" + i));
    }

    Ticket park(Vehicle vehicle) {
        Slot freeSlot = null;
        if (vehicle instanceof Bike) {
            freeSlot = findSlot("BIKE");
        } else if (vehicle instanceof Car) {
            freeSlot = findSlot("CAR");
        } else if (vehicle instanceof Truck) {
            freeSlot = findSlot("TRUCK");
        }

        if (freeSlot == null)
            return null;
        return freeSlot.parkVehicle(vehicle);
    }

    Slot findSlot(String type) {
        if (type.equals("BIKE")) {
            for (Slot slot : bikes) {
                if (slot.isEmpty == true) {
                    return slot;
                }
            }
            return null;
        } else if (type.equals("CAR")) {
            for (Slot slot : cars) {
                if (slot.isEmpty == true) {
                    return slot;
                }
            }
            return null;
        } else if (type.equals("TRUCK")) {
            for (Slot slot : trucks) {
                if (slot.isEmpty == true) {
                    return slot;
                }
            }
        }
        return null;
    }

    double unpark(Ticket ticket) {
        ticket.slot.unparkVehicle();
        LocalTime exitTime = LocalTime.now();
        return getCharge(ticket.entryTime, exitTime);
    }

    double getCharge(LocalTime entry, LocalTime exit) {
        return (exit.getSecond() - entry.getSecond()) * 10;
    }
}
