class Movie {
    int duration;
    String name, genre;
    double rating;
}

class Driver {
    public static void main(String[] args) {
        Movie avengers = new Movie();
        avengers.duration = 180;
        avengers.name = "Avengers Endgame";
        avengers.rating = 4.5;
        avengers.genre = "SuperHero";

        System.out.print(avengers.name + " " + avengers.duration
                + " " + avengers.rating + " " + avengers.genre);

        // Output: Avengers Endgame 180 4.5 SuperHero
    }
}
