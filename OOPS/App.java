public class App {
    public static void main(String[] args) {
        User u1 = new User();
        
        u1.setName("Hrishi");
        u1.setGender('M');

        System.out.print(u1.getName() + " ");
        System.out.print(u1.getGender());
        u1.viewShowListing();

        RegUser u2 = new RegUser();
        u2.setName("Archit");
        u2.setGender('M');
        u2.setEmailId("archit.aggarwal023@gmail.com");
        u2.setPhoneNo(9319117889l);

        System.out.print(u2.getName() + " ");
        System.out.print(u2.getGender() + " ");
        System.out.print(u2.getEmailId() + " ");
        System.out.print(u2.getPhoneNo());

        u2.viewShowListing();
        u2.viewFreeShows();
    }
}