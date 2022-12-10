public class User {
    private  String name;
    private char gender;

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
        System.out.println("Unauthenticatprivateed user");
        System.out.println("View Show Listings");
    }
}

