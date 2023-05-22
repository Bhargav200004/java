package array1;//Given an array a considering of integers .Return the first value that is repeating in this array.if no value is being repeated ,return -1.


import java.util.Scanner;

public class problem5 {

    static int firstrepating(int []arr){
        int n=arr.length;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }

        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int arr[]=new int[n];

        System.out.print("Enter your array ");
        int i=0;
        while(i<n){
            arr [i]= sc.nextInt();
            i++;
        }



        System.out.println("your first number that repeat in array is " +firstrepating(arr));


    }
}
