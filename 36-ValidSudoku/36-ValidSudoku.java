// Last updated: 24/09/2026, 16:00:22
1import java.util.HashMap;
2import java.util.Map;
3import java.util.PriorityQueue;
4
5class Solution {
6    public int[] topKFrequent(int[] nums, int k) {
7        // Step 1: Count element frequencies
8        Map<Integer, Integer> countMap = new HashMap<>();
9        for (int num : nums) {
10            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
11        }
12
13        // Step 2: Min-heap to keep the top k frequent elements
14        PriorityQueue<Integer> heap = new PriorityQueue<>(
15            (a, b) -> countMap.get(a) - countMap.get(b)
16        );
17
18        for (int num : countMap.keySet()) {
19            heap.add(num);
20            if (heap.size() > k) {
21                heap.poll();
22            }
23        }
24
25        // Step 3: Build the result array from the heap
26        int[] result = new int[k];
27        for (int i = 0; i < k; i++) {
28            result[i] = heap.poll();
29        }
30
31        return result;
32    }
33}