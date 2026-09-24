// Last updated: 24/09/2026, 15:59:26
1import java.util.*;
2
3class RandomizedSet {
4    private List<Integer> list;
5    private Map<Integer, Integer> map;
6    private Random rand;
7
8    public RandomizedSet() {
9        list = new ArrayList<>();
10        map = new HashMap<>();
11        rand = new Random();
12    }
13
14    public boolean insert(int val) {
15        if (map.containsKey(val)) {
16            return false;
17        }
18        map.put(val, list.size());
19        list.add(val);
20        return true;
21    }
22
23    public boolean remove(int val) {
24        if (!map.containsKey(val)) {
25            return false;
26        }
27
28        int index = map.get(val);
29        int lastElement = list.get(list.size() - 1);
30
31        // Swap target element with the last element
32        list.set(index, lastElement);
33        map.put(lastElement, index);
34
35        // Remove the last element
36        list.remove(list.size() - 1);
37        map.remove(val);
38
39        return true;
40    }
41
42    public int getRandom() {
43        return list.get(rand.nextInt(list.size()));
44    }
45}