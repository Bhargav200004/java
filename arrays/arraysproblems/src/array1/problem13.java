package array1;

import java.util.Scanner;

//Given an integers of size n.Answer q queries where you need to print the sum of values in a given range  of indices  from 1 to r (bothh included)
//note: The value of l and r in queries follow 1-based indexing
public class problem13 {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] printsum(int[] arr) {
        int n = arr.length;
        arr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of element");
        int n = sc.nextInt();
        int arr[] = new int[n+1];

        System.out.println("Enter " + n + " element");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();                              //here we make  1 based indexing

        }
        int [] prfixsum=printsum(arr);

        System.out.println("Enter number of queries"); // here we take q as queries
        int q= sc.nextInt();
        while(q-- >0){
            System.out.println("Enter range");
            int l= sc.nextInt();
            int r= sc.nextInt();

            int ans=prfixsum[r]-prfixsum[l-1];

            System.out.println("sum" +ans);


        }
    }
}
