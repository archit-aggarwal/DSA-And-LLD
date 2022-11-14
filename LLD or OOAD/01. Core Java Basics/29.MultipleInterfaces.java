interface Radio {
    void playRadio();
}

interface MyCar extends Radio {
    void drive();
}

class Car implements MyCar {
    public void playRadio() {
        System.out.println("Radio Starts");
    }

    public void drive() {
        System.out.println("Car Starts");
    }
}

class Driver {
    public static void main(String[] args) {
        Car i10 = new Car();
        i10.drive();
        i10.playRadio();
    }
}