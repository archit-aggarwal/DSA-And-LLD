package Facade;

class Uploader {
    public void upload(String s) {
        System.out.println("File uploaded");
    }
}

class Downloader {
    public String download() {
        System.out.println("File Downloaded");
        return "video.ma4";
    }
}

class Adapter {
    public void convertor() {
        System.out.println("File Conversion");
    }
}

public class VideoConvertorFacade {
    public String work(String str) {
        Uploader o1 = new Uploader();
        o1.upload(str);

        Adapter o2 = new Adapter();
        o2.convertor();

        Downloader o3 = new Downloader();
        return o3.download();
    }
}
