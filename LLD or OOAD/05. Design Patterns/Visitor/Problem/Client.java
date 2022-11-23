package Visitor.Problem;

public class Client {
    public static void main(String[] args) {
        Paytm app = new Paytm();
        app.wallet();
        app.recharge();
        app.billPayment();
    }
}
