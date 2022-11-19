package State.Solution;

public class Product {
    ProductState state;

    public void cancel() {
        state.cancel();
    }

    public void setState(ProductState state) {
        this.state = state;
    }
}

