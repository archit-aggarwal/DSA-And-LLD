package Visitor.Solution;

public class Paytm {
    public void wallet() {
        System.out.println("Wallet Service");
    }

    public void recharge() {
        System.out.println("Recharge Mobile");
    }

    public void billPayment() {
        System.out.println("Electricity Bill Payment");
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

