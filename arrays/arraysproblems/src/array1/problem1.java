package array1;//Find the total no of pairs in the Array whose sum is equal to the given value X.

import java.util.Scanner;

public class problem1 {

    static int pairsum(int[] arr, int target){
        int n=arr.length;                                               // here we defined the variable n as array length
        int ans=0;
        // here we apply the nested loop for the arrays sum
        for(int i =0;i<n;i++){   //first number
            for(int j= i+1;j<n;j++){  //second number
                if (arr[i] + arr[j] == target){    //here  if statement is use for sum of two arrays and give ans target , then ans ++
                    ans++;
                }

            }
        }
        return ans;   //An is written
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);                   //here input taking sc is made
        System.out.print("Enter the array size");
        int n = sc.nextInt();                                 //here variable n is taken
        int[] arr= new int[n];                                //here arr is taken in n where n number of array is created

        System.out.println("Enter " + n + " element ");
        for(int i =0;i<n;i++){                                //here loop is created for the arrays input
            arr[i] = sc.nextInt();                            //here array input is taken
        }

        System.out.println("Enter target sum");
        int target =sc.nextInt();                             //here targeted sum is taken so we can compare

        System.out.println(pairsum(arr,target));              //here function is called pairsum



    }



}
