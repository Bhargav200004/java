package array_2D;

// 2d array initializing int java

import java.util.Scanner;

public class arrayinitilaizing {

    //Method for printing 2d array
    static void PrintArray(int arr[][]){
        //here we use nested loop ,i for row and j for coloum
        for (int i=0;i<arr.length;i++){//row
            for(int j=0;j<arr[i].length;j++){//colum
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr2={{1,2,3},{3,4,2},{43,2,5}};
        System.out.println("print array");
        PrintArray(arr2);

        System.out.print("Enter  row size=");      //here we talking row size
        int m=sc.nextInt();
        System.out.print("Enter coloum size =");   //here we talking column size
        int n=sc.nextInt();
        int [][] arr=new int [m][n];
        //talking input from user
        System.out.println("Enter array number");          //talking input for 2d array
        for (int i=0;i<arr.length;i++){//row
            for (int j=0;j<arr[i].length;j++){//column
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        PrintArray(arr);

    }

}
