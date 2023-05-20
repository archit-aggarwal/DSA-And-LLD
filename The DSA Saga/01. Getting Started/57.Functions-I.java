class Solution57 {

    public static void printTime() {
        System.out.println("Print Time Started");
        System.out.println(java.time.LocalDateTime.now());
        System.out.println("Print Time Ended");
    }

    // printTime function not called
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println("Main Method Ended");
    }

}