// Last updated: 11/08/2026, 16:20:25
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Find an empty cell
                if (board[i][j] == '.') {
                    // Try placing digits from '1' to '9'
                    for (char c = '1'; c <= '9'; c++) {
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c; // Tentatively place the character

                            // Recursively try to solve the rest of the board
                            if (solve(board)) {
                                return true; 
                            }
                            
                            board[i][j] = '.'; // Backtrack if it doesn't lead to a solution
                        }
                    }
                    return false; // If no digit fits, this path is dead
                }
            }
        }
        return true; // Entire board is successfully filled
    }

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check row
            if (board[row][i] == c) return false;
            
            // Check column
            if (board[i][col] == c) return false;
            
            // Check 3x3 sub-box
            // Row index for sub-box: 3 * (row / 3) + i / 3
            // Col index for sub-box: 3 * (col / 3) + i % 3
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}