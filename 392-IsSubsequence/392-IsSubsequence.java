// Last updated: 11/08/2026, 16:16:03
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        int index =0;
        for(char c:t.toCharArray()){
                if(c==s.charAt(index)){
                    index++;
                }
            if(index ==s.length()){
                return true;
            }
        }
        return false;
    }
}