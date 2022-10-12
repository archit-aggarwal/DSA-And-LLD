class Cuboid {
    int length, breadth, height;

    Cuboid() {
        // this.length = 1;
        // this.breadth = 1;
        // this.height = 1;
        this(1);
    }

    Cuboid(int side) {
        // this.length = side;
        // this.breadth = side;
        // this.height = side;
        this(side, side, side);
    }

    Cuboid(int length, int breadth) {
        // this.length = length;
        // this.breadth = breadth;
        // this.height = 1;
        this(length, breadth, 1);
    }

    Cuboid(int length, int height, int breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }
}

class Driver {
    public static void main(String[] args) {
        Cuboid obj1 = new Cuboid();
        Cuboid obj2 = new Cuboid(5);
        Cuboid obj3 = new Cuboid(5, 10);
        Cuboid obj4 = new Cuboid(5, 10, 15);

        System.out.println(obj1.length + " " + obj1.breadth + " " + obj1.height);
        System.out.println(obj2.length + " " + obj2.breadth + " " + obj2.height);
        System.out.println(obj3.length + " " + obj3.breadth + " " + obj3.height);
        System.out.println(obj4.length + " " + obj4.breadth + " " + obj4.height);

    }
}