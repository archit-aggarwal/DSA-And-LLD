package Decorator.Problem;

public abstract class ShapeDecorator {
    Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();
}
