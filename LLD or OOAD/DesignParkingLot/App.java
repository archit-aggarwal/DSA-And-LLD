public class App {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();
        lot.initSlots();

        Car c1 = new Car("DL001", "Black");
        System.out.println(lot.park(c1));

        Car c2 = new Car("DL002", "Red");
        System.out.println(lot.park(c2));

        Car c3 = new Car("DL003", "Blue");
        System.out.println(lot.park(c3));

        Car c4 = new Car("DL004", "Black");
        System.out.println(lot.park(c4));

        Car c5 = new Car("DL005", "Black");
        System.out.println(lot.park(c5));

        Car c6 = new Car("DL006", "Black");
        System.out.println(lot.park(c5));

        

    }
}
