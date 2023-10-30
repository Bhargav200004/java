package array1;

import java.util.Scanner;

public class problem17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter element");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //main

        for (int i = 0 ;i < arr.length ; i++){
            for (int j =i ; j < arr.length ; j++){

                for (int k = i ; k <= j ; k++){
                    System.out.print(arr[k]+" ");
                }

                System.out.println();

            }
        }


    }
}
