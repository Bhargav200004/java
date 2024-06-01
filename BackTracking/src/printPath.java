public class printPath {
    public static void main(String[] args) {
        int row = 300;
        int col = 300;
        print(1, 1, row, col , "");
    }

    private static void print(int startingRow, int startingColumn, int endingRow, int endingColumn , String s) {
        // Base case
        if (startingRow > endingRow || startingColumn > endingColumn) return;
        if (startingRow == endingRow && startingColumn == endingColumn){
            System.out.println(s);
            return;
        }

        //go down
        print(startingRow+1 , startingColumn , endingRow , endingColumn , s + "D");

        //go right
        print(startingRow , startingColumn+1 , endingRow , endingColumn , s + "R");
    }
}
