abstract class Car {
    String color = "Red";

    abstract void refuel();

    abstract void engine();
}

class PetrolCar extends Car {
    @Override
    void refuel() {
        System.out.println("Petrol Refill");
    }

    @Override
    void engine() {
        System.out.println("It has a Petrol Engine");
    }
}

class EVCar extends Car {
    @Override
    void refuel() {
        System.out.println("Battery recharge");
    }

    @Override
    void engine() {
        System.out.println("Spark/Electricity based engine");
    }
}

class Driver {
    public static void main(String[] args) {
        // Car obj = new Car();
        // We cannot create objects of Car (abstract class)

        PetrolCar obj = new PetrolCar();
        obj.refuel();
        obj.engine();

        EVCar obj2 = new EVCar();
        obj2.refuel();
        obj2.engine();

        // Polymorphism
        Car c1 = new PetrolCar();
        c1.refuel();
        System.out.println(c1.color);

        Car c2 = new EVCar();
        c2.refuel();
        System.out.println(c2.color);
    }
}