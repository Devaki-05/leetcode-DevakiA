// Last updated: 11/08/2026, 16:16:12
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}