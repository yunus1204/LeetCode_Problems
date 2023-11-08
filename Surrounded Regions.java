class Solution {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }
            if (board[i][col - 1] == 'O') {
                dfs(board, i, col - 1);
            }
        }

        for (int j = 0; j < col; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }
            if (board[row - 1][j] == 'O') {
                dfs(board, row - 1, j);
            }
        }

        for (int p = 0; p < row; p++) {
            for (int q = 0; q < col; q++) {
                if (board[p][q] == 'O') {
                    board[p][q] = 'X';
                } else if (board[p][q] == 'Y') {
                    board[p][q] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;

        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == 'X' || board[i][j] == 'Y') {
            return;
        }

        board[i][j] = 'Y';

        // Recursively traverse in all four directions
        dfs(board, i - 1, j); // Up
        dfs(board, i + 1, j); // Down
        dfs(board, i, j + 1); // Right
        dfs(board, i, j - 1); // Left
    }
}
