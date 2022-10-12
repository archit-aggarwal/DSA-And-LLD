class Movie {
    int duration;
    String name, genre;
    double rating;

    // TYPE OF PARAMETERS ARE CHANGED
    public Movie(String name) {
        this.name = name;
    }

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(double rating) {
        this.rating = rating;
    }

    // ERROR: AMBIGUITY
    // public Movie(String genre) {
    // this.genre = genre;
    // }

    // ORDER OF PARAMETERS ARE CHANGED
    public Movie(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public Movie(int duration, String name) {
        this.name = name;
        this.duration = duration;
    }

    // NUMBER OF PARAMETERS ARE CHANGED
    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public Movie(String name, int duration, double rating, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }
}

class Driver {
    public static void main(String[] args) {
        // ERROR: NO DEFAULT IMPLICIT CONSTRUCTOR
        // Movie avengers = new Movie();

        Movie avengers1 = new Movie("Avengers Endgame");
        System.out.println(avengers1.name + " " + avengers1.duration
                + " " + avengers1.rating + " " + avengers1.genre);

        Movie avengers2 = new Movie(180);
        System.out.println(avengers2.name + " " + avengers2.duration
                + " " + avengers2.rating + " " + avengers2.genre);

        Movie avengers3 = new Movie(4.5);
        System.out.println(avengers3.name + " " + avengers3.duration
                + " " + avengers3.rating + " " + avengers3.genre);

        Movie avengers4 = new Movie("Avengers Endgame", 180);
        System.out.println(avengers4.name + " " + avengers4.duration
                + " " + avengers4.rating + " " + avengers4.genre);

        Movie avengers5 = new Movie("Avengers Endgame", 180, 4.5, "SuperHero");
        System.out.println(avengers5.name + " " + avengers5.duration
                + " " + avengers5.rating + " " + avengers5.genre);
    }
}
