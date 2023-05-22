import java.util.Scanner;

//swapping the variable without temprary file
public class problem2 {
    static void swap(int a,int b){
        System.out.println("before swapping ");
        System.out.println("first number"+a);
        System.out.println("second number"+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping");
        System.out.println("first number"+a);
        System.out.println("second number"+b);


    }

//    static int reverseArray(int arr[]){
//
//        int n=arr.length;
//        int [] ans=new int[n];
//        int j=0;
//
//
//        //traversing orginal array
//        for (int i=n-1;i>=0;i--){
//            ans[j++]=arr[i];
//
//
//        }
//          return ans;
//    }


    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int x=sc.nextInt();
//        System.out.println("Enter your second number");
//        int y=sc.nextInt();
//        swap(x,y);

        int arr[]={1,2,3,4,5,6,7,8,9};

    }
}
