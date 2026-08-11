// Last updated: 11/08/2026, 16:18:48
class Solution {
    public int majorityElement(int[] nums) {
        int t =0,c=0;
        for(int i =0;i<nums.length;i++){
            if(c==0)
            t=nums[i];
            if(t==nums[i])
            c++;
            else
            c--;
        }
        return t;
    }
}