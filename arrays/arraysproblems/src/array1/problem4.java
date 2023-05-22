package array1;//find the second largest element in the given arrays

import java.util.Scanner;

public class problem4 {

    static int largest(int arr[]){
        int n=arr.length;
        int mx=Integer.MIN_VALUE;  //here integerminvalue represent the lowest value                                         //when ever we want to find maximum arrays then we intilaize the value as -infinity or vise vera
        for (int i=0;i<n;i++){
                if (arr[i]>mx){
                    mx=arr[i];
                }
        }
        return mx;

    }

    static int secondmax(int arr[]){
        int mx=largest(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax=largest(arr);

        return secondmax;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arrays size");
        int n= sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter arrays number");
        for(int i=0;i<n;i++){
            arr [i]=sc.nextInt();
        }

        System.out.println("your second largest number is " +secondmax(arr));


    }

}
