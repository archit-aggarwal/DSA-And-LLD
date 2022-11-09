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

class Square {
    private Rectangle rect = new Rectangle();

    public void setSide(int side) {
        rect.setHeight(side);
        rect.setWidth(side);
    }

    public int getWidth() {
        return rect.getWidth();
    }

    public int getHeight() {
        return rect.getHeight();
    }

    public int getArea() {
        return this.getWidth() * this.getHeight();
    }
}

class Factory {
    public static void main(String args[]) {
        Square sq = new Square();
        sq.setSide(5);

        System.out.println(sq.getArea());
    }
}
