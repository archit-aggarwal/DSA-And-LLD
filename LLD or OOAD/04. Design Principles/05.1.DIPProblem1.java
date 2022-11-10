// Dependency Inversion Principle Violation

class Worker {
    public void work() {
        // ....working
    }
}

class Manager {

    Worker worker;

    public void setWorker(Worker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}

class SuperWorker {
    public void work() {
        // .... working much more
    }
}

