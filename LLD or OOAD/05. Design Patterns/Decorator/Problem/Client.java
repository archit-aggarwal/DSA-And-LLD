package Decorator.Problem;

public class Client {
    public static void main(String[] args) {
        Shape square = new Square();

        ShapeDecorator borderSquare = new BorderDecorator(square);
        borderSquare.draw();

        Shape rectangle = new Rectangle();

        ShapeDecorator filledRectangle = new ColorDecorator(rectangle);
        filledRectangle.draw();

        Shape circle = new Circle();

        ShapeDecorator cylinder = new Convert3DDecorator(circle);
        cylinder.draw();

        // We cannot decorate a already decorated shape
        // ShapeDecorator coloredCylinder = new ColorDecorator(cylinder);
        // ShapeDecorator borderedFilledRect = new BorderDecorator(filledRectangle);
    }
}
