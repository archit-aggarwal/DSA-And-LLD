interface ICamera {
    void clickPicture(); // public, abstract

    void open();

    // Default Method (public access modifer)
    default void lens() {
        System.out.println("Camera have a lens");
    }

    static void zoom() {
        System.out.println("Camera Zoom");
    }
}

interface ICall {
    public void call();

    public void open();
}

interface IVideoCall extends ICall {
    // public void call();
    // public void open();
    public void videoChat();
}

abstract class Torch {
    public void open() {
        System.out.println("Torch On/Off");
    }
}

class MobilePhone extends Torch implements ICamera, IVideoCall {
    @Override
    public void clickPicture() {
        System.out.println("Click Picture");
    }

    @Override
    public void call() {
        System.out.println("Audio or Video Call");
    }

    @Override
    public void open() {
        super.open(); // Torch
        System.out.println("Open the Mobile Phone");
    }

    @Override
    public void videoChat() {
        System.out.println("Video Chat");
    }
}

public class App {
    static String industry = "Bollywood";

    public static void main(String[] args) {
        ICamera p1 = new MobilePhone();
        p1.clickPicture();
        p1.open();

        ICall p2 = new MobilePhone();
        p2.call();
        p2.open();

        IVideoCall p5 = new MobilePhone();
        p5.videoChat();

        MobilePhone p3 = new MobilePhone();
        p3.clickPicture();
        p3.open();
        p3.call();

        Torch p4 = new MobilePhone();
        p4.open();

        ICamera.zoom();

        App.Inner obj = new App.Inner();
    }
}
