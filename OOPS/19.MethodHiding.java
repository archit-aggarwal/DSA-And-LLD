class User {
    String name = "Archit Aggarwal";
    char gender = 'M';
    String address = "India";

    void viewFreeShow() {
        System.out.println("View Free Shows");
    }

    void advertisement() {
        System.out.println("Many Ads");
    }

    static void staticFun() {
        System.out.println("This is Parent's Static Function");
    }

    private void privateFun() {
        System.out.println("This is Parent's Private Function");
    }

    void demofun() {
        System.out.println("Demo in Parent with No Paramters");
    }

    User getObject() {
        System.out.println("Parent's GetObject Function");
        System.out.println("Overriden Variables");
        return null;
    }
}

class RegUser extends User {
    String email = "archit.aggarwal023@gmail.com";
    String phoneNo = "9319117889";
    String address = "Delhi";

    void viewPaidShow() {
        System.out.println("View Paid Shows");
    }

    void advertisement() {
        System.out.println("Less Ads");
    }

    // This is not overriding
    static void staticFun() {
        System.out.println("This is Child's Static Function");
    }

    // This is not overriding
    public void privateFun() {
        System.out.println("This is child's Private Function");
    }

    void demofun(int var) {
        System.out.println("Demo in Child with 1 Parameter");
    }

    // int demofun(){} // Compilation Error

    // overriding
    // User getObject() {
    // return null;
    // }

    // overriding: Covariant Type
    RegUser getObject() {
        System.out.println("This is Chid's Get Object Function");
        System.out.println("Overdided Function");
        return this;
    }
}

public class App {
    public static void main(String[] args) {
        User u1 = new User();
        RegUser u2 = new RegUser();
        User u3 = new RegUser();

        u1.demofun(); // Parent
        // u1.demofun(1); Not Possible

        u2.demofun(); // Parent
        u2.demofun(1); // Child
        // Overloading in Different Classes

        u3.demofun(); // parent
        // u3.demofun(1); // no overriding
        // there is no function demofun with 1 parameter in parent

        u1.getObject(); // parent
        u2.getObject(); // child
        u3.getObject(); // child: overriding

        // u1.advertisement(); // Parent Overriden
        // u2.advertisement(); // Child Overrided
        // u3.advertisement(); // Child Overrided (Polymorphism)

        // User.staticFun(); // Parent
        // RegUser.staticFun(); // Child

        // u1.staticFun(); // Parent
        // u2.staticFun(); // Child
        // u3.staticFun(); // Parent (No Polymorphism)
        // // This is known as method hiding: early binding

        // // u1.privateFun(); // Cannot access private function
        // u2.privateFun();
        // // u3.privateFun(); // Cannot access private function

    }
}