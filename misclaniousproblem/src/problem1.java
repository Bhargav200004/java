//swaping two number with temprary

import java.util.Scanner;

public class problem1 {
    static void swap(int a,int b){
        //before swapping the value
        System.out.println("before swaping the number ");
        System.out.println("a "+a);
        System.out.println("b "+b);
        int t=a; //storing the value in temperary file
        a=b;
        b=t;

        //after swaping the value.
        System.out.println("before swaping the number ");
        System.out.println("a "+a);
        System.out.println("b "+b);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int x=sc.nextInt();
        System.out.println("Enter your second number ");
        int y=sc.nextInt();

        swap(x,y);
    }

}
