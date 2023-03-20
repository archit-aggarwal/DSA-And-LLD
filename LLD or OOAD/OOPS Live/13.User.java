public class User {
    private String name;
    private char gender;
    String address = "India";

    public User() {
        // System.out.println("User Constructor");
    }

    public User(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void viewShowListing() {
        System.out.println("Unauthenticated user");
        System.out.println("View Show Listings");
    }

    // overriden function
    public void advertisement() {
        System.out.println("Many Ads");
    }

    // Always Statically Binded
    public static void staticFun() {
        System.out.println("This is Parent's Static Fun");
    }
}
