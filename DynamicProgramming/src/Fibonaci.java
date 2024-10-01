public class Fibonaci {

    static int count1 = 0;
    static int count2 = 0;
    static int fibo(int n ){
        if (n == 0 || n == 1) return 1;

        count1++;
        return fibo(n-1) + fibo(n-2);
    }

    static int fibo2(int n , int [] dp){
        if (n == 1 || n == 0) return 1;

        if (dp[n] != -1){
            return dp[n];
        }
        count2++;
        return dp[n] = fibo2(n-1 , dp) + fibo2(n-2 , dp);
    }

    public static void main(String[] args) {
        int n = 5;
        int [] dp = new int[n + 1];
        for (int i = 0  ; i <= n ; i++){
            dp[i] = -1;
        }
//        System.out.println(fibo(n));
        System.out.println(fibo2(n , dp));
//        System.out.println("recursive call without dp : "+count1);
        System.out.println("recursive call with dp : "+count2);
    }
}
