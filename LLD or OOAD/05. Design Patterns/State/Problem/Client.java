package State.Problem;

public class Client {
    public static void main(String[] args) {
        Product iphone = new Product();
        iphone.setState(1); // Being Packaged
        iphone.cancel(); // Cancellation Not Allowed

        iphone.setState(4); // Out For Delivery
        iphone.setState(5); // Payment Pending
        iphone.cancel(); // Replace Allowed

        iphone.setState(6); // Payment Done & Recieved
        iphone.cancel(); // Return & Refund
    }
}
