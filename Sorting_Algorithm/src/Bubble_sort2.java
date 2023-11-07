public class Bubble_sort2 {

    public static void main(String[] args) {

        int []arr = {4,6,3,9,-1,5,2};

        System.out.println("BubbleSort");
        bubbleSort(arr);
    }

    static void bubbleSort(int [] arr){
        int n= arr.length;

        for (int i =0 ; i< arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - i -1  ;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i : arr){
            System.out.print(i+",");
        }
    }
}
