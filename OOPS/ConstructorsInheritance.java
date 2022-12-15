import java.util.*;

public class ConstructorsInheritance {
    public static void main(String[] args) {
        // Parent obj = new Parent()
        User u1 = new User();

        // Child obj = new Child();
        RegUser u2 = new RegUser();

        RegUser u3 = new RegUser("Archit", 'M',"archit@gmail.com", 9319117889l);
        System.out.println(u3.getName());
        System.out.println(u3.getGender());
        System.out.println(u3.getEmailId());

        // SubscribedUser u3 = new SubscribedUser();
    }
}
