public class mazePath {


    private static long maze(int startingRow, int startingColumn, int endingRow, int endingColumn) {
        if (startingRow > endingRow || startingColumn > endingColumn) return 0;
        if (startingRow == endingRow && startingColumn == endingColumn)  return 1;
        long RightWays = maze(startingRow+1 , startingColumn , endingRow , endingColumn);
        long DownWays = maze(startingRow , startingColumn+1 , endingRow , endingColumn);
        long totalWays = RightWays + DownWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        long count = maze(1, 1, row, col);
        System.out.println(count);
    }
}
