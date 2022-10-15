class Movie {
    static int countCreation = 0;
    static int countDeletion = 0;
    int duration;
    String name;
    double rating;

    public Movie(int duration, String name, double rating) {
        System.out.println("Memory Allocation - Initialization of Variables");
        countCreation++;
        this.duration = duration;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("Memory Deallocation");
        countDeletion++;
    }
}

class Solution {
    public static void primitiveVariables() {
        System.out.println("Primitive & Reference Variables Creation / Allocation");
        // Function Scope Local Variables:
        int a = 5;
        String str = "hello";

        for (int idx = 0; idx < 5; idx++) {
            // Index is accessible within for loop only
            System.out.print(idx + " ");
        }

        if (a % 2 == 0) {
            String even = "even";
            System.out.println(even);
        } else {
            String odd = "odd";
            System.out.println(odd);
        }

        System.out.println("Primitive & Reference Variables Deletion / Deallocation");
    }

    public static void automaticGarbageCollection() {
        Movie a1 = new Movie(180, " Endgame", 4.5);
        // Object cannot be deleted because it is referenced

        Movie a2 = new Movie(150, "Infinity War", 4.2);
        a2 = null; // 1. Nulling the Reference

        Movie a3 = new Movie(120, "Thor", 2.5);
        a3 = a1; // 2. Updating the Reference

        new Movie(120, "Secret Wars", 2.5);
        // 3. Anonymous Object

        // Garbage Collector: Memory Deallocation:
        // Automatic, Cummulative, On Memory Leak Avoidance
        for (int idx = 0; idx < 1000000; idx++) {
            new Movie(120, "Temp", 2.5);
        }

        System.out.println(Movie.countCreation + " " + Movie.countDeletion);
    }

    public static void main(String[] args) {
        automaticGarbageCollection();
    }
}