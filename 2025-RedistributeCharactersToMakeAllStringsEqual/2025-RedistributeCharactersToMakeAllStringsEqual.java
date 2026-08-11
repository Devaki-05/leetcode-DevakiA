// Last updated: 11/08/2026, 16:11:56
class Solution {
    public boolean makeEqual(String[] words) {
        int[] counts = new int[26];
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                counts[word.charAt(i) - 'a']++;
            }
        }
        
        int n = words.length;
        for (int count : counts) {
            if (count % n != 0) {
                return false;
            }
        }
        
        return true;
    }
}