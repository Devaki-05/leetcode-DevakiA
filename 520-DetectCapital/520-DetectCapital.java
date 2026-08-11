// Last updated: 11/08/2026, 16:15:06
class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            }
        }
        

        if (uppercaseCount == word.length()) {
            return true;
        }
        
      
        if (uppercaseCount == 0) {
            return true;
        }
        
       
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }
        
       
        return false;
    }
}