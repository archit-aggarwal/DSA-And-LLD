package FactoryMethod.Solution;

public class BikeFactory extends VehicleFactory{

    @Override
    Vehicle getVehicle() {
        // TODO Auto-generated method stub
        return new Bike();
    }
    
}
