// Last updated: 11/08/2026, 16:20:15
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        
        // Pre-compute all possible row strings (Massive optimization!)
        String[] rowStrings = new String[n];
        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[i] = 'Q';
            rowStrings[i] = new String(row);
        }
        
        int[] positions = new int[n];
        // Bulletproof mask generation avoiding Java's shift-by-64 wrap-around
        long mask = ~0L >>> (64 - n);
        
        dfs(0, n, 0, 0, 0, mask, positions, rowStrings, result);
        return result;
    }

    private void dfs(int row, int n, long col, long d1, long d2, long mask, 
                     int[] positions, String[] rowStrings, List<List<String>> results) {
        if (row == n) {
            // Pre-sized ArrayList avoids array-resizing overhead completely
            List<String> solution = new ArrayList<>(n);
            for (int pos : positions) {
                solution.add(rowStrings[pos]);
            }
            results.add(solution);
            return;
        }

        long avail = mask & ~(col | d1 | d2);
        while (avail != 0) {
            long p = avail & -avail;       // Get lowest set bit
            avail &= (avail - 1);          // Micro-optimized: Clear lowest set bit
            
            positions[row] = Long.numberOfTrailingZeros(p);
            
            dfs(row + 1, n, col | p, (d1 | p) << 1, (d2 | p) >>> 1, mask, positions, rowStrings, results);
        }
    }
}