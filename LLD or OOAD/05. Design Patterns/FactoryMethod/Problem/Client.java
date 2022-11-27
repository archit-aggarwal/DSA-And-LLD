package FactoryMethod.Problem;

import java.util.Scanner;

public class Client {
    @SuppressWarnings("all")
    public Vehicle bookCar() {
        Scanner scn = new Scanner(System.in);
        int passengers = scn.nextInt();

        if (passengers <= 1)
            return new Bike();

        else if (passengers <= 3)
            return new Auto();

        else
            return new Car();
    }
}
