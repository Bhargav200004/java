import java.util.List;

public class KnapSnack0_1 {

    private static int maximumProfit(int idx , int W , List<Integer> profit , List<Integer> weight){
        if (idx == 0){
            if ( weight.get(idx) <= W)
                return profit.get(idx);
            else
                return 0;
        }

        int pick = 0 ;
        if (W >= weight.get(idx)){
            pick = profit.get(idx) + maximumProfit(idx - 1, W - weight.get(idx) , profit , weight);
        }
        int notPick = maximumProfit(idx - 1 , W , profit , weight);

        return Math.max(pick , notPick);
    }

    public static void main(String[] args) {
        List<Integer> profit = List.of(1,2,3);
        List<Integer> weight = List.of(4,5,1);
        int Wt = 4;
        int n = profit.size();

        int [][] dp = new int[n + 1][Wt + 1];

        for (int i = 0 ; i <= Wt ; i++){
            if ( weight.get(0) <= i)
                 dp[0][i] = profit.get(0);
            else
                dp[0][i] = 0 ;
        }

        for (int idx = 1 ; idx < n ; idx++){
            for (int W = 0 ; W <= Wt ; W++){
                int pick = 0 ;
                if (W >= weight.get(idx)){
                    pick = profit.get(idx) + dp[idx - 1][W - weight.get(idx)];
                }
                int notPick = dp[idx - 1][W];

                dp[idx][W] =  Math.max(pick , notPick);
            }
        }


//        System.out.println(maximumProfit(n - 1 , Wt , profit, weight));
        System.out.println(dp[n - 1][Wt]);
    }
}
