// Last updated: 24/08/2026, 09:23:15
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n = nums.length;
4        int[] result = new int[n];
5        
6        int left = 0;
7        int right = n - 1;
8        int index = n - 1;
9        
10
11        while (left <= right) {
12            int leftSquare = nums[left] * nums[left];
13            int rightSquare = nums[right] * nums[right];
14            
15            if (leftSquare > rightSquare) {
16                result[index] = leftSquare;
17                left++;
18            } else {
19                result[index] = rightSquare;
20                right--;
21            }
22            index--;
23        }
24        
25        return result;
26    }
27}