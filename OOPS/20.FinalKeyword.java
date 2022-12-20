import java.util.*;

// class A {
//     final public void f1() {
//         System.out.println("f1 A");
//     }
// }

// class B extends A {
//     public void f1(){

//     }
// }

public class App {
    // final int marks;
    final String name;
    final int[] arr;

    App(String name) {
        this.name = name;
        // this.marks = 100;
        arr = new int[2];
    }

    App() {
        this.name = "Archit";
        arr = new int[2];
    }

    public static void main(String[] args) {
        // App obj = new App("Archit Aggarwal");
        // System.out.println(obj.name);
        // // obj.name = "Archit Agarwal"; // Updation of Final Variable is not allowed
        // App obj2 = new App("Salman Khan");
        // System.out.println(obj2.name);

        App obj = new App();
        System.out.println(obj.arr[0] + " " + obj.arr[1]);

        // Changing data through final reference variable is possible
        obj.arr[0] = 10;
        obj.arr[1] = 20;

        // obj.arr = new int[2];
        // update the final reference variable
    }
}
