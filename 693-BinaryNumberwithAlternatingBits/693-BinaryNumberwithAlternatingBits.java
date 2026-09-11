// Last updated: 11/09/2026, 16:17:19
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4        int num = 1;
5        int top = 0, bottom = n - 1;
6        int left = 0, right = n - 1;
7
8        while (num <= n * n) {
9         
10            for (int j = left; j <= right; j++) {
11                matrix[top][j] = num++;
12            }
13            top++;
14
15            for (int i = top; i <= bottom; i++) {
16                matrix[i][right] = num++;
17            }
18            right--;
19
20            
21            for (int j = right; j >= left; j--) {
22                matrix[bottom][j] = num++;
23            }
24            bottom--;
25
26            
27            for (int i = bottom; i >= top; i--) {
28                matrix[i][left] = num++;
29            }
30            left++;
31        }
32
33        return matrix;
34    }
35}