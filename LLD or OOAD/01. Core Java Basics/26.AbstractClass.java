abstract class Car {
    String color;

    public Car() {
        color = "White";
    }

    public Car(String color) {
        this.color = color;
        // This keyword is there in abstract class
    }

    abstract void refuel();

    // static Abstract,
    // private Abstract,
    // final Abstract
    // These are invalid combinations

    abstract void engine();

    void drive() {
        System.out.println("Drive Car");
    }
}

class PetrolCar extends Car {
    String fuel;

    PetrolCar() {
        super();
        this.fuel = "Petrol";
    }

    PetrolCar(String fuel, String color) {
        super(color); // constructor: Abstract Class
        this.fuel = fuel;
    }

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

        c1.drive();
        c2.drive();

        PetrolCar obj3 = new PetrolCar("petrol - Xtra", "Black");
        System.out.println(obj3.color);
        System.out.println(obj3.fuel);
    }
}