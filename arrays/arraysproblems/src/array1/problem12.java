package array1;
//Given an integer array  'a',return the prefix sum/running sum in the same array without creating a new array.
//--------------------------------------Alternative way----------------------------------

import java.util.Scanner;

 class problem12 {
    static void printArray(int arr[]){
        int n=arr.length;

        for (int i=0;i<n;i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int []prefixsum(int arr[]){
        int n=arr.length;
        arr[0]=arr[0];
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" elements");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("original array");
        printArray(arr);
        System.out.println("After changes");
        prefixsum(arr);
        printArray(arr);
    }
}
