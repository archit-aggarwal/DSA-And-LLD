import java.util.*;

class Main {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
        a1.add(20);
        a1.add(40);
        a1.add(10);
        a1.add(50);
        a1.add(30);

        for (Integer val : a1) {
            System.out.print(val + " ");
        }
        System.out.println();
        List<Integer> a2 = new LinkedList<>();
        a2.add(20);
        a2.add(40);
        a2.add(10);
        a2.add(50);
        a2.add(30);

        for (Integer val : a2) {
            System.out.print(val + " ");
        }
        System.out.println();

        List<Integer> a3 = new Stack<>();
        a3.add(20);
        a3.add(40);
        a3.add(10);
        a3.add(50);
        a3.add(30);

        for (Integer val : a3) {
            System.out.print(val + " ");
        }

        System.out.println();

        a1.forEach((data) -> System.out.print(data + " "));
        System.out.println();

        Set<Integer> s1 = new HashSet<>();
        s1.add(30); // O(1) Average, O(N) Worst Case *
        s1.add(10);
        s1.add(40);
        s1.add(50);
        s1.add(20);
        s1.add(10); // Ignored

        for (Integer val : s1) {
            System.out.print(val + " ");
            // Random Order
        }
        System.out.println();

        Set<Integer> s3 = new TreeSet<>();
        s3.add(30); // Self Balancing Binary Search Tree
        s3.add(10); // O(log N) Average & Worst Case
        s3.add(40);
        s3.add(50);
        s3.add(20);
        s3.add(10); // Ignored

        for (Integer val : s3) {
            System.out.print(val + " ");
            // Sorted Order: inorder traversal
        }
        System.out.println();

        Queue<Integer> q = new PriorityQueue<>();
        // Duplicates Allowed
        q.add(20);
        q.add(40);
        q.add(10);
        q.add(30);
        q.add(10);
        q.add(30);

        // Heap Sort: O(N Log N): Average & Worst Case
        while (q.size() > 0) {
            System.out.print(q.remove() + " ");
        }
    }
}