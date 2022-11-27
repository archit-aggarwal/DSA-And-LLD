package FactoryMethod.Solution;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle getVehicle() {
        // TODO Auto-generated method stub
        return new Car();
    }

}
