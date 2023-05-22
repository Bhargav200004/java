import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size");
        int r=sc.nextInt();
        System.out.println("Enter column size");
        int c=sc.nextInt();

        for (int i=1;i<=r*2;i++){
            for (int j=1;j<=i-r;j++){           //r-i+1
                System.out.print(" * ");
            }
            for (int j=1;j<=r-i+1;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
