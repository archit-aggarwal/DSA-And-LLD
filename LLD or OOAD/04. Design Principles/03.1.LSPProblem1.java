class Rectangle {
    protected int width;
    protected int height;

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

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}

class Factory {
    private static Rectangle getNewRectangle() {
        // it can be an object returned by some factory ...
        return new Square();
    }

    public static void main(String args[]) {
        Rectangle r = Factory.getNewRectangle();

        r.setWidth(5);
        r.setHeight(10);
        // user knows that r it's a rectangle.
        // It assumes that he's able to set the width and height as for the base class

        System.out.println(r.getArea());
        // now he's surprised to see that the area is 100 instead of 50.
    }
}



