// Last updated: 11/08/2026, 16:11:34
class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int vowelsCount = 0;
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < mid; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                vowelsCount++;
            }
            if (vowels.indexOf(s.charAt(mid + i)) != -1) {
                vowelsCount--;
            }
        }
        
        return vowelsCount == 0;
    }
}