import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size ");
        int r=sc.nextInt();
        System.out.println("Enter column size ");
        int c=sc.nextInt();

        for (int i=1;i<r;i++){
            for (int j=1;j<i;j++){
//                if(i==1||j==1||i==c-j+1||j==r-i+1){
//                    System.out.print("   ");
//                }
////                else if () {
////                    System.out.print("   ");
////
////                }
//                else
//                {
//                    System.out.print(" * ");
//                }
                System.out.print(" * ");


            }System.out.println();
        }
    }
}
