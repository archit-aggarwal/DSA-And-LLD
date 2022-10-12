import java.util.ArrayList;

class Movie {
    int duration;
    String name, genre;
    double rating;
    ArrayList<String> languages;

    public Movie(String name, int duration, double rating, String genre) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
        this.languages = new ArrayList<>();
    }

    // COMPLETE DEEP COPY
    public Movie(Movie other) {
        this.name = other.name;
        this.duration = other.duration;
        this.genre = other.genre;
        this.rating = other.rating;
        this.languages = new ArrayList<>();
        for (String language : other.languages) {
            this.languages.add(language);
        }
    }
}

class Driver {
    public static void main(String[] args) {

        Movie avengers = new Movie("Avengers Endgame", 180, 4.5, "SuperHero");
        avengers.languages.add("English");

        System.out.println(avengers.name + " " + avengers.duration
                + " " + avengers.rating + " " + avengers.genre);
        System.out.println(avengers.languages);

        // PROPER DEEP COPY

        Movie deepCopy = new Movie(avengers);
        System.out.println(deepCopy.name + " " + deepCopy.duration
                + " " + deepCopy.rating + " " + deepCopy.genre);
        System.out.println(deepCopy.languages);

        avengers.languages.add("Hindi");
        deepCopy.languages.add("Telugu");

        System.out.println(deepCopy.languages);
        System.out.println(avengers.languages);
    }
}
