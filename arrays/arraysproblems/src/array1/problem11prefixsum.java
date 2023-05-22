package array1;//Given an integer array  'a',return the prefix sum/running sum in the same array without creating a new array.

import java.util.Scanner;

public class problem11prefixsum {
    static void printArray(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int []prifixSum(int arr[]){
        int n= arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];               //here we define firstly prefix index is 0 is equal  arr index is 0


        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter "+n+" element");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("original array");
        printArray(arr);
        System.out.println( "after condition ");
        int [] prefix=prifixSum(arr);
        printArray(prefix);

    }
}
