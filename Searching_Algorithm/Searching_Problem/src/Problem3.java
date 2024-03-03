/*
    Question3:-
                A rotated sorted array is a sorted array on which rotation operation has been performed some number of times.
                Given a rotated sorted array,find the index of the minimum element in the array.
                Follow 0-based indexing

                Input:- array[] = {3,4,5,1,2}

                Output:- 3
 */


public class Problem3 {

    static int minimumIndex(int [] arr){
        int min = -1;
        int n = arr.length;
        int start =0 , end = n -1;

        while (start <= end){
            int mid = start+(end -start) /2;
            if (arr[mid] > arr[n-1]){
                start = mid +1;
            }
            else if (arr[mid] <= arr[end]){
                min =  mid;
                end = mid -1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {9,10,11,12,13,14,1,2,3,4,5,6,7,8};

        System.out.println(minimumIndex(arr));
    }
}
