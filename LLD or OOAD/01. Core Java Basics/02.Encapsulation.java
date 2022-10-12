class Movie {
    // Private Properties (Data Members or Instance Variables)
    private int duration;
    private String name, genre;
    private double rating;

    // Public Getters and Setters (Behavior or Member Functions or Methods)
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

        // ERROR: CANNOT ACCESS PRIVATE PROPERTIES

        // avengers.duration = 180;
        // avengers.name = "Avengers Endgame";
        // avengers.rating = 4.5;
        // avengers.genre = "SuperHero";
        // System.out.print(avengers.name + " " + avengers.duration
        // + " " + avengers.rating + " " + avengers.genre);

        avengers.setDuration(180);
        avengers.setName("Avengers Endgame");
        avengers.setRating(4.5);
        avengers.setGenre("SuperHero");
        System.out.print(avengers.getName() + " " + avengers.getDuration()
                + " " + avengers.getRating() + " " + avengers.getGenre());
    }
}
