// https://leetcode.com/problems/flood-fill/description/
// Time = O(N ^ 2), Space = O(n ^ 2) DFS Recursion

class Solution {
    // run dfs on basis of old color, and visited will be acting as new color
    public void dfs(int r, int c, int[][] image, int oldcolor, int newcolor) {
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return; // out of matrix

        if (image[r][c] != oldcolor)
            return;
        image[r][c] = newcolor;

        dfs(r - 1, c, image, oldcolor, newcolor);
        dfs(r + 1, c, image, oldcolor, newcolor);
        dfs(r, c - 1, image, oldcolor, newcolor);
        dfs(r, c + 1, image, oldcolor, newcolor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {
        int oldcolor = image[sr][sc];
        if (oldcolor != newcolor)
            dfs(sr, sc, image, oldcolor, newcolor);
        return image;
    }
}