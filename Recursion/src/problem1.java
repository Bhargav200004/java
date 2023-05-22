//finding 5 factorial

import java.util.Scanner;

public class problem1 {
    static long  Factorial(long n){
        if(n==0) return 1;                                     //first we do base case
        long small=Factorial(n-1);                            //recursive work
        // self work
        return n*small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int n=sc.nextInt();
        System.out.println("factorial of "+ n +" is "+Factorial(n));

    }
}
