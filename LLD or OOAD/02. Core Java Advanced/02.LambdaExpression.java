
import java.util.*;

class Movie implements Comparable<Movie> {
    int duration;
    double ratings;
    String name;

    public Movie(int duration, double ratings, String name) {
        this.duration = duration;
        this.ratings = ratings;
        this.name = name;
    }

    public int compareTo(Movie other) {
        return this.duration - other.duration;
        // Default Sorting: Based on Increasing Order of Duration
    }

    public String toString() {
        return "Name : " + this.name + " of " + this.duration
                + " Minutes " + " with " + ratings + " ratings";
    }
}

class MovieDurationIncreasingComparator implements Comparator<Movie> {
    public int compare(Movie a, Movie b) {
        return a.duration - b.duration;
    }
}

class MovieDurationDecreasingComparator implements Comparator<Movie> {
    public int compare(Movie a, Movie b) {
        return b.duration - a.duration;
    }
}

class MovieLexicographicalComparator implements Comparator<Movie> {
    public int compare(Movie a, Movie b) {
        return a.name.compareTo(b.name);
    }
}

class MovieRatingIncreasingComparator implements Comparator<Movie> {
    public int compare(Movie a, Movie b) {
        if (a.ratings - b.ratings < 0)
            return -1;
        return +1;
    }
}

@FunctionalInterface
interface Operation {
    public int applyOp(int a, int b);
}

// class Sum implements Operation {
// public int applyOp(int a, int b) {
// return a + b;
// }
// }

// class Difference implements Operation {
// public int applyOp(int a, int b) {
// return a - b;
// }
// }

// class Product implements Operation {
// public int applyOp(int a, int b) {
// return a * b;
// }
// }

// class Division implements Operation {
// public int applyOp(int a, int b) {
// return a / b;
// }
// }

class LambdaExpression {
    public static void forEachMethod() {
        int[] arr = { 10, 20, 30, 40, 50 };

        // FOR EACH LOOP (Iterable)
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // FOR EACH METHOD
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.forEach((val) -> {
            if (val % 2 == 0)
                System.out.print("Even ");
            else
                System.out.print("Odd ");
        });

        al.forEach((val) -> System.out.print(val + " "));
        System.out.println();
    }

    public static void sortingAlgo() {
        int[] arr = { 50, 30, 80, 90, 10, 20, 70, 40, 100, 60 };
        Arrays.sort(arr);
        // Arrays.sort(arr, comparator); INVALID FOR PRIMITIVES

        // Increasing Order : Default
        // System.out.println(arr); // HashCode

        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();

        Integer[] copy = new Integer[arr.length];
        for (int idx = 0; idx < arr.length; idx++)
            copy[idx] = arr[idx];

        Arrays.sort(copy, (a, b) -> a - b); // Increasing Order
        for (int val : copy)
            System.out.print(val + " ");
        System.out.println();

        Arrays.sort(copy, (a, b) -> b - a); // Decreasing Order
        for (int val : copy)
            System.out.print(val + " ");
        System.out.println();

        String[] names = { "Guneet", "Vrushabh", "Chinmay", "Raghav", "Hardik", "Archit" };
        Arrays.sort(names);
        for (String val : names)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void comparableVSComparator() {
        Movie[] arr = new Movie[5];

        arr[0] = new Movie(180, 4.5, "Avengers");
        arr[1] = new Movie(150, 5.0, "Titanic");
        arr[2] = new Movie(100, 3.0, "Spiderman");
        arr[3] = new Movie(200, 5.0, "Avatar");
        arr[4] = new Movie(50, 1.0, "Thor");

        Arrays.sort(arr, new MovieDurationIncreasingComparator());

        for (Movie val : arr)
            System.out.println(val);

        System.out.println(" -----------  ");

        Arrays.sort(arr, new MovieDurationDecreasingComparator());

        for (Movie val : arr)
            System.out.println(val);
        System.out.println(" -----------  ");

        Arrays.sort(arr, new MovieRatingIncreasingComparator());

        for (Movie val : arr)
            System.out.println(val);
        System.out.println(" -----------  ");

        Arrays.sort(arr, new MovieLexicographicalComparator());

        for (Movie val : arr)
            System.out.println(val);
        System.out.println(" -----------  ");
    }

    public static void functionalInterface() {
        // Operation obj1 = new Sum();
        // System.out.println(obj1.applyOp(15, 10));

        // Operation obj2 = new Difference();
        // System.out.println(obj2.applyOp(15, 10));

        // Operation obj3 = new Product();
        // System.out.println(obj3.applyOp(15, 10));

        // Operation obj4 = new Division();
        // System.out.println(obj4.applyOp(15, 10));

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        System.out.println(sum.applyOp(15, 10));
        System.out.println(diff.applyOp(15, 10));
        System.out.println(prod.applyOp(15, 10));
        System.out.println(div.applyOp(15, 10));

    }

    public static void main(String[] args) {
        functionalInterface();
    }
}
