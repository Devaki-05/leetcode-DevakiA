// Last updated: 11/08/2026, 16:13:30
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        
        String result = "";
        
        for (String word : words) {
            
            if (word.length() < result.length() || 
               (word.length() == result.length() && word.compareTo(result) >= 0)) {
                continue;
            }
            
            boolean isValid = true;
            
            for (int i = 1; i < word.length(); i++) {
                if (!wordSet.contains(word.substring(0, i))) {
                    isValid = false;
                    break;
                }
            }
            
           
            if (isValid) {
                result = word;
            }
        }
        
        return result;
    }
}