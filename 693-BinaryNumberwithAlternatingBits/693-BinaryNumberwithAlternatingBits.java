// Last updated: 11/09/2026, 15:59:04
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int x = n^(n>>1);
4        return (x &(x+1))==0;
5    }
6}