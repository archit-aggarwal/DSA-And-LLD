class Movie {
    private int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
    }

    String name, genre;
    double rating;

    public Movie(int newDuration) {
        duration = newDuration;
    }
}

class Driver {
    public static void swap1(Movie a1, Movie a2) {
        Movie a3 = a1;
        a1 = a2;
        a2 = a3;
    }

    public static void swap2(Movie a1, Movie a2) {
        Movie a3 = new Movie(a1.getDuration());
        a1 = a2;
        a2 = a3;
    }

    public static void swap3(Movie a1, Movie a2) {
        Movie a3 = a1;
        a1.setDuration(a2.getDuration());
        a2.setDuration(a3.getDuration());

    }

    public static void swap4(Movie a1, Movie a2) {
        Movie a3 = new Movie(a1.getDuration());
        a1.setDuration(a2.getDuration());
        a2.setDuration(a3.getDuration());
    }

    public static void main(String[] args) {
        Movie avengers1 = new Movie(120);
        System.out.println(avengers1.getDuration());

        Movie avengers2 = new Movie(150);
        System.out.println(avengers2.getDuration());

        // swap1(avengers1, avengers2);
        // swap2(avengers1, avengers2);
        // swap3(avengers1, avengers2);
        swap4(avengers1, avengers2);

        System.out.println(avengers1.getDuration());
        System.out.println(avengers2.getDuration());
    }
}