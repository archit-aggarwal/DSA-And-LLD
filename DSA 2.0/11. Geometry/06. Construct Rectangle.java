// https://leetcode.com/problems/construct-the-rectangle/description/
// Time = O(Root N), Space = O(1)

class Solution {
    public int[] constructRectangle(int area) {
        int breadth = (int) Math.sqrt(area);
        while (area % breadth != 0)
            breadth--;
        int length = area / breadth;
        return new int[] { length, breadth };
    }
}