// Last updated: 11/08/2026, 16:10:49
class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Step 1: Count how many times each number appears
        int[] frequencyMap = new int[101];
        for (int num : nums) {
            frequencyMap[num]++;
        }
        
        // Step 2: Find the maximum frequency
        int maxFrequency = 0;
        for (int freq : frequencyMap) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }
        
        // Step 3: Add up all the frequencies that match the maximum frequency
        int totalElements = 0;
        for (int freq : frequencyMap) {
            if (freq == maxFrequency) {
                totalElements += freq;
            }
        }
        
        return totalElements;
    }
}