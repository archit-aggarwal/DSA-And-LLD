class Theater {
    int availableSeats;

    Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void bookSeats(User user, int seats) {
        if (availableSeats >= seats) {
            System.out.println("Username " + user.name + " "
                    + " has booked " + seats + " seats ");

            availableSeats -= seats;

            System.out.println("Remaining Seats : " + availableSeats);
        } else {
            System.out.println("There are no seats available");
        }
    }
}

class User extends Thread {
    String name;
    static Theater pvr = new Theater(20);

    User(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        pvr.bookSeats(this, 10);
    }
}

class Driver {
    public static void main(String[] args) {
        User u1 = new User("Ram");
        User u2 = new User("Shyam");
        User u3 = new User("Sita");
        User u4 = new User("Gita");

        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}