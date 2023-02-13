import java.time.LocalTime;

public class Ticket {
    Vehicle vehicle;
    Slot slot;
    LocalTime entryTime;

    public Ticket(Vehicle vehicle, Slot slot) {
        this.vehicle = vehicle;
        this.slot = slot;
        this.entryTime = LocalTime.now();
    }

    @Override
    public String toString() {
        return slot.slotNo + "-" + vehicle.numberPlate + "-" + entryTime;
    }
}
