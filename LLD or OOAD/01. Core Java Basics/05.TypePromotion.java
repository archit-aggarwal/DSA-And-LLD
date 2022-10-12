class Movie {
    int duration;
    String name, genre;
    double rating;

    public Movie(int duration) {
        this.duration = duration;
    }

}

class Driver {
    public static void main(String[] args) {
        // NO EXACT MATCH FOUND: Movie(char)
        // Char Type Promoted to Integer (Upcasting - IMPLICIT)

        Movie avengers1 = new Movie('A');
        System.out.println(avengers1.duration);

        // COMPILATION ERROR: Long Demoted to Integer
        // (Downcasting - IMPLICITLY NOT POSSIBLE)
        // Movie avengers2 = new Movie(180l);
        // System.out.println(avengers2.duration);

        // NO EXACT MATCH FOUND: Movie(long)
        // Long Type Demoted to Integer (Downcasting - EXPLICIT)

        Movie avengers2 = new Movie((int) 180l);
        System.out.println(avengers2.duration);
    }
}
