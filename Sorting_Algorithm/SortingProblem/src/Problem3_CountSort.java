/*
Question3
        Given an array of size N containing only 0s, 1s and 2s ; Sort the array in ascending order.

        Input
        N = 6
        arr[] = {0,2,1,2,0,0}

        Output
        0,0,0,1,2,2
 */

public class Problem3_CountSort {

    static void CountSort(int [] arr , int N){
        int count_0 =0 , count_1 = 0 , count_2 = 0;
        for (int i = 0 ;i< N ; i++){
            if (arr[i] == 0) {
                count_0++;
            }
            else if (arr[i] == 1) {
                count_1++;
            }
            else {
                count_2++;
            }
        }
        int k = 0;

        while (count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }

        while (count_1 > 0){
            arr[k++] = 1;
            count_1--;
        }

        while (count_2 > 0){
            arr[k++] = 2;
            count_2--;
        }

    }

    public static void main(String[] args) {

        int [] arr = {0,2,1,2,0,0};
        int N = 6;

        CountSort(arr,N);

        Problem1.display(arr);

    }
}
