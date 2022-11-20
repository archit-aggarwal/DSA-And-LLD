package Command.Problem;

public class Client {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        remote.powerButton();
        remote.increaseButton();
        remote.nextButton();
    }
}
