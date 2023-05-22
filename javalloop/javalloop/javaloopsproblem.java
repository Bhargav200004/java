package javalloop;
///Q1}  finding the power of rising to b

import java.util.Scanner;
public class javaloopsproblem {
    public static void main(String arg[]) {
   Scanner A = new Scanner(System.in);
   int a= A.nextInt() , b=A.nextInt();
   
   int ans =1;
   
   for(int i=1;i<=b;i++){
    ans *= a;

   }
   System.out.println(ans);

        
    }
    
}
