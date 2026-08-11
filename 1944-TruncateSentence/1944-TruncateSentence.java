// Last updated: 11/08/2026, 16:11:33
class Solution {
    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k--;
                if (k == 0) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}