// Last updated: 24/08/2026, 09:29:35
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        
4        double currentSum = 0;
5        for (int i = 0; i < k; i++) {
6            currentSum += nums[i];
7        }
8        
9        double maxSum = currentSum;
10        
11        
12        for (int i = k; i < nums.length; i++) {
13            currentSum += nums[i] - nums[i - k];
14            maxSum = Math.max(maxSum, currentSum);
15        }
16        
17        
18        return maxSum / k;
19    }
20}