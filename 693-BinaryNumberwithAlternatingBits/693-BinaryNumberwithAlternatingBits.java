// Last updated: 11/09/2026, 16:09:51
1import java.util.ArrayList;
2import java.util.Collections;
3import java.util.HashMap;
4import java.util.List;
5import java.util.Map;
6
7class Solution {
8    public List<List<Integer>> findWinners(int[][] matches) {
9        Map<Integer, Integer> lossCount = new HashMap<>();
10
11        for (int[] match : matches) {
12            int winner = match[0];
13            int loser = match[1];
14
15            lossCount.putIfAbsent(winner, 0);
16            lossCount.put(loser, lossCount.getOrDefault(loser, 0) + 1);
17        }
18
19        List<Integer> zeroLoss = new ArrayList<>();
20        List<Integer> oneLoss = new ArrayList<>();
21
22        for (Map.Entry<Integer, Integer> entry : lossCount.entrySet()) {
23            int player = entry.getKey();
24            int losses = entry.getValue();
25
26            if (losses == 0) {
27                zeroLoss.add(player);
28            } else if (losses == 1) {
29                oneLoss.add(player);
30            }
31        }
32
33        Collections.sort(zeroLoss);
34        Collections.sort(oneLoss);
35
36        List<List<Integer>> result = new ArrayList<>();
37        result.add(zeroLoss);
38        result.add(oneLoss);
39
40        return result;
41    }
42}
43