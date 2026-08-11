// Last updated: 11/08/2026, 16:17:55
class Solution {
    public int numIslands(char[][] grid) {
        // Edge case: if the grid is empty, return 0
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Linear scan through the entire 2D grid
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // When we encounter land ('1'), it marks the start of a new island
                if (grid[r][c] == '1') {
                    numIslands++;
                    // Trigger DFS to clear/sink this entire connected island
                    dfs(grid, r, c);
                }
            }
        }
        
        return numIslands;
    }
    
    private void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        // Base cases: check boundary conditions and if the cell is water ('0')
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] != '1') {
            return;
        }
        
        // "Sink" the island: Mark the current cell as visited by turning it to '0'
        grid[r][c] = '0';
        
        // Recursively check all 4 cardinal directions (Up, Down, Left, Right)
        dfs(grid, r - 1, c); // Up
        dfs(grid, r + 1, c); // Down
        dfs(grid, r, c - 1); // Left
        dfs(grid, r, c + 1); // Right
    }
}