// Last updated: 11/08/2026, 16:16:32
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 1)
            return false;
        while (n % 4 == 0) {
            n = n / 4;
        }
       return n==1;
    }
}