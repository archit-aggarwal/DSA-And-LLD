package Decorator.Solution;

public class ColorDecorator extends ShapeDecorator {
    public ColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Is Now Filled With Color");
    }
}
