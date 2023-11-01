package array_2D;

import java.util.Scanner;

import static array_2D.problem7.printArray;

public class problem9 {


    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int [][]arr = new int[n][n];
        System.out.println("Enter Element");
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr.length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("your original array");
        printArray(arr);

        for (int i = 1 ; i < arr.length; i++){
            for (int j = 0 ; j < i+1 ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }

        System.out.println("After transpose");
        printArray(arr);

    }

}
