class Solution {

    public static boolean issafe(char[][] board, int row, int col) {
     
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

    
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

       
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void nQueens(char[][] board, int row, List<List<String>> result) {
        if (row == board.length) {
            result.add(construct(board)); 
            return;
        }

        
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';           
                nQueens(board, row + 1, result); 
                board[row][j] = '.';           
            }
        }
    }


    public static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        List<List<String>> result = new ArrayList<>();
        nQueens(board, 0, result);
        return result;
    }
}
