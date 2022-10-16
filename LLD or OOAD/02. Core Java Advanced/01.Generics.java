
import java.util.*;

class Box<T> {
    private T data;

    // NOT POSSIBLE
    // public Box() {
    // this.data = new T();
    // }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class MyHashMap<K, V> {
    K key;
    V value;

    public MyHashMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

class Pair<K extends Number, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}

class MyArrayList<T> {
    private Object[] data = new Object[10];
    private int capacity = 10;
    private int size = 0;

    public T get(int idx) {
        return (T) data[idx];
    }

    public void set(T val, int idx) {
        data[idx] = val;
    }

    public void add(T val) {
        if (size == capacity) {
            capacity = capacity + capacity / 2;
            Object[] copy = new Object[capacity];
            for (int idx = 0; idx < data.length; idx++) {
                copy[idx] = data[idx];
            }
            data = copy;
        }

        data[size] = val; // no typecasting T is a Object (upcasting)
        size++;
    }

    public T remove() {
        T oldVal = (T) data[size];
        // Typecasting Object is not always T (downcasting)
        data[size] = null;
        size--;
        return oldVal;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[");
        for (Object val : data) {
            res.append(val + ",");
        }
        res.setCharAt(res.length() - 1, ']');
        return res.toString();
    }
}

class Generic {
    public static void objectClass() {
        Object[] arr = new Object[10];

        arr[0] = new Integer(10); // Integer Wrapper Class
        arr[1] = 10; // autoboxing

        arr[2] = new StringBuilder("Hello"); // StringBuilder
        arr[3] = "Hello"; // String

        arr[4] = new Character('A');
        arr[5] = 'A';

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        if (arr[2] instanceof StringBuilder)
            ((StringBuilder) arr[2]).append(" World");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        if (arr[0] instanceof StringBuilder)
            ((StringBuilder) arr[0]).append(" World");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void inbuiltArraylist() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(-10);
        // arr.add("Hello");

        ArrayList arr2 = new ArrayList();
        arr2.add(10);
        arr2.add(5.5);
        arr2.add(new StringBuilder("Hello"));
        arr2.add(new RegisteredUser());

        ((StringBuilder) arr2.get(2)).append(" World");

        if ((arr2.get(3)) instanceof StringBuilder)
            ((StringBuilder) arr2.get(3)).append(" World");
        System.out.println(arr2);
    }

    public static void BoxType() {
        Box<Integer> obj = new Box<>(5);
        System.out.println(obj.getData());

        Box<Double> obj2 = new Box<>(3.14);
        System.out.println(obj2.getData());

        Box<String> obj3 = new Box<>("Hello");
        System.out.println(obj3.getData());

        Box<Character> obj4 = new Box<>('A');
        System.out.println(obj4.getData());

        Box obj5 = new Box(4.5); // Object
        System.out.println(obj5.getData());

        Box obj6 = new Box(new StringBuilder("Hello"));
        System.out.println(obj6.getData());
    }

    public static void HashMapType() {
        MyHashMap ipl1 = new MyHashMap("Delhi", 0);
        MyHashMap ipl2 = new MyHashMap("Mumbai", 5);
        MyHashMap ipl3 = new MyHashMap(10, 5.5);

        MyHashMap<String, Integer> ipl4 = new MyHashMap<>("Delhi", 0);
        MyHashMap<String, Integer> ipl5 = new MyHashMap<>("Mumbai", 5);

        // MyHashMap<String, Integer> ipl6 = new MyHashMap<>(10, 5.5);
        // compilation error

        HashMap<String, Integer> ipl = new HashMap<>();

        Pair<Integer, Object> obj1 = new Pair<>(5, 10);
        Pair<Double, Integer> obj2 = new Pair<>(5.5, 10);
        // Pair<String, Integer> obj3 = new Pair<>("Hello", 15); // Not Possible
    }

    public static void CustomArrayList() {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj);

        MyArrayList obj2 = new MyArrayList();
        obj2.add(10);
        obj2.add(20);
        obj2.add(30);
        System.out.println(obj2);

        MyArrayList obj3 = new MyArrayList();
        obj3.add(10);
        obj3.add("Hello");
        obj3.add(5.5);
        System.out.println(obj3);

        MyArrayList<Integer> obj4 = new MyArrayList<>();
        obj4.add(10);
        obj4.add(20);
        obj4.add(30);
        // obj4.add("ehl"); // not possible
        System.out.println(obj4);
    }

    public static void main(String[] args) {
        CustomArrayList();
    }
}
