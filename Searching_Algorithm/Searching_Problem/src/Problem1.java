
/*
    Question1:-
                Find the first occurrence of a given element x, given that the given array
                is sorted. If no occurrence of x is found then return -1

                arr [] = {2,5,5,5,6,6,8,9,9}
                target = 5
 */

public class Problem1 {

    static int binarySearch_firstOccurrence(int[] arr, int target) {
        int first_Occurrence = -1;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                first_Occurrence = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first_Occurrence;
    }

    static int binarySearch_lastOccurrence(int[] arr, int target) {
        int lastOccurrence = -1;
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                lastOccurrence = mid;
                start = mid +1;
            }
            else if (target > arr[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }

        return lastOccurrence;
    }

    static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 6, 6, 8, 9, 9};
        int target = 5;

        System.out.printf("First occurrence Element found at :- %d\n", binarySearch_firstOccurrence(arr, target));
        System.out.printf("Last occurrence Element found at :- %d", binarySearch_lastOccurrence(arr ,target));
    }
}
