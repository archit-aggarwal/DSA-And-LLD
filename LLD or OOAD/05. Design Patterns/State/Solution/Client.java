package State.Solution;

public class Client {
    public static void main(String[] args) {
        Product iphone = new Product();
        iphone.setState(new BeforeDeliveryState()); // Being Packaged
        iphone.cancel(); // Cancellation Not Allowed

        iphone.setState(new OnDoorState()); // Payment Pending
        iphone.cancel(); // Replace Allowed

        iphone.setState(new DeliveredState()); // Payment Done & Recieved
        iphone.cancel(); // Return & Refund
    }
}
