public class Operation {
    public int sum(int a, int b) {
        System.out.println("Two Integers Input");
        return a + b;
    }

    public long sum(long a, long b) {
        System.out.println("Two Long Input");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("Three Integers Input");
        return a + b + c;
    }

    public String sum(String a, String b) {
        System.out.println("String Concatenation");
        return a + b;
    }

    public String sum(String a, int b) {
        System.out.println("String + Integer Concetation");
        return a + b;
    }

    public double sum(double a, double b) {
        System.out.println("Double/Float Addition");
        return a + b;
    }

    public int multiply(int a, int b, int c, int d) {
        return a * b;
    }

    public static void main(String[] args) {
        Operation obj = new Operation();
        // System.out.println(obj.sum(4, 5));
        // System.out.println(obj.sum(99999999999l, 5));
        // System.out.println(obj.sum('A', 'B'));
        // System.out.println(obj.sum("Archit", 10));
        // System.out.println(obj.sum("Archit", null));
        obj.sum("Archit", 100);
    }
}
