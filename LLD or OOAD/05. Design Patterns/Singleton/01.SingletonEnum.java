enum LoggerServiceEnum {
    INSTANCE;

    public void log(String str) {
        System.out.println(str);
    }
}

class Client {
    public static void main(String[] args) {
        LoggerServiceEnum logger = LoggerServiceEnum.INSTANCE;
        logger.log("CPU Utilization Over 75%");
        logger.log("RAM Under 25%");
    }
}


