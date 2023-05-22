//only rectangle
package javalloop;
import java.util.Scanner;
public class pattern {
    public static void main(String arg[]){
    Scanner A =new Scanner(System.in);
    int a= A.nextInt();
    int b=A.nextInt();

    for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            System.out.print("*");
        }
        System.out.println( );

    }
}
}
