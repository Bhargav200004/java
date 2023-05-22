package array_2D;

//Transpose of matrix
//Write a program to display transpose of matrix entered by the user.

import java.util.Scanner;

public class problem3 {
    static void PrintArray(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Transpose(int arr[][],int r,int c){
        int tran[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                tran[i][j]=arr[j][i];
            }
        }
        PrintArray(tran);
    }

    static void  TransposeInPlace(int arr[][],int r,int c){
        for (int i=0;i<r;i++){
            for(int j=i;j<c;j++){
                //matrix swap
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        PrintArray(arr);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=sc.nextInt();
        System.out.println("Enter column size");
        int c=sc.nextInt();

        int arr[][]=new int [r][c];
        System.out.println("Enter arr element");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Your arr is");
        PrintArray(arr);

        System.out.println("After transpose");
        Transpose(arr,r,c);

        System.out.println("After transpose alternative method");
        TransposeInPlace(arr,r,c);

    }
}
