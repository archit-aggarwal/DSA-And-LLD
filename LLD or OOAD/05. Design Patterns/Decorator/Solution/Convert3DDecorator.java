package Decorator.Solution;

public class Convert3DDecorator extends ShapeDecorator {
    public Convert3DDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Is Now 3D");
    }
}
