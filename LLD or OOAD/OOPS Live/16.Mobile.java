class Camera {
    public void clickPhoto() {
        System.out.println("Click Photo");
    }

    public void open() {
        System.out.println("Shutter Open");
    }
}

class CellPhone {
    public void call() {
        System.out.println("Call Your GF/BF");
    }

    public void open() {
        System.out.println("Switch On");
    }
}

public class Mobile extends CellPhone {
    Camera cam;

    public void clickPhoto() {
        cam.clickPhoto();
    }
}

class App {
    public static void main(String[] args) {
        Mobile oneplus = new Mobile();
        oneplus.cam = new Camera();

        oneplus.clickPhoto();
        oneplus.open();
        oneplus.call();
    }
}
