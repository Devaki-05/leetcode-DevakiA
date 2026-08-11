// Last updated: 11/08/2026, 16:11:03
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int maxLen = 0;
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int zeros = 0;
            int ones = 0;
            
            while (i < n && s.charAt(i) == '0') {
                zeros++;
                i++;
            }
            
            while (i < n && s.charAt(i) == '1') {
                ones++;
                i++;
            }
            
            maxLen = Math.max(maxLen, Math.min(zeros, ones) * 2);
        }
        
        return maxLen;
    }
}