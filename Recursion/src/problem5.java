/*
Print the max value of the array
...............................................................ARRAY.......................................................................................
 */
import java.util.*;
public class problem5 {
    //printing an array with the help of recursion
    static void print(int arr[],int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");           //printing its last index
        print(arr,idx+1);                    //recursive call
    }

    public static void main(String[] args) {
        int  arr[]={5,4,6,7,5,6,5};
        System.out.println("printing an array");
        print(arr,0);

    }
}
