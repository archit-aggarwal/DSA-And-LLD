interface Shape {
    public double area();

    public double volume();
}

class Cuboid implements Shape {
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

class Circle implements Shape {
    int radius = 7;

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Manager {
    public static void main(String[] args) {
        Shape box = new Cuboid();
        System.out.println(box.area());
        System.out.println(box.volume());

        Shape circle = new Circle();
        System.out.println(circle.area());
        System.out.println(circle.volume());
    }
}
