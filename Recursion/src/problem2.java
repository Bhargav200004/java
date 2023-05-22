//Fibonaccia series

import java.util.Scanner;

public class problem2 {
    static int fibonacci(int n){
        //base case
        if (n==0 || n==1){
            return n;
        }
        //sub problem
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        for (int i=0;i<=n;i++) {
            System.out.println("fibonacci number is "+i+ "  " +fibonacci(i));
        }
    }
}
