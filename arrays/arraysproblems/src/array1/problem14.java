package array1;//Check if we can partition the array into two  subarrays with equal sum .more formally ,check that the prefix sum of a part of the array is equal
// to the suffix sum of rest the array .
//--------------------------------------------------Subarrays----------------------------------------------------------------------------

import java.util.Scanner;

public class problem14 {
    static void PrintArray(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    static int sumArray(int [] arr){
        int totalsum=0;
        for (int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean sumpartition(int arr[]){
        int totalsum=sumArray(arr);
        int prefixsum=0;
        for (int i=0;i<arr.length;i++){
            prefixsum+=arr[i];
            int sufixsum=totalsum-prefixsum;
            if (prefixsum==sufixsum){
                return true;
            }

        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter arrays element");
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("equal partition possible " +sumpartition(arr));


    }
}
