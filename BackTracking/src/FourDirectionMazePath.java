public class FourDirectionMazePath {

    private static void print(int startingRow, int startingColumn, int endingRow, int endingColumn , String s, boolean[][] isVisited) {
        // Base case
        if ( startingRow < 0 || startingColumn < 0) return;
        if (startingRow > endingRow || startingColumn > endingColumn) return;
        if (isVisited[startingRow][startingColumn]) return;
        if (startingRow == endingRow && startingColumn == endingColumn){
            System.out.println(s);
            return;
        }

        isVisited[startingRow][startingColumn] = true;
        //go down
        print(startingRow+1 , startingColumn , endingRow , endingColumn , s + "D", isVisited);

        //go right
        print(startingRow , startingColumn+1 , endingRow , endingColumn , s + "R", isVisited);

        //go up
        print(startingRow-1 , startingColumn , endingRow , endingColumn , s + "U", isVisited);

        //go left
        print(startingRow , startingColumn-1 , endingRow , endingColumn , s + "L", isVisited);

        //BackTracking
        isVisited[startingRow][startingColumn] = false;
    }



    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        boolean[][] isVisited = new boolean[row][col];
        print(0, 0, row-1, col-1 , "" , isVisited);
    }
}
