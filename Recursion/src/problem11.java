public class problem11 {

    static int sum(int n ){
        if (n == 1) return 1;

        int sum = sum(n-1) + n;
        return sum;
    }

    public static void main(String[] args) {
        int sum = sum(5);

        System.out.println("Sum of 4 :- "+sum);
    }

}
