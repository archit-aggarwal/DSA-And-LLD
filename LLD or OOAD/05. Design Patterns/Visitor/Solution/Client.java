package Visitor.Solution;

public class Client {
    public static void main(String[] args) {
        Paytm app = new Paytm();
        app.wallet();
        app.recharge();
        app.billPayment();

        Visitor upi = new UPIVisitor();
        app.accept(upi);

        Visitor paytmFirst = new PaytmFirstVisitor();
        app.accept(paytmFirst);
    }
}
