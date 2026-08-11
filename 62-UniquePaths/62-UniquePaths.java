// Last updated: 11/08/2026, 16:20:05
class Solution {
    public int uniquePaths(int m, int n) {
        // Optimize space by using a 1D array representing the current row
        int[] dp = new int[n];
        
        // Base case: There is exactly 1 way to reach any cell in the first row
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        // Fill the DP array row by row
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                // The ways to reach dp[c] is the sum of:
                // dp[c] (from the cell directly above) + dp[c-1] (from the cell to the left)
                dp[c] += dp[c - 1];
            }
        }
        
        // The last element contains the total unique paths to the bottom-right corner
        return dp[n - 1];
    }
}