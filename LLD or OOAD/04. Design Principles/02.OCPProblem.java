import java.util.*;

class Shape {
    private int shapeID;

    public int getShapeID() {
        return shapeID;
    }

    public void setShapeID(int shapeID) {
        this.shapeID = shapeID;
    }

}

class Rectangle extends Shape {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        super.setShapeID(1);
        this.length = length;
        this.breadth = breadth;
    }
}

class Square extends Shape {
    int side;

    public Square(int side) {
        super.setShapeID(2);
        this.side = side;
    }
}

class GraphEditor {
    public static void drawShape(Shape shape) {
        if (shape.getShapeID() == 1) {
            System.out.println("Draw a rectangle");

            int length = ((Rectangle) shape).length;
            int breadth = ((Rectangle) shape).breadth;

            System.out.println("of length = " + length);
            System.out.println(" and breadth = " + breadth);

        } else if (shape.getShapeID() == 2) {
            System.out.println("Draw a Square");

            int side = ((Square) shape).side;
            System.out.println("of side = " + side);
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Square(5));

        for (Shape shape : shapes) {
            drawShape(shape);
        }
    }
}