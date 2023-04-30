package Day02;
import java.util.*;

public class _09AreaAndPerimeter {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int length = scn.nextInt();
        int breadth = scn.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println(area);
        System.out.println(perimeter);
    }
}
