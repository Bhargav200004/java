package array_2D;

import java.util.Scanner;

//multiplication of two arrays
public class problem2 {

    //for printing the arrays
    static void Printarray(int arr[][]){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void multiplication(int arr[][],int r1,int c1,int arr2[][],int r2,int c2){

        if (c1!=r2){       //here we check the c1 is not equal to the r2
            System.out.println("Wrong input ");
            return;
        }

        int mul[][]=new int[r1][c2];

        for (int i=0;i<r1;i++){                   //row
            for (int j = 0 ; j < c2 ; j++){       //column
                // for multiplication
                for (int k = 0 ; k < r1 ; k++){
                   mul[i][j] +=(arr[i][k]*arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of two array is" );
        Printarray(mul);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arr 1 row size");
        int r1=sc.nextInt();
        System.out.println("Enter arr 1 column size");
        int c1=sc.nextInt();

        int arr[][]=new int[r1][c1];

        System.out.println("Enter arrays "+r1*c1+" element");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        //------------------------second array -------------------------------------

        System.out.println("Enter your 2 arr row size");
        int r2=sc.nextInt();
        System.out.println("Enter your 2 arr column size");
        int c2=sc.nextInt();

        int arr2[][]=new int[r2][c2];

        System.out.println("Enter your second array"+r2*c2+"element");
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j< arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("MULTIPLICATION OF TWO ARRAY");
        multiplication(arr,r1,c1,arr2,r2,c2);

    }
}
