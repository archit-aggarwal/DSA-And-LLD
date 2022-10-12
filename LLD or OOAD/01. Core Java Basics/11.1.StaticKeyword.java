class Movie {
    // Non Static or Instance Variables
    int duration;
    String name;
    double rating;

    // Static or Class Variable
    static String language = "English";

    public Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public void nonStaticFun() {
        // Access Non Static Members (Properties & Other Functions) : Allowed
        System.out.println(" Name : " + this.name + " Duration : "
                + this.duration + " Rating : " + this.rating);

        // Access Static Member (Properties & Other Functions) : Allowed
        System.out.println("Language : " + Movie.language);
        Movie.staticFun();
    }

    public static void staticFun() {
        // This Keyword is Not There Inside Static Functions
        // System.out.println(this);

        // Access Non Static Members (Properties & Other Functions) : Not Allowed
        // System.out.println(" Name : " + this.name + " Duration : " + this.duration +
        // " Rating : " + this.rating);
        // nonStaticFun();

        // Access Static Member (Properties & Other Functions) : Allowed
        System.out.println("Language : " + Movie.language);

        // Access Non Static Members Using Object Creation
        Movie obj = new Movie("Avengers", 150, 4.5);
        System.out.println(obj.name + " " + obj.duration + " " + obj.rating);
    }
}

class Driver {
    public static void staticDataMember() {
        Movie a1 = new Movie("Avengers Infinity War", 130, 4.8);
        Movie a2 = new Movie("Avengers End Game", 200, 4.9);
        Movie a3 = new Movie("Avengers Secret Wars", 170, 4.6);
        Movie a4 = new Movie("Avengers Kang Dynasty", 220, 5.0);

        // Non Static Variables
        System.out.println(a1.name + " " + a1.duration + " " + a1.rating);
        System.out.println(a2.name + " " + a2.duration + " " + a2.rating);
        System.out.println(a3.name + " " + a3.duration + " " + a3.rating);
        System.out.println(a4.name + " " + a4.duration + " " + a4.rating);

        // Static Variable or Class Variable
        System.out.print(a1.language + " ");
        System.out.print(a2.language + " ");
        System.out.print(a3.language + " ");
        System.out.print(a4.language + " ");

        // Accessing Using Class Name
        // (Static Properties Even Exist Without Single Object)
        System.out.print(Movie.language + " ");
    }

    public static void staticEvil() {
        // 1. Program LifeTime
        // 2. Global Scope
        // 3. Less Object Oriented (Do Not Require Object Creation)
        System.out.println(Movie.language);

        Movie a1 = new Movie("Avengers Infinity War", 130, 4.8);
        Movie a2 = new Movie("Avengers End Game", 200, 4.9);
        Movie a3 = new Movie("Avengers Secret Wars", 170, 4.6);
        Movie a4 = new Movie("Avengers Kang Dynasty", 220, 5.0);

        System.out.println(a1.language + " " + a2.language + " " + a3.language + " " + a4.language);

        // 4. Same Copy Shared to Every Object
        a1.language = "Hindi";
        System.out.println(a1.language + " " + a2.language + " " + a3.language + " " + a4.language);

        // 5. Not Thread Safe and Non-Serializable
    }

    public static void staticFunction() {
        // No Object Required for Calling Static Functions
        Movie.staticFun();

        Movie a1 = new Movie("Avengers Infinity War", 130, 4.8);
        // Object Required to Call Non Static Member Function
        a1.nonStaticFun();
    }

    public static void main(String[] args) {
        // staticDataMember();
        // staticEvil();
        staticFunction();
    }
}