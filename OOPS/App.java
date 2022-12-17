public class App {
    public static void main(String[] args) {
        // User u1 = new User();
        // System.out.println(u1.name + ", "
        // + u1.gender + ", " + u1.address);

        // u1.viewFreeShow();
        // u1.advertisement();

        // RegUser u2 = new RegUser();
        // System.out.println(u2.name + ", " + u2.gender + ", "
        // + u2.email + ", " + u2.phoneNo);
        // System.out.println(u2.address); // delhi (child)
        // u2.superAddress(); // india (parent)

        // u2.advertisement(); // overrided (less ads)
        // u2.superAdv(); // overriden (more ads)

        User u3 = new RegUser();
        System.out.println(u3.name + ", " + u3.gender
                + ", " + u3.address);

        u3.viewFreeShow(); // only parent
        u3.advertisement(); // overrided function
        // u3.viewPaidShow(); // only child: not available

        RegUser u4 = (RegUser) u3;
        u4.viewPaidShow();
        System.out.println(u4.email + ", " + u4.phoneNo);
    }
}

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

    void superAddress() {
        System.out.println(super.address);
        // india -> indirectly accessible
    }

    void superAdv() {
        super.advertisement(); // Many Ads
    }
}
