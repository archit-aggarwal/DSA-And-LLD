package FactoryMethod.Solution;

public abstract class VehicleFactory {
    void bookRide() {
        System.out.println("Enter Source & Destination");
        Vehicle v = getVehicle();
        v.showVehicle();
        System.out.println("Proceed to Payment");
    }

    abstract Vehicle getVehicle();
}
