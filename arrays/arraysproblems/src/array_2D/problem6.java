package array_2D;
//Given an 'n X m' matrix 'a',return all elements of the matrix in spiral order.
import java.util.Scanner;
public class problem6 {
    static void PrintArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int [][] arr,int r,int c){
        //initializing the while loop
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalelement=0;
        while(totalelement<r*c){
            //topRow--> left  col to  right col
            for (int j=leftCol;j<=rightCol && totalelement<r*c;j++){
                System.out.print(arr[topRow][j]+" ");
                totalelement++;
            }
            topRow++;

            //RightCol-->top row to bottom row
            for (int i=topRow;i<=bottomRow && totalelement<r*c;i++){
                System.out.print(arr[i][rightCol]+" ");
                totalelement++;
            }
            rightCol--;

            //BottomRow-->  right col  to left col
            for (int j=rightCol;j>=leftCol && totalelement<r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalelement++;
            }
            bottomRow--;

            //leftCol--->bottom Row to top Col
            for (int i=bottomRow;i>=topRow && totalelement<r*c;i--){
                System.out.print(arr[i][leftCol]+" ");
                totalelement++;
            }
            leftCol++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=sc.nextInt();
        System.out.println("Enter column size");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter Array element");
        for (int i=0;i<r;i++){                                       //row
            for(int j=0;j<c;j++){                                    //column
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Arr");
        PrintArray(arr);

        System.out.println("Spiral order ");
        printSpiralOrder(arr,r,c);


    }
}
