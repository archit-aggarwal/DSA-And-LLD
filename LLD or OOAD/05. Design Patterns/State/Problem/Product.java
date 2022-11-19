package State.Problem;

public class Product {
    int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void cancel() {
        if (this.state < 5) {
            // Packaging, Transit, Out for Delivery
            System.out.println("Cancellation Not Allowed");
        } else if (this.state == 5) {
            // Wrong Product or Damaged at Payment
            System.out.println("Replace Product");
        } else {
            // After payment
            System.out.println("Return & Refund Product");
        }
    }
}
