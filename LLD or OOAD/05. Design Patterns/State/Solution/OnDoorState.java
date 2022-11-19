package State.Solution;

public class OnDoorState implements ProductState {

    @Override
    public void cancel() {
        System.out.println("Replace Item");
    }

}

