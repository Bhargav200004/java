public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibonaci(3));
    }

    static int fibonaci(int n) {
        if(n == 0 || n == 1) return n;
        int firstNumber = fibonaci(n-1);
        int secondNumber = fibonaci(n - 2);

        return  firstNumber + secondNumber ;
    }
}
