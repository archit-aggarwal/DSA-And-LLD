package Facade;

public class Client {
    public static void main(String[] args) {
        VideoConvertorFacade video = new VideoConvertorFacade();
        System.out.println(video.work("video.mp4"));
    }
}
