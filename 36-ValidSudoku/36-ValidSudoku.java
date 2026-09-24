// Last updated: 24/09/2026, 16:04:34
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int maxVal = 0;
4        int sumVal = 0;
5
6        for (int num : nums) {
7            maxVal = Math.max(maxVal, num);
8            sumVal += num;
9        }
10
11        int left = maxVal;
12        int right = sumVal;
13
14        while (left < right) {
15            int mid = left + (right - left) / 2;
16
17            if (canSplit(nums, k, mid)) {
18                right = mid; 
19            } else {
20                left = mid + 1; 
21            }
22        }
23
24        return left;
25    }
26
27    private boolean canSplit(int[] nums, int k, int maxSum) {
28        int currentSum = 0;
29        int count = 1; 
30
31        for (int num : nums) {
32            if (currentSum + num > maxSum) {
33                count++;
34                currentSum = num;
35                if (count > k) {
36                    return false;
37                }
38            } else {
39                currentSum += num;
40            }
41        }
42
43        return true;
44    }
45}