package javalloop;
import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]){
    Scanner A=new Scanner(System.in);
    int a=A.nextInt();
    int b=A.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=1;j<=b;j++){
            if((i+j) % 2==0)
            System.out.print("1");
            else
            System.out.print("2");
        }System.out.println();
    }

    }
    
}
