package array1;//Given an array of integers 'a' ,moves all the even integers at the beginning of the  array following by all the odd integers .
// The relative order of odd or even integers does not matter.Return any array that satisfies the condition

import java.util.Scanner;

public class problem9 {
    static void printArray(int [] arr){                                   //function for printing
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int []arr,int i,int j){                                //function for swapping the array
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortOddEven(int arr[]){                                          //function of sorting odd even
        int n=arr.length;

        int left=0,right=n-1;
        while(left<right){
            if (arr[left]%2==1&&arr[right]%2==0) {
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
                right--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int []arr=new int[n];

        System.out.println("Enter"+n+"number");
        for (int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println("Before array");
        printArray(arr);
        sortOddEven(arr);
        System.out.println("after sort");
        printArray(arr);


    }
}
