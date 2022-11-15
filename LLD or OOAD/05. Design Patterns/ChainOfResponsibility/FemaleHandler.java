package ChainOfResponsibility;

public class FemaleHandler extends Handler {
    public FemaleHandler(Handler next) {
        super(next);
    }

    @Override
    public void handle(Request request) {
        if (request.state.equals("Manicure") == true) {
            System.out.println("Female Parlour does manicure");
        } else if (request.state.equals("Pedicure") == true) {
            System.out.println("Female Parlour does pedicure");
        } else {
            this.next.handle(request);
        }
    }

}
