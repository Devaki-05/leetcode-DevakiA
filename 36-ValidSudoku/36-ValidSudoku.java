// Last updated: 24/09/2026, 15:58:49
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public boolean isValidSudoku(char[][] board) {
6        Set<String> seen = new HashSet<>();
7
8        for (int i = 0; i < 9; i++) {
9            for (int j = 0; j < 9; j++) {
10                char number = board[i][j];
11                
12                if (number != '.') {
13                    // Check row, column, and 3x3 sub-box
14                    if (!seen.add(number + " in row " + i) ||
15                        !seen.add(number + " in col " + j) ||
16                        !seen.add(number + " in box " + i / 3 + "-" + j / 3)) {
17                        return false;
18                    }
19                }
20            }
21        }
22
23        return true;
24    }
25}