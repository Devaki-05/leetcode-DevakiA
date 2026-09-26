// Last updated: 26/09/2026, 20:43:09
1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sumSource =0;
4        long sumTarget =0;
5
6        for(int val :source){
7            sumSource +=val;
8        }
9
10        for(int val :target){
11            sumTarget +=val;
12        }
13        return sumSource ==sumTarget;
14    }
15}