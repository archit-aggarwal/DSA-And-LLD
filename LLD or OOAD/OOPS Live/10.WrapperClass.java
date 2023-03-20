import java.util.*;

class MyInteger {
    private int data;

    public MyInteger(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class WrapperClassDemo {
    public static void main(String[] args) {
        // int marks = 100; // Stack (Primitive)
        // System.out.println(marks);

        // Integer val = new Integer(90);
        // System.out.println(val);

        // Integer val2 = Integer.MIN_VALUE;
        // Integer val3 = Integer.MAX_VALUE;
        // Integer val4 = Integer.parseInt("01234");

        // Character ch1 = new Character('A');
        // System.out.println(Character.toLowerCase(ch1));

        // System.out.println(val2 + " " + val3 + " " + val4);

        // String str = new String("Archit");
        // System.out.println(str); // "Archit"

        // int[] arr = { 10, 20, 30, 40, 50 };
        // System.out.println(arr); // hashcode

        // ArrayList<Integer> data = new ArrayList<>();
        // data.add(10);
        // data.add(20);
        // System.out.println(data); // [10, 20]

        // MyInteger val1 = new MyInteger(50);
        // System.out.println(val1);
        // System.out.println(val1.getData());
        // val1.setData(100);
        // System.out.println(val1.getData());

        Integer val = new Integer(5);
        Integer val2 = 5; // autoboxing: Integer -> int
        System.out.println(val2);

        int val3 = val2; // Unboxing: int -> Integer
        System.out.println(val3);

        // Character ch = new Character('b');
        // Character ch2 = 'b';

        // int[] arr = {10, 20, 30};
        // int[] arr = new int[3];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 30;

    }
}
