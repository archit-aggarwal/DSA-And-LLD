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

interface Radio2 {
    String data = "Radio"; // static

    void start();
}

interface MyCar2 {
    String data = "Car"; // static

    void start();
}

class Car2 implements Radio2, MyCar2 {
    @Override
    public void start() {
        System.out.println("Radio & Car Starts Together");
    }

    public void fun() {
        System.out.println(Radio2.data);
        System.out.println(MyCar2.data);
    }
}

class Driver {
    public static void main(String[] args) {
        Car i10 = new Car();
        i10.drive();
        i10.playRadio();

        Car2 i20 = new Car2();
        i20.start();
    }
}
