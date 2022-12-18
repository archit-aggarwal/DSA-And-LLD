public class App {
    // final int marks;
    final String name;
    
    App(String name) {
        this.name = name;
        // this.marks = 100;
    }

    public static void main(String[] args) {
        App obj = new App("Archit Aggarwal");
        System.out.println(obj.name);

        // obj.name = "Archit Agarwal"; // Updation of Final Variable is not allowed

        App obj2 = new App("Salman Khan");
        System.out.println(obj2.name);
    }
}
