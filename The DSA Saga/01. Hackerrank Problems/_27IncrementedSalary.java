package Day06;
import java.util.*;

public class _27IncrementedSalary {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int age = scn.nextInt();
        int salary = scn.nextInt();
        int exp = scn.nextInt();

        if (age > 60 && salary > 20000 && exp > 20)
            salary += 5000;
        else if (age > 40 && salary > 15000 && exp > 10)
            salary += 2000;
        else if (age > 30 && salary > 10000 && exp > 5)
            salary += 1000;
        else
            salary += 500;

        System.out.println(salary);
    }
}
