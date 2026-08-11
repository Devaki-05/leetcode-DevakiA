// Last updated: 11/08/2026, 16:12:43
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        
        int prev = -100000; 
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }
        
        prev = 100000;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        
        return ans;
    }
}



