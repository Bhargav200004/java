import java.util.Scanner;

class sum{
    int add(int a,int b){
        int ans = a+b;
        return ans; // to return the value of int
        //But in void there is no need of write written statement
    }

}


public class Main {
    public static void main(String[] args) {
//        sum obj=new sum();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your first number-");
//        int a= sc.nextInt();
//        System.out.print("Enter your second number");
//        int b=sc.nextInt();
//
//        System.out.println("sum of "+a +" + " +b +" is " +obj.add(a,b)); //obj1.add(a,b); is the calling from class sum

        System.out.println(Math.sqrt(36)); //math in built (standard) function for square root

        System.out.println(Math.floor(6.2)); // for lower value ==6.0

        System.out.println(Math.ceil(6.2));//for upper vale ==7.0

    }
}