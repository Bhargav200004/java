package array1;

import java.util.Scanner;

public class problem15 {


    public static void main(String[] args) {
    //Taking input
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        System.out.println("Enter elements");
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        //main
        int max = Integer.MIN_VALUE;

        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i] > max) max = arr[i];
        }

        System.out.print("Maximum number on array is ");
        System.out.println(max);


    }


}
