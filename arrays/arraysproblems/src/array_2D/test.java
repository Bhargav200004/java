package array_2D;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number ");
       int n=sc.nextInt();
       int a=0;
       if (n>=0){                //check for n is greater than 0 or equal
           if (n==0||n==1){      //check  for n  is equal 0 or 1
               System.out.println("It is not prime number");
               return;
           } else  {                 //check for is prime number or not
               for (int i=2;i<n;i++){
                   if (n%i==0){
                    a++;
                   }
               }
           }
//a=1
       }
       else{
           System.out.println("wrong input");
           return;
       }
       if(a==0){
           System.out.println(n+" IT is prime number");
       }
       else{
           System.out.println(n+ " not a prime number");
       }
    }
}
