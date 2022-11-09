abstract class Shape {
    public abstract int getArea();
}

class Rectangle extends Shape {
    private int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return getHeight() * getWidth();
    }
}

class Square extends Shape {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return getSide() * getSide();
    }
}

class Factory {
    private static Shape getShape() {
        // it can be an object returned by some factory ...
        return new Square();
    }

    public static void main(String args[]) {
        Shape r = Factory.getShape();

        if (r instanceof Rectangle) {
            ((Rectangle) r).setWidth(5);
            ((Rectangle) r).setHeight(10);
        } else if (r instanceof Square) {
            ((Square) r).setSide(15);
        }

        System.out.println(r.getArea());
    }
}

