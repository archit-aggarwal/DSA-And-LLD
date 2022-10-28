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

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " Duration: " + this.duration + " Rating : " + this.rating;
    }
}

class Driver {
    public static void main(String[] args) {
        Movie m1 = new Movie("Endgame", 180, 4.9);
        Class c1 = m1.getClass();

        System.out.println(c1.getName());

        String str = new String("Hello");
        Class c2 = str.getClass();

        System.out.println(c2.getName());

        Movie m2 = m1;
        Movie m3 = new Movie("Infinity War", 150, 4.7);
        Movie m4 = new Movie("Endgame", 200, 5.0);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m3.hashCode());
        System.out.println(m4.hashCode());

        m1.name = "Avengers";
        System.out.println(m1.hashCode());

        System.out.println(m1);
        System.out.println(m1.toString());
    }
}
