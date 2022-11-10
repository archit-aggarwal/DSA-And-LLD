interface Worker {
    public void work();
}

interface Eater {
    public void eat();
}

class Human implements Worker, Eater {
    @Override
    public void work() {
        System.out.println("Slow Work");
    }

    @Override
    public void eat() {
        System.out.println("Eat Food");
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        System.out.println("Fast Work");
    }
}

class Manager {
    public static void main(String[] args) {
        Human human = new Human();
        human.work();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}


