public class App {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        lot.initSlots();

        Car c1 = new Car("DL001", "Black");
        Ticket t1 = lot.park(c1);
        System.out.println(t1);

        Car c2 = new Car("DL002", "Red");
        System.out.println(lot.park(c2));

        Car c3 = new Car("DL003", "Blue");
        System.out.println(lot.park(c3));

        Car c4 = new Car("DL004", "Black");
        Ticket t4 = lot.park(c4);
        System.out.println(t4);

        Car c5 = new Car("DL005", "Black");
        System.out.println(lot.park(c5));

        Car c6 = new Car("DL006", "Black");
        System.out.println(lot.park(c6));

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }

        double charge = lot.unpark(t4);
        System.out.println(charge);

        System.out.println(lot.park(c6));

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        charge = lot.unpark(t1);
        System.out.println(charge);
    }
}
