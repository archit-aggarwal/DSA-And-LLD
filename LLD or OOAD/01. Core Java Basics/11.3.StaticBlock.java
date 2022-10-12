class Movie {
    // Non Static or Instance Variables
    int duration;
    String name;
    double rating;

    // Static or Class Variable
    static String language;

    public Movie(String name, int duration, double rating) {
        System.out.println("Constructor - Object Creation");
        this.name = name;
        this.duration = duration;
        this.rating = rating;
        this.language = "Hindi";
    }

    // Static Book (Runs Before Main Methox Execution: During Loading & Linking)
    static {
        System.out.println("Movie Static Block Executed");

        // Non Static Member Initialized
        language = "English";

        System.out.println(language + " OR " + Movie.language);
    }
}

class Driver {
    static int x;
    static {
        System.out.println("Driver Static block executed");
        x = 100;
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println("Main Method Started");

        // main method must be there otherwise static block will also not run,
        // Although it will run after static block of it's class

        System.out.println(x);
        System.out.println(Movie.language);

        Movie obj = new Movie("Avengers", 180, 4.5);
        System.out.println(obj.language);
    }
}