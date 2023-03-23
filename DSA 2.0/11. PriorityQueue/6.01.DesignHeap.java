import java.io.*;
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

    @Override
    public int compareTo(Cricketer other) {
        // more runs -> higher priority
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

class PriorityQueue<T> {
    ArrayList<T> data = new ArrayList<>();
    Comparator comparator;

    public PriorityQueue() {
    }

    public PriorityQueue(Comparator comparator) {
        this.comparator = comparator;
    }

    public PriorityQueue(T[] arr) {
        for (T val : arr)
            data.add(val); // Complete Binary Tree
        for (int idx = data.size() - 1; idx >= 0; idx--)
            downheapify(idx); // Heap Order Property
    }

    public void add(T val) {
        data.add(val);
        upheapify(data.size() - 1);
    }

    boolean swap(int i1, int i2) {
        T p2 = data.get(i2);
        T p1 = data.get(i1);

        if (comparator == null) {
            return ((Comparable) p1).compareTo((Comparable) p2) < 0;
        }
        return comparator.compare(p1, p2) < 0;
    }

    void upheapify(int idx) {
        if (idx == 0)
            return;

        int par = (idx - 1) / 2;

        if (swap(idx, par) == false)
            return;

        Collections.swap(data, idx, par);
        upheapify(par);
    }

    public void downheapify(int idx) {
        int l = 2 * idx + 1;
        int r = 2 * idx + 2;
        int min = idx;

        if (l < data.size()) {
            if (swap(l, min) == true)
                min = l;
        }

        if (r < data.size()) {
            if (swap(r, min) == true)
                min = r;
        }

        if (min == idx)
            return;
        Collections.swap(data, idx, min);
        downheapify(min);
    }

    public T remove() {
        if (data.size() == 0) {
            System.out.println("Underflow");
            return null;
        }

        T val = data.get(0);
        Collections.swap(data, 0, data.size() - 1);
        data.remove(data.size() - 1);
        downheapify(0);
        return val;
    }

    public T peek() {
        if (data.size() == 0) {
            System.out.println("Underflow");
            return null;
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Cricketer> pq3 = new PriorityQueue<>();
        pq3.add(new Cricketer("Rohit", 264, 34));
        pq3.add(new Cricketer("Virat", 183, 33));
        pq3.add(new Cricketer("Surya", 150, 32));
        pq3.add(new Cricketer("Dhoni", 183, 40));
        while (pq3.size() > 0) {
            System.out.print(pq3.remove().name + " ");
            // Default Sorting: Comparable: Higher Runs
        }
        System.out.println();

        PriorityQueue<Cricketer> pq4 = new PriorityQueue<>(new CricketerAgeComparator());
        
        pq4.add(new Cricketer("Rohit", 264, 34));
        pq4.add(new Cricketer("Virat", 183, 33));
        pq4.add(new Cricketer("Surya", 150, 32));
        pq4.add(new Cricketer("Dhoni", 183, 40));
        while (pq4.size() > 0) {
            System.out.print(pq4.remove().name + " ");
            // Default Sorting: Age Comparator: Young Age
        }
        System.out.println();




        PriorityQueue<Cricketer> pq5 = new PriorityQueue<>(new CricketerNameComparator());
        pq5.add(new Cricketer("Rohit", 264, 34));
        pq5.add(new Cricketer("Virat", 183, 33));
        pq5.add(new Cricketer("Surya", 150, 32));
        pq5.add(new Cricketer("Dhoni", 183, 40));
        while (pq5.size() > 0) {
            System.out.print(pq5.remove().name + " ");
            // Default Sorting: Age Comparator: Young Age
        }
    }

}