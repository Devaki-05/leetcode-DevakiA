// Last updated: 11/08/2026, 16:16:59
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0,ans;
        for(int i=0;i<n;i++){
          sum+=nums[i];
        }
       
        n=n*(n+1)/2;
        ans = n-sum;
        return(ans);
    }
}