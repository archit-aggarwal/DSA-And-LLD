class Parent {
    public final void finalFun() {
        System.out.println("This is parent's fun");
    }
}

class Child extends Parent {
    // Final Method can't be overrided
    // public void finalFun(){}
}

final class Parent2 {
    public void finalFun() {
        System.out.println("This is parent2's fun");
    }
}

// Final Class cannot be extended
// class Child2 extends Parent2{}

class Driver {
    private static final double PI = 3.14;
    private static final StringBuilder str = new StringBuilder("Mumbai");

    public static void main(String[] args) {
        // Get: Constant Variable: Allowed
        System.out.println(Driver.PI);

        // Set: Constant Variabel: Not Allowed
        // Driver.PI = 22/7.0;
        // Reassignment not possible

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Get And Data Modification: Final Reference Variable
        System.out.println(str);
        str.append(" Navi");
        System.out.println(str);

        // Reassignment Not Allowed
        // str = new StringBuilder("Delhi");

    }
}