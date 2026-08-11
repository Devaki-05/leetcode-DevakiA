// Last updated: 11/08/2026, 16:18:50
class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
              
                right = mid;
            } else {
               
                left = mid + 1;
            }
        }

        return left; 
    }
}
