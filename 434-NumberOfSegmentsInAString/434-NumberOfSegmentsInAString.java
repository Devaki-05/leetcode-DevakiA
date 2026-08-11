// Last updated: 11/08/2026, 16:15:46
class Solution {
    public int countSegments(String s) {
        
        s = s.trim();
        
        if (s.isEmpty()) {
            return 0;
        }
        
    
        return s.split("\\s+").length;
    }
}