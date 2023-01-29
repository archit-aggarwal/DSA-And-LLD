// https://leetcode.com/problems/unique-paths-iii/description/
// Time = O(4 ^ mn), Space = O(mn)

class Solution {
    int[] dx = { -1, +1, 0, 0 };
    int[] dy = { 0, 0, -1, +1 };

    public int dfs(int[][] grid, int r, int c, int count) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return 0;
        if (grid[r][c] == -1)
            return 0;
        if (grid[r][c] == 2)
            return (count == 1) ? 1 : 0;

        int paths = 0;
        for (int i = 0; i < 4; i++) {
            grid[r][c] = -1; // visited
            paths += dfs(grid, r + dx[i], c + dy[i], count - 1);
            grid[r][c] = 0; // backtracking
        }

        return paths;
    }

    public int uniquePathsIII(int[][] grid) {
        int r = 0, c = 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    r = i;
                    c = j;
                }
                if (grid[i][j] != -1)
                    count++;
            }
        }

        return dfs(grid, r, c, count);
    }

}