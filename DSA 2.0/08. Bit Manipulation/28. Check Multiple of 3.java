// https://practice.geeksforgeeks.org/problems/is-binary-number-multiple-of-30654/1

class Solution {
    int isDivisible(String s) {
        int odd = 0, even = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '1') {
                if (idx % 2 == 1)
                    odd++;
                else
                    even++;
            }
        }

        if ((odd - even) % 3 == 0)
            return 1;
        return 0;
    }
}
