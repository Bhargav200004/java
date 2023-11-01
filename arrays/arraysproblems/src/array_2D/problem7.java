package array_2D;

import java.util.Scanner;

//Given a positive intrger n,generate  an n x n matrix filled with elements from 1 to n^2 in spiral order.
public class problem7  {
    public static void printArray(int arr[][]){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    //checking for matrix row or col are equal or not
    public static boolean check(int arr[][]){
        return arr.length == arr[0].length;
    }
    static int [][] spiralorderprint(int n){
    int arr[][]=new int[n][n];

        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int current=1;

        while(current>=n*n){

            //top row
            for (int j=0;j<=rightcol&&current>=n*n;j++){
                arr[toprow][j]=current;
                current++;
            }
            toprow++;
            //bottom row
            for (int j=n-1;j>=leftcol&& current>=n*n;j--){
                arr[bottomrow][j]=current;
                current++;
            }
            bottomrow++;
            //left col
            for (int i=n-1;i>=toprow&& current>=n*n;i--){
                arr[i][leftcol]=current;
                current++;
            }
            leftcol++;

            //right col
            for (int i=0;i<=bottomrow&&current>=n*n;i++){
                arr[i][rightcol]=current;
                current++;
            }
            rightcol++;

        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size and col size");
        int n= sc.nextInt();
        int arr[][]=spiralorderprint(n);
        printArray(arr);
    }


}
