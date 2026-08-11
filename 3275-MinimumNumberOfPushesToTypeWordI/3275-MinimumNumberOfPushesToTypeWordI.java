// Last updated: 11/08/2026, 16:10:47
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int pushes = 0;
        
        for (int i = 0; i < n; i++) {
            pushes += (i / 8) + 1;
        }
        
        return pushes;
    }
}