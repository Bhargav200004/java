import java.util.Arrays;

public class BubbleSort {



    static int merger(int [] arr , int start ,int mid ,  int end ){
        // create two array left and right


        int[] left = Arrays.copyOfRange(arr, start, mid + 1);
        int[] right = Arrays.copyOfRange(arr, mid + 1, end + 1);

        // Intialize the array
        int count = 0;
        int i = 0 , j = 0 , k = start;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
                count = (mid - start + 1);;
            }
        }

        while (i < left.length){
            arr[k++] = left[i++];
        }

        while( j < right.length ){
            arr[k++] = right[j++];
        }

        return count;
    }

    static int  mergeSort(int [] arr , int start , int end){
        if(start >= end) return 0;
        int count = 0;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        count += merger(arr, start, mid, end );

        return count;
    }

    public static void main(String[] args) {
//        int [] arr = {2, 4, 1, 3, 5 };
//        int n = arr.length;
//        int count = mergeSort(arr , 0 , n - 1 );
//
//        for (int i : arr){
//            System.out.print(i + " ");
//        }
//
//        System.out.println( "ans" + count);

//        int k = 13 / 14;
//
//        System.out.println(k);


    }
}
