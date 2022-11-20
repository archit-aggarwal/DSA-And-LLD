package Command.Problem;

public class RemoteControl {
    Television receiver = new Television();

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
