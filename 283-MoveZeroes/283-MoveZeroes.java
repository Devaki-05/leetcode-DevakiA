// Last updated: 11/08/2026, 16:16:50
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // pointer for placing non-zero elements
        
        // Step 1: Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        
        // Step 2: Fill remaining positions with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
