////Rotate the given array 'a' by k steps,where k is non-negative .
//
//import java.util.Scanner;
//
//public class problem6 {
//    //here arr is array and the k is the number of rotation
//    static  int [] rotate(int arr[] ,int k){
//        int n=arr.length;
//        k=k%n;                               //here modulus do the eliminate number
//        int[] ans =new int[n];
//        int j= 0;
//
//        for(int i=n-k;i<n;i++){              //here we initilaize i as the no of arr -number of rotaion then loop runs until less than n
//            ans[j++]=arr[i];                 //then we add arri in null variable
//
//        }
//        for(int i=0;i<n-k;i++){              //here we intilaizing i as 0  to n-k
//            ans[j++]=arr[i];                 //then we add the number in firstly variable
//        }
//
//        return ans;
//
//    }
//    static void reverse(int[] arr,int st int end){
//        int i =0,j= arr.length;
//        while(i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//    //Rotate the given arr 'a' by k steps,where k is non-negative number without using extra space
//    static int [] rotateinline(int []arr,int k){
//        int n=arr.length;
//        k=k%n;
//    }
//
//    static void print(int arr[]){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//
//        int arr[]={1,2,3,4,5,6,7,8};
//
//        System.out.println("Enter rotation number");
//        int k=sc.nextInt();
//
//        System.out.println("before rotation");
//        print(arr);
//
//        System.out.println("after rotation");
//        int [] ans=rotate(arr,k);
//        print(ans);
//
//    }
//}
