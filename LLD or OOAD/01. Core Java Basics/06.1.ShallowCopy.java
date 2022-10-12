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

    // PARTIAL DEEP COPY CONSTRUCTOR
    public Movie(Movie other) {
        this.name = other.name;
        this.duration = other.duration;
        this.genre = other.genre;
        this.rating = other.rating;
        this.languages = other.languages;
    }
}

class Driver {
    public static void main(String[] args) {

        Movie avengers = new Movie("Avengers Endgame", 180,
                4.5, "SuperHero");
        avengers.languages.add("English");

        System.out.println(avengers.name + " " + avengers.duration
                + " " + avengers.rating + " " + avengers.genre);
        System.out.println(avengers.languages);

        // SHALLOW COPY

        Movie shallowCopy = avengers;

        avengers.languages.add("Tamil");
        shallowCopy.languages.add("Malayanam");

        System.out.println(shallowCopy.languages);
        System.out.println(avengers.languages);

        // PARTIAL DEEP COPY

        Movie partialDeep = new Movie(avengers);
        System.out.println(partialDeep.name + " " + partialDeep.duration
                + " " + partialDeep.rating + " " + partialDeep.genre);
        System.out.println(partialDeep.languages);

        avengers.languages.add("Hindi");
        partialDeep.languages.add("Telugu");

        System.out.println(partialDeep.languages);
        System.out.println(avengers.languages);
    }
}
