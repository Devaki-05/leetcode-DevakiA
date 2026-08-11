// Last updated: 11/08/2026, 16:13:00
import java.util.*;

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> fractions = new ArrayList<>();

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                fractions.add(new int[]{arr[i], arr[j]});
            }
        }

        
        Collections.sort(fractions, (a, b) -> a[0] * b[1] - b[0] * a[1]);

        
        return fractions.get(k - 1);
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1, 2, 3, 5};
        int k = 3;
        int[] result = sol.kthSmallestPrimeFraction(arr, k);
        System.out.println("Result: " + result[0] + "/" + result[1]);
    }
}
