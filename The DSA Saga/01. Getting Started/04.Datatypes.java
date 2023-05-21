// https://practice.geeksforgeeks.org/problems/data-types-java/1

// Time: O(1) - Space O(1)

class Geeks {

    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d) {

        double p = c / b;
        double q = b / a;
        double r = c / a;
        double m = r + l;
        int s = a / d;

        // Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }
}