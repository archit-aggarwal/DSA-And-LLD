import java.util.*;

abstract class Shape {
    public abstract void drawShape();
}

class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw a rectangle");
        System.out.println("of length = " + length);
        System.out.println(" and breadth = " + breadth);
    }
}

class Square extends Shape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void drawShape() {
        System.out.println("Draw a Square");
        System.out.println("of side = " + side);
    }
}

class GraphEditor {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Square(5));

        for (Shape shape : shapes) {
            shape.drawShape();
        }
    }
}