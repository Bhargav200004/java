package array1;

import java.util.Scanner;


public class problem16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.println("Enter element");
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        //main code

        int i = 0 ;
        int j = arr.length - 1;

        while (i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }




        System.out.println("Reverse array");
        for (int f = 0 ; f < arr.length ; f++){
            System.out.print(arr[f] + " ");
        }

    }

}
