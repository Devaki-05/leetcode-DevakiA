// Last updated: 24/09/2026, 15:56:51
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
6        Map<Integer, Integer> map = new HashMap<>();
7        int count = 0;
8
9        
10        for (int a : nums1) {
11            for (int b : nums2) {
12                int sum = a + b;
13                map.put(sum, map.getOrDefault(sum, 0) + 1);
14            }
15        }
16
17        
18        for (int c : nums3) {
19            for (int d : nums4) {
20                int target = -(c + d);
21                count += map.getOrDefault(target, 0);
22            }
23        }
24
25        return count;
26    }
27}