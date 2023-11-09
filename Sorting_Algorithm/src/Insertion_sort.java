public class Insertion_sort {

    public static void main(String[] args) {
        int [] arr = {3,6,2,8,4,9,3,-1,9};

        System.out.println("Insertion sort");
        insertionSort(arr);
    }

    static void insertionSort(int [] arr){

        for(int i = 1 ; i < arr.length ; i++){
            //Storing Key value
            int key = arr[i];

            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        for (int i : arr){
            System.out.print(i+" ");
        }

    }



}
