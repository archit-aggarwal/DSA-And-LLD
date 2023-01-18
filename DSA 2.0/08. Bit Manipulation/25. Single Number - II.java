class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int val : nums)
            xor = xor ^ val;

        int rsb = Integer.lowestOneBit(xor);
        int first = 0;

        for (int val : nums) {
            if ((val & rsb) != 0)
                first = first ^ val;
        }

        int second = xor ^ first;
        return new int[] { first, second };
    }
}
