public class Slot {
    String slotNo;
    Vehicle vehicle;
    boolean isEmpty = true;

    public Slot(String slotNo) {
        this.slotNo = slotNo;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        isEmpty = false;
        this.vehicle = vehicle;
        return new Ticket(vehicle, this);
    }

    public void unparkVehicle() {
        isEmpty = true;
        this.vehicle = null;
    }
}
