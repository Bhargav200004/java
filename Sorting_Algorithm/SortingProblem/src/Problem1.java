
/*
Question1. Given an array where all its element are sorted in increasing order except two swapped elements,
           sort it in linear time. Assume there are no duplicates in the array

           Input A[] = [3,8,6,7,5,9,10]
           Output B[] = [3,5,6,7,8,9,10]
 */


public class Problem1 {


    public static void display(int [] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void sortedArray(int[] arr) {
        int n = arr.length;
        //storing for the index

        if ( n <= 1){ //corner case and edge case
            return;
        }
        int x = -1,y = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {  //first conflict
                    x = i - 1;
                }
                //second conflict
                y = i;
            }
        }

        //swapping the element
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};

        sortedArray(arr);

        display(arr);

    }

}
