import java.util.*;
// https://leetcode.com/problems/permutations/description/

// Approach 1: Which item to select first
// Time = O(N!), Space = O(N)

class Solution1 {
    List<List<Integer>> res = new ArrayList<>();

    public void permute(int[] nums, List<Integer> output) {
        if (output.size() == nums.length) {
            res.add(new ArrayList<>(output));
            return;
        }

        for (int item : nums) {
            if (output.contains(item) == true)
                continue;
            output.add(item);
            permute(nums, output);
            output.remove(output.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, new ArrayList<>());
        return res;
    }
}

// Approach 2: Item chooses the position
// Time = O(N!), Space = O(N)

class Solution2 {
    List<List<Integer>> res = new ArrayList<>();

    public void permute(int i, List<Integer> output) {
        if (i == output.size()) {
            res.add(new ArrayList<>(output));
            return;
        }

        for (int j = 0; j <= i; j++) {
            Collections.swap(output, i, j);
            permute(i + 1, output);
            Collections.swap(output, i, j);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for (int val : nums)
            output.add(val);
        permute(0, output);
        return res;
    }
}
