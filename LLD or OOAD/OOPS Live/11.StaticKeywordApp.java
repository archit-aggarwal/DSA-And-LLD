class Movie {
    private String name;
    private String genre;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private static String language = "Hindi";
    private static int numberOfMovies = 0;

    public Movie(String name) {
        numberOfMovies++;
        this.name = name;
        // Movie.language = language;
    }

    public static void setLanguage(String language) {
        Movie.language = language;
    }

    public static String getLanguage() {
        return Movie.language;
    }

    public static int getNumberOfMovies() {
        return Movie.numberOfMovies;
    }

    public void nonStaticFun() {
        // name, genre, language, numberOfMovies
        // After Object Creation

        // Non Static Members Accessible
        System.out.println(this.name);
        System.out.println(this.genre);
        System.out.println(this.getName());

        // Static Members Accessible
        System.out.println(Movie.language);
        System.out.println(Movie.numberOfMovies);
        System.out.println(Movie.getLanguage());

    }

    public static void staticFun() {
        // name, genre, language, numberOfMovies
        // Before Object Creation

        // No this keyword inside static
        // System.out.println(this.name);
        // System.out.pritnln(this.genre);
        // System.out.println(this.getName());

        // Static Propeties Accessible
        System.out.println(Movie.language);
        System.out.println(Movie.numberOfMovies);
        System.out.println(Movie.getLanguage());
    }
}

public class App {
    public void main(String[] args) {
        // Movie m1 = new Movie("Avengers");
        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // Movie m2 = new Movie("Avengers Age of Ultron");

        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // Movie m3 = new Movie("Avengers Infinity War");

        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // Movie m4 = new Movie("Avengers End Game");
        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // Movie m5 = new Movie("Avengers Kang Dynasty");
        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // Movie m6 = new Movie("Avengers Secret Wars");

        // System.out.println(m1.numberOfMovies);
        // System.out.println(Movie.numberOfMovies);

        // m1.language = "Telugu";
        // System.out.println(m2.language);

        // Access Static Properties using ClassName
        // Even if no object is there
        // System.out.println(Movie.numberOfMovies);
        // System.out.println(Movie.language);

        Movie.staticFun();

        // Movie.setLanguage("Hindi");
        // System.out.println(Movie.getLanguage());

        Movie av = new Movie("Avengers");

        av.nonStaticFun();
        av.staticFun();

        // av.setName("Young Avengers");
        // System.out.println(av.getName());

        // av.setLanguage("English");
        // System.out.println(av.getLanguage());

    }
}
