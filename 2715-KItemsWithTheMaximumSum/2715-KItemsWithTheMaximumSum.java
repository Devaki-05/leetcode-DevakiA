// Last updated: 11/08/2026, 16:11:04
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // First, take as many 1s as possible
        int takeOnes = Math.min(numOnes, k);
        k -= takeOnes;

        // Then, take zeros (they don't affect sum)
        int takeZeros = Math.min(numZeros, k);
        k -= takeZeros;

        // If still need more, we must take -1s
        int takeNegOnes = k; // whatever is left

        return takeOnes * 1 + takeZeros * 0 + takeNegOnes * -1;
    }
}
