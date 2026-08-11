// Last updated: 11/08/2026, 16:13:39
class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Check by skipping left
                if (check(s, left + 1, right)) return true;
                // Check by skipping right
                if (check(s, left, right - 1)) return true;
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean check(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}