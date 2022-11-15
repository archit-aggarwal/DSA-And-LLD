package ChainOfResponsibility;

public abstract class Handler {
    Handler next;

    public Handler() {
        this.next = null;
    }

    public Handler(Handler next) {
        this.next = next;
    }

    public abstract void handle(Request request);
}
