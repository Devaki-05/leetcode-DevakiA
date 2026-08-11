// Last updated: 11/08/2026, 16:11:50
class Solution {
    public int maxPower(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int maxCount = 1;
        int currentCount = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 1; // Reset count for the new character
            }
        }
        
        // Final check in case the longest sequence ends at the last character
        return Math.max(maxCount, currentCount);
    }
}