import java.util.Arrays;

public class robHouseProblem {

    static int calls = 0;

    private static int rob(int [] houses , int idx , int [] dp){

        calls++;
        if (idx == houses.length - 1)
            return houses[idx];

        if (idx >= houses.length)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];


        int pick = houses[idx] + rob(houses , idx + 2 , dp);
        int not_pick = rob(houses , idx+1 , dp);

        return dp[idx] = Math.max(pick , not_pick);
    }

    public static void main(String[] args) {
        int [] houses = {10 , 0 , 0, 2 , 9 , 35 };
        int [] dp = new int[houses.length];
        Arrays.fill(dp, -1);
        System.out.println(rob(houses , 0,dp));
        System.out.println(calls);
    }
}
