class Movie {
    private int duration;
    private String name, genre;
    private double rating;

    // DEFAULT IMPLICIT CONSTRUCTOR: NO PARAMETER NO BODY
    // public Movie(){}

    // Constructor: Explicit Default Constructor
    public Movie() {
        duration = 180;
        name = "Avengers Endgame";
        rating = 4.5;
        genre = "SuperHero";
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

class Driver {
    public static void main(String[] args) {
        Movie avengers = new Movie();

        System.out.print(avengers.getName() + " " + avengers.getDuration()
                + " " + avengers.getRating() + " " + avengers.getGenre());
    }
}
