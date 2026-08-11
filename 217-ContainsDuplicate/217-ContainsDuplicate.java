// Last updated: 11/08/2026, 16:17:30
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
               return true;
        }
    }
    return false;
}
}