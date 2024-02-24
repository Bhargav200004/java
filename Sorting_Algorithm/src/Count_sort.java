public class Count_sort {

    static int findMaxElement(int []arr){
        int max = Integer.MIN_VALUE;

        for (int i : arr){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void basicCountSort(int [] arr){
        //finding maximum number of element present in the array
        int max = findMaxElement(arr);

        //Creating a new count array with maxSize + 1
        int [] count = new int[max+1];

        for (int i : arr){
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0 ; i < count.length ; i++){
            for (int j = 0 ; j < count[i]; j++){
                arr[k++]= i;
            }
        }

    }

    static void display(int [] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int []arr= {2,6,2,6,3,6,3};

        basicCountSort(arr);

        display(arr);

    }

}
