interface Shape2d {
    public double area();
}

interface Shape3d {
    public double volume();
}

class Cuboid implements Shape2d, Shape3d {
    int length = 10, breadth = 20, height = 30;

    @Override
    public double area() {
        return 2 * (length * breadth
                + breadth * height + length * height);
    }

    @Override
    public double volume() {
        return length * breadth * height;
    }

}

class Circle implements Shape2d {
    int radius = 7;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}

class Manager {
    public static void main(String[] args) {
        Cuboid box = new Cuboid();
        System.out.println(box.area());
        System.out.println(box.volume());

        Circle circle = new Circle();
        System.out.println(circle.area());
    }
}
