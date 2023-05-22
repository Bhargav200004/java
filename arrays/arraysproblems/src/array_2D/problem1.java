package array_2D;

//Addition of 2 matrix in 2d form

import java.util.Scanner;
public class problem1 {

    //here we make the print method
    static void PrintArray(int arr[][]){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


    static void Sumoftwo(int arr[][],int r1,int c1,int arr2[][],int r2,int c2){
        /* here arr is 1st arr ,r1 is the row of first arr and c1 is the column of 1st arr
           here arr2 is 2nd arr ,r2 is the row of second arr and c2 is the column of 2nd arr*/

        //here we check the 2 arrays are equal or not ,By the if statement
        if (r1 !=r2 || c1!=c2){
            System.out.println("your input is wrong");
            return;
        }

        //here we making the new arr , for storing the sum of arrays
        int add[][]=new int[r1][c1];

        for (int i=0;i<r1;i++){                                  //for row
            for (int j=0;j<c1;j++){                              //for column
                add[i][j]=arr[i][j]+arr2[i][j];                  //here we add the sum of two arrays in (add array)
            }
        }
        PrintArray(add);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 array 1 row size");
        int r1=sc.nextInt();
        System.out.println("Enter 1 array 2 column number");
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];

        System.out.println("Enter arr  element");
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                 arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }


        System.out.println("Enter 2 array  1 row size");
        int r2=sc.nextInt();
        System.out.println("Enter 2 array  2 column number");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];

        System.out.println("Enter arr2  element");
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j< arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("MATRIX 1");
            PrintArray(arr);
        System.out.println("MATRIX 2");
            PrintArray(arr2);

        System.out.println("sum of arr (matrix1+matrix2)");
            Sumoftwo(arr,r1,c1,arr2,r2,c2);
    }
}
