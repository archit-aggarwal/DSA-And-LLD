public class User {
    public static int totalUsers = 0;
    private final int userId;
    private String name;
    private char gender;
    private String address;

    public User() {
        totalUsers++;
        userId = totalUsers;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }
}