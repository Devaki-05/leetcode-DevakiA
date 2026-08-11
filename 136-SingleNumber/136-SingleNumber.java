// Last updated: 11/08/2026, 16:19:08
class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}