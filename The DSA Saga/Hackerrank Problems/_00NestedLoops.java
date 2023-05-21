package Day13;

public class _00NestedLoops {
    public static void main(String[] args) {
        // for (int r = 1; r <= 3; r++) {
        // for (int c = 1; c <= 4; c++) {
        // System.out.print(r + "," + c + " ");
        // }
        // System.out.println();
        // }

        System.out.println("Before Outer Loop");
        for (int row = 1; row <= 3; row++) {
            System.out.print(row + " -> ");
            for (int col = 1; col <= 4; col++) {
                System.out.print(col + ", ");
            }
            System.out.println();
        }
        System.out.println("After Outer Loop");
    }
}
