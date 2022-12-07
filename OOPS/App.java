class Movie {
    String name;
    static String language = "Hindi";
    static int numberOfMovies = 0;

    public Movie(String name) {
        this.numberOfMovies++;
        this.name = name;
    }
}

public class App {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers");
        System.out.println(m1.numberOfMovies);

        Movie m2 = new Movie("Avengers Age of Ultron");
        
        System.out.println(m1.numberOfMovies);
        
        Movie m3 = new Movie("Avengers Infinity War");

        System.out.println(m1.numberOfMovies);
        
        Movie m4 = new Movie("Avengers End Game");
        System.out.println(m1.numberOfMovies);
        
        Movie m5 = new Movie("Avengers Kang Dynasty");
        System.out.println(m1.numberOfMovies);
        
        Movie m6 = new Movie("Avengers Secret Wars");

        System.out.println(m1.numberOfMovies);

        m1.language = "Telugu";
        System.out.println(m2.language);
    }
}
