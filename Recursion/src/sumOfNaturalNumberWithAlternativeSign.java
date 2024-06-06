public class sumOfNaturalNumberWithAlternativeSign {

    static int naturalNumber(int n){
        if (n == 1) return 1;

        if (n % 2 == 0) return naturalNumber(n -1 ) - n;
        else return naturalNumber(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(naturalNumber(5 ));
    }
}
