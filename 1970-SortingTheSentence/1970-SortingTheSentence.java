// Last updated: 11/08/2026, 16:11:29
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        
        for (String word : words) {
            int index = word.charAt(word.length() - 1) - '1';
            ans[index] = word.substring(0, word.length() - 1);
        }
        
        return String.join(" ", ans);
    }
}