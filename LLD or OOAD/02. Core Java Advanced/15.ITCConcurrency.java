class Theater {
    int availableSeats;

    Theater(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void bookSeats(User user, int seats) {
        System.out.println("User " + user.name + " : Please Proceed to Payment Gateway");

        synchronized (this) {
            if (availableSeats >= seats) {
                System.out.println("Username " + user.name + " "
                        + " has booked " + seats + " seats ");

                availableSeats -= seats;
            } else {
                System.out.println("There are no seats available");
            }

            this.notify();
        }

        System.out.println("Do you want to go back to the main screen ?");
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
    public static void main(String[] args) throws Exception {
        User u1 = new User("Ram");
        User u2 = new User("Shyam");
        User u3 = new User("Sita");
        User u4 = new User("Gita");

        u1.start();
        u2.start();
        u3.start();
        u4.start();

        synchronized (u1) {
            u1.wait();
            System.out.println("Remaining Seats : " + User.pvr.availableSeats);
        }

        // u2.start();
        synchronized (u2) {
            u2.wait();
            System.out.println("Remaining Seats : " + User.pvr.availableSeats);
        }

        // u3.start();
        synchronized (u3) {
            u3.wait();
            System.out.println("Remaining Seats : " + User.pvr.availableSeats);
        }

        // u4.start();
        synchronized (u4) {
            u4.wait();
            System.out.println("Remaining Seats : " + User.pvr.availableSeats);
        }

    }
}