package State.Solution;

public class BeforeDeliveryState implements ProductState {

    @Override
    public void cancel() {
        System.out.println("Cancellation Not Allowed");
    }

}