import java.util.*;

class MyInteger {
    private int data;

    public MyInteger(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}

class Driver {
    public static void inbuiltWrapperClass() {
        // Primitive Stack Variable
        int a = 5;
        System.out.print(a + " ");

        // Integer Wrapper Class
        Integer aa = 10; // Autoboxing
        System.out.print(aa + " ");

        a = aa; // Unboxing
        System.out.print(a + " ");

        // Actual Object Creation, Getter and Setter
        Integer b = new Integer(20);
        System.out.print(b.toString() + " ");

        a = b.intValue();
        System.out.print(a);
    }

    public static void functionsAndConst() {
        Integer a = 10;

        // Integer to String and String to Integer
        String b = a.toString();
        System.out.println(a + " Integer to String : " + b);

        String c = "256";
        Integer d = Integer.parseInt(c);
        System.out.println(c + " in Integer : " + d);

        // Various Number Conversions
        System.out.println(a + " Decimal to Binary : " + Integer.toBinaryString(a));
        System.out.println(a + " Decimal to Hexadecimal : " + Integer.toHexString(a));
        System.out.println(a + " Decimal to Octal : " + Integer.toOctalString(a));

        System.out.println("Integer MAXIMUM Range : " + Integer.MAX_VALUE);
        System.out.println("Integer MINIMUM Range : " + Integer.MIN_VALUE);

        // Various Other Functions
        System.out.println(a.compareTo(d));
        System.out.println(a.equals(d));
        System.out.println(Integer.max(a, d));
        System.out.println(Integer.min(a, d));
    }

    public static void customWrapper() {
        MyInteger a = new MyInteger(5);
        System.out.println(a.getData());

        a.setData(10);
        System.out.println(a.getData());
    }

    public static void main(String[] args) {
        // inbuiltWrapperClass();
        // functionsAndConst();
        customWrapper();
    }
}