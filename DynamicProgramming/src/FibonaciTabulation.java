public class FibonaciTabulation {
    public static void main(String[] args) {
        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 2 ; i < 10 ; i++){
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        System.out.println(current);
    }
}
