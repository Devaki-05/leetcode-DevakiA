// Last updated: 11/09/2026, 16:11:41
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public List<Integer> spiralOrder(int[][] matrix) {
6        List<Integer> result = new ArrayList<>();
7        if (matrix == null || matrix.length == 0) return result;
8
9        int top = 0;
10        int bottom = matrix.length - 1;
11        int left = 0;
12        int right = matrix[0].length - 1;
13
14        while (top <= bottom && left <= right) {
15            // Traverse Right
16            for (int j = left; j <= right; j++) {
17                result.add(matrix[top][j]);
18            }
19            top++;
20
21            // Traverse Down
22            for (int i = top; i <= bottom; i++) {
23                result.add(matrix[i][right]);
24            }
25            right--;
26
27            // Traverse Left
28            if (top <= bottom) {
29                for (int j = right; j >= left; j--) {
30                    result.add(matrix[bottom][j]);
31                }
32                bottom--;
33            }
34
35            // Traverse Up
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    result.add(matrix[i][left]);
39                }
40                left++;
41            }
42        }
43
44        return result;
45    }
46}