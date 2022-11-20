package Command.Solution;

public class LED implements ICommand {
    public void increaseButton() {
        System.out.println("Brightness Increase");
    }

    public void decreaseButton() {
        System.out.println("Brightness Decrease");
    }

    public void powerButton() {
        System.out.println("Power On/Off");
    }

    public void nextButton() {
        System.out.println("Next Color");
    }

    public void previousButton() {
        System.out.println("Previous Color");
    }
}

