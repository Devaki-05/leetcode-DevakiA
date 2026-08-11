// Last updated: 11/08/2026, 16:16:06
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        
        return result;
    }
}