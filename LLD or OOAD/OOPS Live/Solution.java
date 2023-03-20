import java.util.*;

class Profile {
    String name;
    int totalPosts, totalReels;
    String blueTick;
    int followers, following;
    String category;
    char gender;

    public Profile(String name, int totalPosts, int totalReels, String blueTick, int followers, int following,
            String category, char gender) {
        this.name = name;
        this.totalPosts = totalPosts;
        this.totalReels = totalReels;
        this.blueTick = blueTick;
        this.followers = followers;
        this.following = following;
        this.category = category;
        this.gender = gender;
    }

    public void display() {
        System.out.println(this.name);
        System.out.println(this.totalPosts);
        System.out.println(this.totalReels);
        System.out.println(this.blueTick);
        System.out.println(this.followers);
        System.out.println(this.following);
        System.out.println(this.category);
        System.out.println(this.gender);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        int totalPosts = scn.nextInt();
        int totalReels = scn.nextInt();
        String blueTick = scn.nextLine();
        int followers = scn.nextInt();
        int following = scn.nextInt();
        String category = scn.nextLine();
        char gender = scn.next().charAt(0);

        Profile user = new Profile(name, totalPosts, totalReels, blueTick, followers, following, category, gender);

        user.display();
        
        // Profile u1 = new Profile(
        // "Raftaar", 340, 400, "Yes", 7, 200, "Rapper", 'M');

        // Profile u2 = new Profile(
        // "Rachel Gupta", 550, 350, "Yes", 15, 10, "Artist", 'M');

        // Profile u3 = new Profile(
        // "Nikhil Chinapa", 500, 220, "Yes", 5, 210, "VJ", 'M');

        // Profile u4 = new Profile(
        // "Baseer", 500, 120, "No", 2, 230, "VJ", 'M');

        // u1.display();
        // u2.display();
        // u3.display();
        // u4.display();

    }
}
