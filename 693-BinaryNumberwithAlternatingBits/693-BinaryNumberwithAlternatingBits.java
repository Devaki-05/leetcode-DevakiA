// Last updated: 11/09/2026, 16:26:10
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int s=nums[0];
4        int f = nums[0];
5
6        do{
7            s = nums[s];
8            f = nums[nums[f]];
9        }while(s !=f);
10
11        s = nums[0];
12        while(s != f){
13            s = nums[s];
14            f = nums[f];
15        }
16        return s;
17    }
18}