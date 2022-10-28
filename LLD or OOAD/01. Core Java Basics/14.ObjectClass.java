
// class Movie extends Object{
class Movie {
    String name = "Avengers Endgame";
    int duration = 180;
    double ratings = 4.5;

    public Movie() {
        System.out.println("Object Created - Initialization by Constructor");
    }

    public Movie(String name, int duration, double ratings) {
        this.name = name;
        this.duration = duration;
        this.ratings = ratings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object other) {
        return this.name.equals(((Movie) other).name);
    }

    @Override
    public String toString() {
        return ("Name : " + this.name + " , Duration : "
                + this.duration + " , Ratings : " + this.ratings);
    }

    @Override
    @SuppressWarnings("Deprecated")
    protected void finalize() throws Throwable {
        // Deallocation of Resources Holded by Object
        // (Database Connection, File Input/Output Streams, H/W Resources like Camera)
        // Similar to Destructors in C++
        // Automatically Called By Garbage Collector Daemon Thread handled by JVM
        System.out.println("Object Destroyed - Resources Clean Up By Finalize");
    }

    @Override
    public int hashCode() {
        // Custom Hashing Logic
        return this.name.hashCode();
    }
}

@SuppressWarnings("all")
class Solution {

    public static void getClassDemo() {
        Object obj1 = new Object();
        Class cobj1 = obj1.getClass();
        System.out.println("Object 1 : " + obj1 + " ClassName: " + cobj1.getName());

        Object obj2 = new String("Hello World");
        Class cobj2 = obj2.getClass();
        System.out.println("Object 2 : " + obj2 + " ClassName: " + cobj2.getName());

        Object obj3 = new Solution();
        Class cobj3 = obj3.getClass();
        System.out.println("Object 3 : " + obj3 + " ClassName: " + cobj3.getName());
    }

    public static void equalsDemo() {
        Movie a1 = new Movie("Avengers Endgame", 180, 4.9);

        // Different Movies
        Movie a2 = new Movie("Avengers InfinityWar", 150, 4.8);
        System.out.println(a1.equals(a2)); // False

        // Exactly Same Movie (Addresses/References are Same)
        Movie a3 = a1;
        System.out.println(a1.equals(a3)); // True (Address Comparison First)

        // Extended Version of Avengers Endgame
        Movie a4 = new Movie("Avengers Endgame", 200, 5.0);
        System.out.println(a1.equals(a4));
        // By Default (Without Overriding : Object's equals) : False
        // With Overriding and Name Comparison (Movie's equals) : True
    }

    public static void cloneDemo() throws Exception {
        Movie a1 = new Movie("Avengers Endgame", 180, 4.9);
        System.out.println(a1);

        Movie a2 = (Movie) (a1.clone());
        System.out.println(a2);

        System.out.println(a1 == a2);
        System.out.println(a1.name == a2.name);
    }

    public static void hashCodeDemo() {
        Movie a1 = new Movie("Avengers Endgame", 180, 4.9);
        System.out.println(a1.hashCode());

        Movie a2 = new Movie("Avengers InfinityWar", 150, 4.8);
        System.out.println(a2.hashCode());

        Movie a3 = a1;
        System.out.println(a3.hashCode());

        Movie a4 = new Movie("Avengers Endgame", 200, 5.0);
        System.out.println(a4.hashCode());
    }

    public static void main(String[] args) throws Exception {
        // getClassDemo();
        // equalsDemo();
        // hashCodeDemo();
        // cloneDemo();

        Object obj = new Object();
    }
}
