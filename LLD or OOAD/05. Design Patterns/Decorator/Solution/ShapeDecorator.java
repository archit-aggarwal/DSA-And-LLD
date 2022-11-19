package Decorator.Solution;

public abstract class ShapeDecorator extends Shape {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
