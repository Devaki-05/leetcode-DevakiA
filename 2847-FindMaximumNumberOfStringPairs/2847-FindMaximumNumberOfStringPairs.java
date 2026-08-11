// Last updated: 11/08/2026, 16:10:56
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> seen = new HashSet<>();
        int pairs = 0;
        
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (seen.contains(reversed)) {
                pairs++;
            } else {
                seen.add(word);
            }
        }
        
        return pairs;
    }
}