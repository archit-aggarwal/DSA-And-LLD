class Movie {
    String name;
    int duration;
    double rating;

    Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null)
            return false;

        return this.name.equals(((Movie) other).name);
    }
}

class Driver {
    public static void main(String[] args) {
        Movie m1 = new Movie("Endgame", 180, 4.9);
        Movie m2 = m1;
        System.out.println(m1.equals(m2)); // Object's are same: true

        Movie m3 = new Movie("Infinity War", 150, 4.7);
        System.out.println(m1.equals(m3));

        Movie m4 = new Movie("Endgame", 200, 5.0);
        System.out.println(m1.equals(m4));

        System.out.println(m1.equals(m1)); // Reflexive
        System.out.println(m2.equals(m1)); // Symmetric
        System.out.println(m2.equals(m4)); // Transitive
        System.out.println(m1.equals(null)); // False
    }
}