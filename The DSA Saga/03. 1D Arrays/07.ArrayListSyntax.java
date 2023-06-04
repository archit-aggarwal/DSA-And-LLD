import java.util.*;

class Solution7{
    public static void main(String[] args) {
        // ArrayList : Creation
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println(nums);

        // Insertion
        for (int val = 10; val <= 50; val += 10) {
            nums.add(val);
            System.out.println(nums);
        }
        // READ OR GET : TRAVERSAL
        for (int idx = 0; idx < nums.size(); idx++) {
            System.out.println(idx + " : " + nums.get(idx));
        }
        // UPDATION
        for (int idx = 0; idx < nums.size(); idx++) {
            int val = idx + 1;
            nums.set(idx, val);
        }
        System.out.println(nums);

        // DELETION
        for (int idx = nums.size() - 1; idx >= 0; idx--) {
            nums.remove(idx);
            System.out.println(nums);
        }

    }
}
