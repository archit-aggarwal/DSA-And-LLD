import java.util.ArrayList;

class KeypadPhone {
    @Deprecated
    public static void touchKeypad() {
        System.out.println("Keypad Phone");
    }
}

class Parent {
    String emailIDAddress;

    public String getEmailIDAddress() {
        System.out.println("Overridden Method");
        return emailIDAddress;
    }
}

@FunctionalInterface
interface Operation {
    int operation(int a, int b);
}

class Child extends Parent {

    // @Override
    // public String getEmailIdAddress() {
    // System.out.println("Overrided Method");
    // return emailIDAddress;
    // }

    @Override
    public String getEmailIDAddress() {
        System.out.println("Overrided Method");
        return emailIDAddress;
    }
}

class Driver {

    @SuppressWarnings("all")
    public static void main(String[] args) {
        KeypadPhone.touchKeypad();
        // Warning Issued: Not recommended to use now

        Integer ii = new Integer(5);
        System.out.println(ii);

        ArrayList arr = new ArrayList();

        // Adjacency List (Graphs)
        ArrayList<Integer>[] adj = new ArrayList[5];
        for (int idx = 0; idx < 5; idx++) {
            adj[idx] = new ArrayList<>();
        }

        Parent obj = new Child();
        obj.getEmailIDAddress();

        Operation sum = (a, b) -> a + b;
        Operation diff = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        System.out.println(sum.operation(15, 10));
        System.out.println(diff.operation(15, 10));
        System.out.println(prod.operation(15, 10));
        System.out.println(div.operation(15, 10));
    }
}