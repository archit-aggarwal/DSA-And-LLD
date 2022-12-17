public class App {
    public static void main(String[] args) {
        // User u1 = new User();

        // u1.setName("Hrishi");
        // u1.setGender('M');

        // System.out.print(u1.getName() + " ");
        // System.out.print(u1.getGender());
        // u1.viewShowListing();

        // RegUser u2 = new RegUser();
        // u2.setName("Archit");
        // u2.setGender('M');
        // u2.setEmailId("archit.aggarwal023@gmail.com");
        // u2.setPhoneNo(9319117889l);

        // System.out.print(u2.getName() + " ");
        // System.out.print(u2.getGender() + " ");
        // System.out.print(u2.getEmailId() + " ");
        // System.out.print(u2.getPhoneNo());

        // u2.viewShowListing();
        // u2.viewFreeShows();

        // SubscribedUser u3 = new SubscribedUser();
        // u3.setName("Archit");
        // u3.setGender('M');
        // u3.setEmailId("archit.aggarwal023@gmail.com");
        // u3.setPhoneNo(9319117889l);
        // u3.setPlan("Select");
        // u3.setValidity("1 year");
        // u3.viewPaidShows();
        // u3.viewFreeShows();
        // u3.viewShowListing();

        // Admin u4 = new Admin();
        // u4.setName("Archit");
        // u4.setGender('M');
        // u4.setEmailId("archit.aggarwal@hotstar.com");
        // u4.setPhoneNo(9319117889l);
        // u4.setAdminId("EMP01");
        // u4.editShow();

        User u1 = new User();
        u1.advertisement();
        System.out.println(u1.address);
        u1.setGender('M');
        u1.setName("Archit");
        u1.viewShowListing();

        // RegUser u2 = new RegUser();
        // u2.advertisement();

        // SubscribedUser u3 = new SubscribedUser();
        // u3.advertisement();

        // User.staticFun();
        // RegUser.staticFun();

        // User u4 = new RegUser();
        // u4.advertisement();
        // u4.staticFun();

        // User u3 = new RegUser();
        // upcasting: possible
        // u3.advertisement();
        // overrided function

        // RegUser u4 = new User();
        // downcasting: compilation error
        // u4.advertisement();
    }
}