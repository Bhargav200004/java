import java.util.Scanner;

//Given an integer ,find out the sum of its digits using recursion
public class problem3 {
    static int sod(int n){
        if(n>=0&&n<=9){
            return  n;
        }
//        recursive work
        return (sod(n/10) + n%10);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(sod(n ));
    }
}
