// Last updated: 11/08/2026, 16:18:03
class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int prev2 = 0; // Max profit if we skip the previous house
        int prev1 = 0; // Max profit if we considered the previous house

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}