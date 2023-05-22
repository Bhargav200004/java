package javalloop;

import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]){
    Scanner A = new Scanner(System.in);
    int a=A.nextInt();


    for(int i=1;i<=a;i++){
        for(int j=1; j<=a-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");

        }System.out.println();
    }

}}
