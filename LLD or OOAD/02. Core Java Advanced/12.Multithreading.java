class Stream implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive()); // Running -> Alive
        Thread.currentThread().setName("Stream Thread");
        System.out.println(Thread.currentThread().getName());

        // System.out.println("Stream Thread Started");

        // for (int idx = 0; idx < 10; idx++) {
        // System.out.print(idx + " ");
        // }

        // System.out.println(Thread.currentThread().getName());

        // // fun();
        // System.out.println("\nStream Thread Ended");
    }

    public void fun() {
        System.out.println("It is a normal function");
        System.out.println(10 / 0);
    }
}

class Timer extends Thread {
    @Override
    public void run() {
        System.out.println("Timer Thread Started");

        for (int idx = 0; idx < 10; idx++) {
            System.out.print(idx + " ");
        }

        System.out.println(Thread.currentThread().getName());

        System.out.println("\nTimer Thread Ended");
    }
}

class Driver {
    public static void main(String[] args) {
        Thread.currentThread().setName("My First Thread");
        System.out.println(Thread.currentThread().getName());

        Stream obj = new Stream();
        // obj.fun(); // main thread

        Thread thread = new Thread(obj);
        System.out.println(thread.isAlive()); // New -> Not Alive
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        System.out.println(thread.isAlive());

        Timer obj2 = new Timer();
        obj2.start();

        try {
        Thread.sleep(1000);
        } catch (Exception e) {

        }

        // obj2.start(); // Not Possible

        // Possible
        Timer obj3 = new Timer();
        obj3.start();
    }
}