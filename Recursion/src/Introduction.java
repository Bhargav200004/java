// write 1 to n ,natural number by the help of recursion

import java.util.Scanner;

public class Introduction {

    static void printIncrease(int n){
        if (n==1){                   //1                   //it helps to stop infinite recursion
                                                           // also known as halting condition
           System.out.println(n);
           return;
        }
        printIncrease(n-1); // 1,2,3,4,5,6,7,8..........,n-1;
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        printIncrease(n);
    }
}
