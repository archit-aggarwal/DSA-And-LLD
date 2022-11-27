package FactoryMethod.Solution;

import java.util.Scanner;

public class Client {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        VehicleFactory factory;
        int people = scn.nextInt();

        if (people == 1) {
            factory = new BikeFactory();
        } else if (people <= 3) {
            factory = new AutoFactory();
        } else {
            factory = new CarFactory();
        }

        factory.bookRide();
    }
}
