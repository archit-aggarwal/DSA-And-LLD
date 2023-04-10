// https://leetcode.com/problems/number-of-islands/description/
class Solution {
    int[] dr = { -1, +1, 0, 0 };
    int[] dc = { 0, 0, -1, +1 };

    public void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length)
            return; // out of matrix
        if (grid[r][c] == '0' || grid[r][c] == '2')
            return; // water cell or visited land

        grid[r][c] = '2'; // visiting a land
        for (int i = 0; i < 4; i++)
            dfs(grid, r + dr[i], c + dc[i]);
    }

    public int numIslands(char[][] grid) {
        int islands = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    dfs(grid, r, c);
                }
            }
        }
        return islands;
    }
}