package Prototype;

public class NPC implements Cloneable {
    String height, weight, gender;

    // for 1st prototype
    NPC(String height, String weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return (height + ", " + weight + ", " + gender);
    }
}

