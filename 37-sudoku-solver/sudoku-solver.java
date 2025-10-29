class Solution {
    public static void printboard(char[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j]+",");
            }
            System.out.println();
        }
    }
    public static boolean issafe(char[][] board,int row,int col,int digit){
        char ch = (char)(digit + '0'); 
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }
        return true;
    }

    public boolean sudokusolver(char[][] board,int row,int col){
        if(row==9) return true;
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(board[row][col]!='.'){
            return sudokusolver(board,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(board,row,col,digit)){
                board[row][col]=(char)(digit+'0');
                if(sudokusolver(board,nextrow,nextcol)){
                    return true;
                }
                board[row][col]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        if(sudokusolver(board,0,0)){
            printboard(board);
        }
    }
}