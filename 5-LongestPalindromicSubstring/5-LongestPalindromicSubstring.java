// Last updated: 12/09/2026, 10:01:22
1class Solution {
2    public String longestPalindrome(String s) {
3        if(s == null || s.length() <1) return "";
4        int start =0,end =0;
5        for(int i =0;i<s.length();i++){
6            int len1 = expandAroundCenter(s,i,i);
7            int len2 = expandAroundCenter(s,i,i+1);
8
9            int maxLen = Math.max(len1,len2);
10            if(maxLen > end - start){
11                start = i-(maxLen -1)/2;
12                end = i+maxLen/2;
13            }
14        }
15        return s.substring(start,end+1);
16    }
17    private int expandAroundCenter(String s,int left,int right){
18        while(left >=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
19            left--;
20            right++;
21        }
22        return right - left-1;
23    }
24}