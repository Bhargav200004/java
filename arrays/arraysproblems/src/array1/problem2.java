package array1;//Count the number of thriplets whose sum is equal to the given value X

import java.util.Scanner;

public class problem2 {

    static int tripletsum(int[] arr, int target){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){                                     //first number
            for(int j=i+1;j<n;j++){                               //second number
                for(int k=j+1;k<n;k++){                           //third number
                    if (arr[i] + arr[j] + arr[k] ==target) {
                        ans++;
                    }
                }
            }
        }
          return ans;
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

        System.out.println("Enter your targeted number");
        int target=sc.nextInt();
        System.out.println(tripletsum(arr,target));


    }
}
