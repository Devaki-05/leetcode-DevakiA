// Last updated: 11/08/2026, 16:11:24
class Solution {
    public boolean isThree(int n) {
        int root = (int)Math.sqrt(n);
        if (root * root != n) return false; // must be a perfect square
        return isPrime(root);
    }

    private boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
