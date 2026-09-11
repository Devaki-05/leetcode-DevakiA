// Last updated: 11/09/2026, 09:54:49
1class Solution {
2    public int hammingDistance(int x, int y) {
3        return Integer.bitCount(x^y);
4    }
5}