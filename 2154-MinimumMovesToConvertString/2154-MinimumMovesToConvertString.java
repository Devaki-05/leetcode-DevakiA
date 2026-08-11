// Last updated: 11/08/2026, 16:11:24
class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3; // Convert 3 consecutive characters starting at i
            } else {
                i++; // Skip 'O'
            }
        }
        
        return moves;
    }
}