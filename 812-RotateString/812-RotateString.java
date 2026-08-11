// Last updated: 11/08/2026, 16:12:55
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String d=s+s;
        return d.contains(goal);
    }
}