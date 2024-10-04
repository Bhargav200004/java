import java.util.Arrays;
import java.util.List;

public class coinChange {

    private static int calls = 0;
    private static int sumFinder(List<Integer> coin , int sum , int idx , int [][]dp){

        calls++;

        if (dp[idx][sum] != -1) return dp[idx][sum];

        if (idx == 0){
            if (sum % coin.get(idx) == 0)
                return 1;
            else
                return 0;
        }

        int pick = 0;
        if (sum >= coin.get(idx)){
            pick = sumFinder(coin , sum - coin.get(idx) , idx , dp);
        }
        int not_pick = sumFinder(coin , sum , idx - 1 , dp);

        return dp[idx][sum] = pick + not_pick;
    }


    public static void main(String[] args) {
        List<Integer> coin = List.of(2,5,3 , 6);
        int totalSum = 10;
        int n = coin.size() ;
        int [][] dp = new int[n + 1][totalSum + 1 ];

        for (int i = 0 ; i <= totalSum ; i++){
            if (i % coin.get(0) == 0)
                dp[0][i] = 1;
            else
                dp[0][i] = 0;
        }

        for(int idx = 1 ; idx < n ; idx++){
            for (int sum = 0 ; sum <= totalSum ; sum++ ){
                int pick = 0;
                if (sum >= coin.get(idx)){
                    pick = dp[idx][sum - coin.get(idx)];
                }
                int not_pick = dp[idx - 1][sum];

                dp[idx][sum] = pick + not_pick;
            }
        }

        System.out.println(dp[n-1][totalSum]);
    }
}
