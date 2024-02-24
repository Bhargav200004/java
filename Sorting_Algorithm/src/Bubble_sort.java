import java.util.Scanner;

public class Bubble_sort {
    //assending order
    static void bubblesort(int arr[]){
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                boolean flag=false;
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                if (!flag) return;
            }
        }
    }

    //desending order
    static void bubblesort2(int arr[]){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                boolean flag=false;
                if (arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                if (!flag) return;
            }
        }
    }

    //printing arr
    static void print(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of array");
        for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("Your array is");
        print(arr);
        System.out.println();

        System.out.println("assending order");
        bubblesort(arr);
        print(arr);

        System.out.println("Descending order");
        bubblesort2(arr);
        print(arr);

    }
}
