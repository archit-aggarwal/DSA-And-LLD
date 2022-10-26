@SuppressWarnings("all")
class Parent {
    public static void staticMethod() {
        System.out.println("Parent Class Static Method");
    }

    private void privateMethod() {
        System.out.println("Parent Private Method");
    }

    public void fun() {
        System.out.println("Parent Class = 0 Parameter");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Child Class Static Method");
    }

    public void privateMethod() {
        System.out.println("Child Private Method");
    }

    public void fun(int x) {
        System.out.println("Child Class = 1 Parameter");
    }

    // public int fun() { return 0; }
    // Compilation Error: Return Type in Overriding must be same
}

@SuppressWarnings("all")
class Solution {
    public static void staticMethods() {
        Parent.staticMethod();
        Child.staticMethod();

        Parent obj1 = new Parent();
        obj1.staticMethod();

        Child obj2 = new Child();
        obj2.staticMethod();

        // Method Hiding: Static Binding
        // No Method Overriding: No Dynamic Binding
        Parent obj3 = new Child();
        obj3.staticMethod();
    }

    public static void privateMethods() {
        Parent obj1 = new Parent();
        // obj1.privateMethod();
        // Not Possible: Private Method can't be accessed using object

        Child obj2 = new Child();
        obj2.privateMethod();

        Parent obj3 = new Child();
        // obj3.privateMethod();
        // Not Possible: Private Method is not overriden
        // It is not visible in parent
        // No Private Method Overriding: Static Binding
    }

    public static void parameterizedMethods() {
        Parent obj1 = new Parent();
        obj1.fun(); // Possible
        // obj1.fun(10);
        // Not Possible: No Overloaded Function
        // fun with 1 parameter in Parent Class

        Child obj2 = new Child();
        obj2.fun(); // Possible: Super's fun called
        obj2.fun(10); // Possible: Child's fun called
        // This is Method Overloading in Different Classes

        // Method Hiding: Static Binding
        // No Method Overriding: No Dynamic Binding
        Parent obj3 = new Child();
        obj3.fun(); // Possible: Super's fun called
        // obj3.fun(10);
        // Not Possible: No Function fun with 1 Parameter
        // No Function Overriding (change in function signature)
    }

    public static void main(String[] args) {
        staticMethods();
        System.out.println();

        privateMethods();
        System.out.println();

        parameterizedMethods();
        System.out.println();
    }
}