// Last updated: 11/09/2026, 16:27:33
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int lengthOfLongestSubstring(String s) {
6        Map<Character, Integer> charIndexMap = new HashMap<>();
7        int maxLen = 0;
8        int left = 0;
9
10        for (int right = 0; right < s.length(); right++) {
11            char currentChar = s.charAt(right);
12
13            if (charIndexMap.containsKey(currentChar)) {
14               
15                left = Math.max(left, charIndexMap.get(currentChar) + 1);
16            }
17
18            charIndexMap.put(currentChar, right);
19            maxLen = Math.max(maxLen, right - left + 1);
20        }
21
22        return maxLen;
23    }
24}