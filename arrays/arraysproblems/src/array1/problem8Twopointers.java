package array1;//sort an Array consisting of only 0s and 1s.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class problem8Twopointers {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
        System.out.println();

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroAndones(int arr[]) {
        int n = arr.length;
        int zeroes = 0;
        //count number of zeroes
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        //0 to zeroes -1  : zeroes to n-1:1
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }


        }
    }
        public static void main (String []args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int[] arr = new int[n];


            System.out.println("Enter " + n + "number");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Orginal array :");
            printArray(arr);
            sortZeroAndones(arr);
            System.out.println("sorted array;");
            printArray(arr);

        }

    }
