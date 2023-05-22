package array_2D;

import java.util.Scanner;

public class problem8 {
    static void PrintArray(int arr[][]){
        for(int i=0;i <  arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print( arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int sumArray(int arr[][],int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for (int j=r1;j<= r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }

    static void prefixsum(int [][]arr){
        int r=arr.length;
        int c=arr[0].length;

        //traverse through horizontal to calculate row wise prefix sum
        for (int i=0;i<r;i++){
            for (int j=1; j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static int sumArray2(int arr[][],int l1,int r1,int l2,int r2){
        int sum =0;
        prefixsum(arr);

        for (int i=l1;i<=l2;i++){
            //r1 to r2 sum for row 1
            if (r1>=0)
            sum+=arr[i][r2]-arr[i][r1-1];
            else
                sum+=arr[i][r2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size col and row");
        int r= sc.nextInt();
        int l= sc.nextInt();
        int arr[][]=new int[r][l];

        System.out.println("enter arr element");
        for (int i=0;i<r;i++){
            for (int j=0;j<l;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter li and r1 and l1 and r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();


        //int sum=sumArray(arr,l1,l2,r1,r2);
        System.out.println("your sum is"+sumArray(arr,l1,r1,l2,r2));
        System.out.println("your sum 2is"+sumArray2(arr,l1,r1,l2,r2));
    }
}
