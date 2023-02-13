public abstract class Vehicle {
    String numberPlate;
    String color;

    public Vehicle(String numberPlate, String color) {
        this.numberPlate = numberPlate;
        this.color = color;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
