// Last updated: 11/08/2026, 16:10:48
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagSq = 0;
        int maxArea = 0;
        
        for (int[] rectangle : dimensions) {
            int length = rectangle[0];
            int width = rectangle[1];
            
            int diagSq = length * length + width * width;
            int area = length * width;
            
            if (diagSq > maxDiagSq || (diagSq == maxDiagSq && area > maxArea)) {
                maxDiagSq = diagSq;
                maxArea = area;
            }
        }
        
        return maxArea;
    }
}