package Command.Solution;

public class Client {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        remote.setReceiver(new Television());
        remote.powerButton();
        remote.increaseButton();
        remote.nextButton();

        remote.setReceiver(new LED());
        remote.powerButton();
        remote.increaseButton();
        remote.nextButton();
    }
}
