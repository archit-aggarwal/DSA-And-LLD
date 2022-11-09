class Movie {
    int duration = 180;
    String name = "Avengers Endgame";

    public void display() {
        System.out.println(this.name + " runs for " + this.duration);
    }
}

class User {
    String name, location;

    User() {
        this.name = "Anonymous";
        this.location = "India";
    }

    User(String name) {
        this.name = name;
        this.location = "India";
    }

    User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println(this.name + ", " + this.location);
    }
}

class RegisteredUser extends User {
    String phone = "9319117889";

    @Override
    public void display() {
        System.out.println(this.name + ", " + this.location + ", " + this.phone);
    }
}

class Driver {
    public static void main(String[] args) {
        // Static Binding
        Movie avengers = new Movie();
        avengers.display();

        User u1 = new User();
        u1.display();
        User u2 = new User("Archit");
        u2.display();
        User u3 = new User("Archit", "Delhi");
        u3.display();

        // Dynamic Binding
        RegisteredUser u4 = new RegisteredUser();
        u4.display();
    }
}