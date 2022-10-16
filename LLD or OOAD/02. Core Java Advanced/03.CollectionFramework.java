
import java.util.*;

class Student {
    int marks;
    int rollNo;
    String name;

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNo);
    }

    @Override
    public boolean equals(Object other) {
        if (this.hashCode() == other.hashCode())
            return true;
        return false;
    }
}

class Collections {
    public static void collectionsAndMap() {
        List<Integer> res = new ArrayList<>();
        // Parent Ref -> Child Obj

        List<Integer> res4 = new LinkedList<>();
        List<Integer> res5 = new Vector<>();
        List<Integer> res6 = new Stack<>();

        ArrayList<Integer> res2 = new ArrayList<>();
        // Child Ref -> Child Obj

        // Array of References
        List<List<Integer>> res3 = new ArrayList<>();

        res3.add(res);
        res3.add(res2);

        // List<Integer> res3 = new List<>(); // interface cannot be instantiated

        Set<Integer> s1 = new HashSet<>();
        s1.add(30);
        s1.add(10);
        s1.add(40);
        s1.add(50);
        s1.add(20);
        s1.add(10); // Ignored

        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(30);
        s2.add(10);
        s2.add(40);
        s2.add(50);
        s2.add(20);
        s2.add(10); // Ignored

        Set<Integer> s3 = new TreeSet<>();
        s3.add(30);
        s3.add(10);
        s3.add(40);
        s3.add(50);
        s3.add(20);
        s3.add(10); // Ignored

        for (Integer a : s1)
            System.out.print(a + " ");
        System.out.println();

        for (Integer a : s2)
            System.out.print(a + " ");
        System.out.println();

        for (Integer a : s3)
            System.out.print(a + " ");
        System.out.println();

        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(30);
        q1.add(10);
        q1.add(10);
        q1.add(20);
        q1.add(40);
        q1.remove();

        System.out.println(q1);

        Deque<Integer> q2 = new ArrayDeque<>();
        q2.addFirst(30);
        q2.addLast(50);
        q2.addLast(10);
        q2.add(20);
        q2.add(30);
        q2.remove();
        q2.removeFirst();
        q2.removeLast();

        System.out.println(q2);

        Queue<Integer> q3 = new PriorityQueue<>();
        q3.add(30);
        q3.add(50);
        q3.add(10);
        q3.add(20);
        q3.add(60);
        q3.add(70);
        q3.add(90);
        q3.add(20);
        q3.add(30);

        System.out.println(q3); // Not Necessarily Sorted (Heap Order Property)

        // Heap Sort -> Sorted
        while (q3.size() > 0) {
            System.out.print(q3.remove() + " ");
        }
        System.out.println();

        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Delhi", 30);
        m1.put("Delhi", 10);
        m1.put(null, 40);
        m1.put(null, 50);
        m1.put("Mumbai", null);
        m1.put("Kolkatta", null);

        Map<String, Integer> m2 = new LinkedHashMap<>();
        m2.put("Delhi", 30);
        m2.put("Delhi", 10);
        m2.put(null, 40);
        m2.put(null, 50);
        m2.put("Mumbai", null);
        m2.put("Kolkatta", null);

        Map<String, Integer> m3 = new TreeMap<>();
        m3.put("Delhi", 30);
        m3.put("Delhi", 10);
        // m3.put(null, 40); Tremap key cannot be null
        m3.put("Mumbai", null);
        m3.put("Kolkatta", null);

        for (String a : m1.keySet())
            System.out.print(a + " -> " + m1.get(a) + " ");
        System.out.println();

        for (String a : m2.keySet())
            System.out.print(a + " -> " + m2.get(a) + " ");
        System.out.println();

        for (String a : m3.keySet())
            System.out.print(a + " -> " + m3.get(a) + " ");
        System.out.println();

        Map<Student, Integer> m4 = new HashMap<>();

        Student st1 = new Student();
        st1.rollNo = 1;
        Student st2 = new Student();
        st2.rollNo = 2;
        Student st3 = new Student();
        st3.rollNo = 3;
        Student st4 = new Student();
        st4.rollNo = 1;
        Student st5 = st2;

        m4.put(st1, 10);
        m4.put(st2, 20);
        m4.put(st3, 30);
        m4.put(st4, 40);
        m4.put(st5, 50);

        System.out.println(m4);

        Map<ArrayList<Integer>, Integer> m5 = new HashMap<>();

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(20);

        ArrayList<Integer> a3 = a1;

        m5.put(a1, 100);
        m5.put(a2, 200);
        m5.put(a3, 300);

        System.out.println(m5);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);

        // Iterable : For Each Loop : Syntatical Sugar
        for (Integer data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();

        // For Each Method (Java 8+ Feature)
        arr.forEach((data) -> System.out.print(data + " "));
        System.out.println();

        // Iterator:
        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext() == true) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Enumeration: Iterate on Vector and Stack
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);

        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements() == true) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // List Iterator
        ListIterator<Integer> li = arr.listIterator();
        while (li.hasNext() == true) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        ListIterator<Integer> bi = arr.listIterator(arr.size());
        while (bi.hasPrevious() == true) {
            System.out.print(bi.previous() + " ");
        }
        System.out.println();

        Set<String> s = new HashSet<>();
        s.add("Delhi");
        s.add("Mumbai");
        s.add("Ahemadabad");
        s.add(null);
        s.add("Kolkatta");

        Iterator<String> sitr = s.iterator();
        while (sitr.hasNext() == true) {
            System.out.print(sitr.next() + " ");
        }

        // Concurrent Modification Exception
        Map<String, Integer> m = new HashMap<>();
        m.put("Delhi", 10);
        m.put("Mumbai", 20);
        m.put("Ahemadabad", 30);
        m.put(null, 40);
        m.put("Kolkatta", 50);

        // int counter = 0;
        // for (String key : m.keySet()) {

        // System.out.print(key + " - " + m.get(key));
        // counter++;

        // if (counter == 3) {
        // m.remove("Mumbai");
        // }

        // }
    }
}
