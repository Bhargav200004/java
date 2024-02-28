/*
    Question2
    Given an array of positive and negative integer,segregate them in linear
    time and constant space . The output should print all negative number,
    followed by all positive number.

 */


public class Problem2 {

    static void sortArray(int [] arr){

        int start = 0  , end = arr.length-1;

        while (start < end){

            if (arr[start] > 0){
                start++;
            }
            if (arr[end] < 0) {
                end--;
            }
            int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;

        }


    }

    public static void main(String[] args) {
        int [] arr = {19,-20,7,-4,-13,11,-5,3};

        sortArray(arr);

        Problem1.display(arr);
    }
}
