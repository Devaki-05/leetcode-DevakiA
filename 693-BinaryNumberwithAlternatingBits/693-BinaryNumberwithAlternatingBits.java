// Last updated: 11/09/2026, 16:20:15
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[]res = new int[n];
5
6        res[0]=1;
7        for(int i=1;i<n;i++){
8            res[i]=res[i-1]*nums[i-1];
9        }
10        int suffix =1;
11        for(int i =n-1;i>=0;i--){
12            res[i]*=suffix;
13            suffix *=nums[i];
14        }
15        return res;
16    }
17}