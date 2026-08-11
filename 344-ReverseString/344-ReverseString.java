// Last updated: 11/08/2026, 16:16:28
class Solution {
    public void reverseString(char[] s) {
       int start=0;
       int end = s.length-1;
       
       while(start<end){
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
       }
    }
}