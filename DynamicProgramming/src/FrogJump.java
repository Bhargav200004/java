import java.util.Arrays;
import java.util.List;

public class FrogJump {

    private static int  calls = 0;
    private static int rec(int idx , List<Integer> heights , int k , int [] dp){
        calls++;
        if (idx == 0) return 0;

        if (dp[idx] != -1) return dp[idx];

        int minCost = Integer.MAX_VALUE;
        for (int i = 1 ; i <= k ; i++){
            if (idx - i >= 0) {
                int jump = Math.abs(heights.get(idx) - heights.get(idx - i)) + rec(idx - i, heights, k , dp);
                minCost = Math.min(minCost, jump);
            }
        }
        return dp[idx] = minCost;
    }

    public static void main(String[] args) {
        List<Integer> heights = List.of(10 , 30 ,40 , 50 , 20);
        int n = 5;
        int k = 3;

        int [] dp = new int[n];
        Arrays.fill(dp , -1);

        System.out.println(rec(n - 1 , heights , k , dp));
        System.out.println(calls);
    }
}
