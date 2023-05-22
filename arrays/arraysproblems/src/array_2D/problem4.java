package array_2D;

import java.util.Scanner;

public class problem4 {
    static void printArray(int arr[][]){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transpose(int arr[][],int r,int c){
        for (int i=0;i<r;i++){
            for (int j=i;j<c;j++){
                int temp[]=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    static void reverseArray(int arr[]){
        int i=0,j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void Turn(int arr[][],int n){
        //1 we transpose

        transpose(arr,n,n);

        //reverse
//        for (int i=0;i<n;i++) {
//            reverseArray(arr[i]);
//        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=sc.nextInt();
        System.out.println("Enter column size");
        int c=sc.nextInt();

        int arr[][]=new int[r][c];
        int totalElement=r*c;
        if(r==c) {

            System.out.println("Enter array element");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();
                }
                System.out.println();
            }


            System.out.println("Input Matrix");
            printArray(arr);

            Turn(arr, r);

            System.out.println("After rotation Matrix");
            printArray(arr);
        }
        else{
            System.out.println("wrong input");
            System.out.println("you have to give row and column equal");
        }
    }
}