import java.util.Scanner;

public class test {
    static void print(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void sumofoddandeven(int arr[]){
        int n= arr.length;
        int odd=0;
        int even=0;
        for (int i=0;i<n;i++){
            if(i%2==0){
                even += i;
            }
            else {
                odd += i;
            }
        }
        System.out.println("sum of odd number is "+odd);
        System.out.println("sum of even number is "+even);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array element is");
        print(arr);
        sumofoddandeven(arr);


    }
}
