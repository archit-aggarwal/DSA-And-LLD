public class Cuboid {
    int length;
    int breadth;
    int height;

    // Parameterized Constructor: Cuboid
    Cuboid(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Default Explicit Constructor: Unit Cube
    Cuboid() {
        // System.out.println("Hello World");
        this(1);
        // this.length = 1;
        // this.breadth = 1;
        // this.height = 1;
    }

    // Parameterized Constructor: Cube
    Cuboid(int side) {
        this(side, side, side);
        // this.length = side;
        // this.breadth = side;
        // this.height = side;
    }

    // Parameterized Constructor: Rectangle
    Cuboid(int length, int breadth) {
        this(length, breadth, 0);
        // this.length = length;
        // this.breadth = breadth;
        // this.height = 0;
    }

    // Not Modifying the original (c1 & c2) cuboids
    // Cuboid join(Cuboid other) {
    // Cuboid res = new Cuboid();
    // res.length = this.length + other.length;
    // res.breadth = this.breadth + other.breadth;
    // res.height = this.height + other.height;
    // return res;
    // }

    // // Modifying the original (c1) cuboid
    // Cuboid merge(Cuboid other) {
    // this.length += other.length;
    // this.breadth += other.breadth;
    // this.height += other.height;
    // App.storeCuboid(this); // Pass This as Paramter
    // return this; // Return This
    // }
}

class App {
    public static void storeCuboid(Cuboid c) {
        System.out.println("Cuboid is saved in Cloud"); // c1 (this keyword)
    }

    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(3, 4, 5);

        // Cuboid c2 = new Cuboid(10, 12, 15);

        // Cuboid res = c1.join(c2);
        // System.out.println(res.length + " " + res.breadth + " " + res.height);

        // c1 = c1.merge(c2);
        // System.out.println(c1.length + " " + c1.breadth + " " + c1.height);

    }
}
