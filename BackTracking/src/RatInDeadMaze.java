public class RatInDeadMaze {

    static void print(int sr, int sc, int er, int ec, String s, int[][] maze) {

        if (sr > er || sc > ec) return;
        if (sr < 0 || sc < 0) return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0) return;

        if (maze[sr] [sc] == 2) return;

        maze[sr][sc] = 2;
        //for Downward
        print(sr + 1, sc, er, ec, s + "D", maze);

        // for Right
        print(sr, sc + 1, er, ec, s + "R", maze);

        //For Upward
        print(sr - 1, sc, er, ec, s + "U", maze);


        //for left
        print(sr , sc - 1, er, ec, s + "L", maze);

        maze[sr][sc] = 1;
    }

    public static void main(String[] args) {
        int endRow = 4;
        int endCol = 4;

        int[][] maze = {
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 1, 0, 1}};

        print(0, 0, endRow - 1, endCol - 1, "", maze);
    }


}
