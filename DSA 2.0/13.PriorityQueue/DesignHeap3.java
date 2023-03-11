import java.util.*;

class Cricketer implements Comparable<Cricketer> {
    String name;
    Integer runs;
    Integer age;

    public Cricketer(String name, Integer runs, Integer age) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }

    // By Default Sorting Mechanism
    @Override
    public int compareTo(Cricketer other) {
        // return this.runs - other.runs; // Min Runs -> Higher Priority
        // return other.runs - this.runs; // Max Runs -> Higher Priority

        // Higher Runs -> Higher Priority
        if (this.runs > other.runs) {
            return -1;
        } else if (this.runs < other.runs) {
            return +1;
        }
        return 0;
    }
}

class CricketerAgeComparator implements Comparator<Cricketer> {
    // Young Age -> higher priority
    @Override
    public int compare(Cricketer t, Cricketer o) {
        if (t.age < o.age) {
            return -1;
        } else if (t.age > o.age) {
            return +1;
        } else
            return 0;
    }
}

class CricketerNameComparator implements Comparator<Cricketer> {
    // Lexicopgraphical Order
    @Override
    public int compare(Cricketer t, Cricketer o) {
        if (t.name.compareTo(o.name) < 0) {
            return -1;
        } else if (t.name.compareTo(o.name) > 0) {
            return +1;
        } else
            return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // // Min Heap
        // pq.add(30);
        // pq.add(20);
        // pq.add(50);
        // pq.add(40);
        // pq.add(10);
        // while(pq.size() > 0)
        // System.out.print(pq.remove() + " ");
        // System.out.println();

        // pq = new PriorityQueue<>(Collections.reverseOrder());
        // // Max Heap
        // pq.add(30);
        // pq.add(20);
        // pq.add(50);
        // pq.add(40);
        // pq.add(10);
        // while(pq.size() > 0)
        // System.out.print(pq.remove() + " ");
        // System.out.println();

        // PriorityQueue<String> pq2 = new
        // PriorityQueue<>(Collections.reverseOrder());
        // // Lexicographically Max Heap

        // pq2.add("Dhoni");
        // pq2.add("Virat");
        // pq2.add("Surya");
        // pq2.add("Ishan");
        // pq2.add("Rohit");

        // while(pq2.size() > 0){
        // System.out.print(pq2.remove() + " ");
        // }
        // System.out.println();

        PriorityQueue<Cricketer> pq3 = new PriorityQueue<>();
        pq3.add(new Cricketer("Rohit", 264, 34));
        pq3.add(new Cricketer("Virat", 183, 33));
        pq3.add(new Cricketer("Surya", 150, 32));
        pq3.add(new Cricketer("Dhoni", 183, 40));

        while (pq3.size() > 0) {
            System.out.println(pq3.remove().name + " ");
            // Default Sorting: Comparable: Higher Runs
        }
        System.out.println();

        PriorityQueue<Cricketer> pq4 = new PriorityQueue<>(new CricketerAgeComparator());
        pq4.add(new Cricketer("Rohit", 264, 34));
        pq4.add(new Cricketer("Virat", 183, 33));
        pq4.add(new Cricketer("Surya", 150, 32));
        pq4.add(new Cricketer("Dhoni", 183, 40));

        while (pq4.size() > 0) {
            System.out.println(pq4.remove().name + " ");
            // Default Sorting: Age Comparator: Young Age
        }
        System.out.println();

        PriorityQueue<Cricketer> pq5 = new PriorityQueue<>(new CricketerNameComparator());
        pq5.add(new Cricketer("Rohit", 264, 34));
        pq5.add(new Cricketer("Virat", 183, 33));
        pq5.add(new Cricketer("Surya", 150, 32));
        pq5.add(new Cricketer("Dhoni", 183, 40));

        while (pq5.size() > 0) {
            System.out.println(pq5.remove().name + " ");
            // Default Sorting: Age Comparator: Young Age
        }

    }

}
