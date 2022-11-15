package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Request r1 = new Request("Beard");
        Request r2 = new Request("Manicure");
        Request r3 = new Request("Haircut");
        Request r4 = new Request("");

        Handler h3 = new OtherHandler(null);
        Handler h2 = new FemaleHandler(h3);
        Handler h1 = new MaleHandler(h2);

        h1.handle(r1); // Male: h1
        h1.handle(r2); // Female: h2
        h1.handle(r3); // Other: h3
        h1.handle(r4); // Invalid: h3
    }
}
