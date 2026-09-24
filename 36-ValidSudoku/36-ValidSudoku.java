// Last updated: 24/09/2026, 16:07:09
1import java.util.Arrays;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        int n = nums.length;
6        long[] pos = new long[n];
7        long MOD = 1_000_000_007;
8
9       
10        for (int i = 0; i < n; i++) {
11            if (s.charAt(i) == 'R') {
12                pos[i] = (long) nums[i] + d;
13            } else {
14                pos[i] = (long) nums[i] - d;
15            }
16        }
17
18        
19        Arrays.sort(pos);
20
21        
22        long totalDistance = 0;
23        for (int i = 0; i < n; i++) {
24            
25            
26            long contribution = (i * pos[i] - (n - 1 - i) * pos[i]) % MOD;
27            totalDistance = (totalDistance + contribution) % MOD;
28        }
29
30        return (int) ((totalDistance + MOD) % MOD);
31    }
32}