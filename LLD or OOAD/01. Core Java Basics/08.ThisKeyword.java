class Movie {
    private int duration;

    // Application 1: Constructor Return type
    // Application 2: Invoking Member Function
    public Movie(int duration) {
        this.setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    // Application 3: Access Data Member Properties
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Application 4: Pass Current Object as Parameter
    public void display() {
        Driver.displayDurationOutside(this);
    }

    // Application 5: Return Current Object
    public Movie join(Movie other) {
        this.duration += other.duration;
        return this;
    }
}

class Driver {
    public static void displayDurationOutside(Movie obj) {
        System.out.println("Movie Duration = " + obj.getDuration());
    }

    public static void main(String[] args) {
        Movie avengers1 = new Movie(120);
        avengers1.display();

        Movie avengers2 = new Movie(150);
        avengers1.join(avengers2);
        avengers1.display();
    }
}