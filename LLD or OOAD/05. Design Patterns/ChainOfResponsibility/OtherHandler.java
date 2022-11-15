package ChainOfResponsibility;

public class OtherHandler extends Handler {
    public OtherHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request != null && request.state.length() > 0) {
            System.out.println("Unisex Barber");
        } else if (next == null) {
            System.out.println("Invalid Request");
        }
    }
}
