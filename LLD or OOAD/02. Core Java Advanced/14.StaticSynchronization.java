class Theater {
    static int availableSeats = 20;

    public synchronized static void bookSeats(User user, int seats) {
        System.out.println("User " + user.name + " : Please Proceed to Payment Gateway");

        if (availableSeats >= seats) {
            System.out.println("Username " + user.name + " "
                    + " has booked " + seats + " seats ");

            availableSeats -= seats;

            System.out.println("Remaining Seats : " + availableSeats);
        } else {
            System.out.println("There are no seats available");
        }

        System.out.println("Do you want to go back to the main screen ?");
    }
}

class User extends Thread {
    String name;
    Theater theater;

    User(String name) {
        this.name = name;
    }

    User(String name, Theater theater) {
        this.name = name;
        this.theater = theater;
    }

    @Override
    public void run() {
        theater.bookSeats(this, 10);
    }
}

class Driver {
    public static void main(String[] args) {
        Theater delhi = new Theater();
        Theater mumbai = new Theater();

        User u1 = new User("Ram", delhi);
        User u2 = new User("Shyam", delhi);
        User u3 = new User("Sita", mumbai);
        User u4 = new User("Gita", mumbai);

        u1.start();
        u2.start();
        u3.start();
        u4.start();
    }
}