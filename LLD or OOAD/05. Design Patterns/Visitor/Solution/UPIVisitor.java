package Visitor.Solution;

public class UPIVisitor implements Visitor {
    @Override
    public void visit(Paytm app) {
        System.out.println("Added UPI Functionality in Paytm");
    }
}

