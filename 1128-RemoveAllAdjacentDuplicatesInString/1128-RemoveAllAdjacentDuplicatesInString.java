// Last updated: 11/08/2026, 16:12:20
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            int size = sb.length();
            
            // If the stack is not empty and the current character 
            // matches the last character in the stack, remove it.
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            } else {
                // Otherwise, push the current character onto the stack.
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}