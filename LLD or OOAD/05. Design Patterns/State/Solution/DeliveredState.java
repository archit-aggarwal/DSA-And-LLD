package State.Solution;

public class DeliveredState implements ProductState {

    @Override
    public void cancel() {
        System.out.println("Return & Refund Item");
    }

}

