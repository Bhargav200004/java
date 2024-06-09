public class nQueen {

    public static void main(String[] args) {
        int n = 4;
        char [][] board = new char[n][n];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        nqueen(board , 0);
    }

    private static void nqueen(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0 ; i < n ; i++){
                for (int j = 0 ; j < n ; j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int j = 0 ; j < n ; j++){
            //If the space is safe then we insert
            if (isSafe(board , row , j)){
                board[row][j] = 'Q';
                nqueen(board , row + 1);
                //BackTracking
                board[row][j] = 'X';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        //checking the row already have queen or not
        for (int j = 0 ; j < n ; j++) {
            if (board[row][j] == 'Q') return false;
        }
        //checking the col already have queen or not
        for (int i = 0 ; i < n ; i++){
            if (board[i][col] == 'Q') return false;
        }

        int i = row ;
        int j = col;

        //checking for the north East
        while (i < n && j >= 0){

            if (board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        i = row ;
        j =col;

        //checking for the South East

        while (i < n && j < n){

            if (board[i][j] == 'Q') return false;
            i++;
            j++;
        }

        i = row ;
        j =col;
        //checking for South-West

        while (i >=0 && j < n){
            if (board[i][j] == 'Q')return false;
            i--;
            j++;
        }

        i = row ;
        j =col;
        //checking for the North-West

        while (i >= 0 && j >= 0){
            if (board[i][j] == 'Q') return false;
            i--;
            j--;
        }

        return true;
    }
}
