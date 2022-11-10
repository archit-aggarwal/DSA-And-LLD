interface Worker {
    public void work();

    public void eat();
}

class Human implements Worker {
    public void work() {
        System.out.println("Slow Work");
    }

    public void eat() {
        System.out.println("Eat Food");
    }
}

class Robot implements Worker {
    public void work() {
        System.out.println("Fast Work");
    }

    public void eat() {
        // Do Nothing Function
    }
}

class Manager {
    public static void main(String[] args) {
        Worker human = new Human();
        human.work();
        human.eat();

        Worker robot = new Robot();
        robot.work();
        robot.eat();
    }
}
