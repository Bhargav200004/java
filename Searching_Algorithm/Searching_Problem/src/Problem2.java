public class Problem2 {

    static int sqrt(int n){
        int start = 0 , end = n;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            long val = (long) mid * mid;
            if (val == n){
                return mid;
            }
            else if (val < n){
                ans = mid;
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int n = 65;
        System.out.println(sqrt(n));

    }
}
