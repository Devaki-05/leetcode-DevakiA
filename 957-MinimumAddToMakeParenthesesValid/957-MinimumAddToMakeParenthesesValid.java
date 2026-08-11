// Last updated: 11/08/2026, 16:12:29
class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;  // Tracks unmatched '('
        int closeCount = 0; // Tracks unmatched ')'

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                // We found an opening parenthesis, increment the count
                openCount++;
            } else {
                // We found a closing parenthesis ')'
                if (openCount > 0) {
                    // It perfectly matches and closes a previous '('
                    openCount--;
                } else {
                    // No matching '(' exists, so we must add one later
                    closeCount++;
                }
            }
        }

        // The total additions needed will be the sum of all unmatched '(' and ')'
        return openCount + closeCount;
    }
}