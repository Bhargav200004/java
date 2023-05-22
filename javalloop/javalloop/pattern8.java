package javalloop;
import java.util.Scanner;
public class pattern8 {
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
    
}
