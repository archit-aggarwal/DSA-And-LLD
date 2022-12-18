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

        // User u3 = new RegUser();
        // System.out.println(u3.name + ", " + u3.gender
        // + ", " + u3.address);

        // u3.viewFreeShow(); // only parent
        // u3.advertisement(); // overrided function
        // // u3.viewPaidShow(); // only child: not available

        // RegUser u4 = (RegUser) u3;
        // u4.viewPaidShow();
        // System.out.println(u4.email + ", " + u4.phoneNo + ", " + u4.address);

        // RegUser r2 = new RegUser();
        // RegUser r3 = r2; // shallow copy: possible

        User t1 = new User();
        // RegUser t2 = t1; // Compilation Error (Child Ref Variable, Parent Ref)
        // RegUser t3 = (RegUser) t1; // RunTime Error: Exception

        if (t1 instanceof RegUser) {
            RegUser t4 = (RegUser) t1;
            System.out.println(t4.email + ", " + t4.phoneNo);
        } else {
            System.out.println("T1 is not a Registered User");
        }

        User p1 = new RegUser();
        // RegUser p2 = p1; // Compilation Error (Child Ref Variable, Parent Ref)
        // RegUser p3 = (RegUser) p1; // Valid (No Runtime Error)

        if (p1 instanceof RegUser) {
            RegUser p4 = (RegUser) p1;
            System.out.println(p4.email + ", " + p4.phoneNo);
        } else {
            System.out.println("P1 is not a Registered User");
        }
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
