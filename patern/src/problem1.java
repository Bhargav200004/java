import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("Enter column ");
        int c = sc.nextInt();
        if (r == c) {
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <=c; j++) {
                    if (i == 1|| i==r|| j == 1||j==c) {
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");

                    }
                }
                System.out.println();
            }
        }
        else{
                System.out.println("please enter same row and column");
            }


    }
}
