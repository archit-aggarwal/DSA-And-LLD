import java.util.*;

public class ipl {
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        // Class is loaded: it will run
        map.put("CSK", 0);
        map.put("DC", 0);
        map.put("MI", 0);
        map.put("GT", 0);

        System.out.println("Hello IPL Class Static Block");
    }

    ipl() {
        // Initialize Static Properties Using Constructor
        System.out.println("Hello IPL Object");
    }

    public static void main(String[] args) {
        System.out.println("Hello Main Function");
        ipl obj = new ipl();
        System.out.println(obj.map);
    }
}
