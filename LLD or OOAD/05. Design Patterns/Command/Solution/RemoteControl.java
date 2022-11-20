package Command.Solution;

public class RemoteControl {
    ICommand receiver;

    public void setReceiver(ICommand receiver) {
        this.receiver = receiver;
    }

    public void increaseButton() {
        receiver.increaseButton();
    }

    public void decreaseButton() {
        receiver.decreaseButton();
    }

    public void powerButton() {
        receiver.powerButton();
    }

    public void nextButton() {
        receiver.nextButton();
    }

    public void previousButton() {
        receiver.previousButton();
    }
}
