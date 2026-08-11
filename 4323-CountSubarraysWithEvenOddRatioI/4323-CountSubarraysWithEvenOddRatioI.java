// Last updated: 11/08/2026, 16:10:30
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int c=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            long e = 0;
            long o=0;
            for(int j=i;j<n;j++){
                if(nums[j]%2 ==0){
                    e++;
                }else{
                    o++;
                }
                if(o>0 &&(long) b*e<=(long) a*o){
                    c++;
                }
            }
        }
        return c;
    }
}