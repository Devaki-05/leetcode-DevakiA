// Last updated: 24/09/2026, 16:02:55
1import java.util.*;
2
3class Solution {
4    public int[] topKFrequent(int[] nums, int k) {
5        
6        Map<Integer, Integer> countMap = new HashMap<>();
7        for (int num : nums) {
8            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
9        }
10
11        
12        List<Integer>[] buckets = new List[nums.length + 1];
13        for (int key : countMap.keySet()) {
14            int freq = countMap.get(key);
15            if (buckets[freq] == null) {
16                buckets[freq] = new ArrayList<>();
17            }
18            buckets[freq].add(key);
19        }
20
21        
22        int[] result = new int[k];
23        int index = 0;
24
25        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
26            if (buckets[i] != null) {
27                for (int num : buckets[i]) {
28                    result[index++] = num;
29                    if (index == k) {
30                        return result;
31                    }
32                }
33            }
34        }
35
36        return result;
37    }
38}