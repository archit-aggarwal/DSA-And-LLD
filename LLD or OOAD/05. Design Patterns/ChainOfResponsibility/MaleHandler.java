package ChainOfResponsibility;

public class MaleHandler extends Handler {
    public MaleHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request.state.equals("Beard") == true) {
            System.out.println("Male Barber cuts beard");
        } else if (request.state.equals("Moustache") == true) {
            System.out.println("Male Barber cuts moustache");
        } else {
            this.next.handle(request);
        }
    }
}

