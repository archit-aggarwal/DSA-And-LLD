class Payment extends Thread {
    public synchronized void run() {
        System.out.println("Payment Processing");
        try {
            for (int idx = 0; idx < 5; idx++) {
                Thread.sleep(300);
                System.out.println(".");
            }
        } catch (Exception e) {
        }

        this.notify();
    }
}

class Food extends Thread {
    Payment t1;

    public void run() {

        synchronized (t1) {
            try {
                t1.wait();
            } catch (Exception e) {
            }

            System.out.println("Food Buy Starts");
        }
    }
}

class Ticket extends Thread {
    Payment t1;

    public synchronized void run() {
        synchronized (t1) {
            try {
                t1.wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Ticket Generation");
    }
}

class Driver {
    public static void main(String[] args) {
        Payment t1 = new Payment();

        Food t2 = new Food();
        t2.t1 = t1;

        Ticket t3 = new Ticket();
        t3.t1 = t1;

        t1.start();
        t2.start();
        t3.start();
    }
}