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


    //Without stable the array
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


    //with stable
    static void countSort(int [] arr){
        //outPut array
        int n = arr.length;
        int [] output = new int[n];

        //Create frequency array or count array
        int max = findMaxElement(arr);
        int [] count = new  int[max+1];
        for (int i = 0 ; i< arr.length;i++){
            count[arr[i]]++;
        }

        //Creating prefix sum of the count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }

        //finding the index of each element in the original Array and put it in the output array
        for (int i = n-1; i >= 0 ; i--) {
            int idx = count[arr[i]] -1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }

        //copying the output array to original array
        for (int i : output){
            arr[i] = output[i];
        }

    }

    static void display(int [] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        int []arr= {2,6,2,6,3,6,3};

        countSort(arr);

        display(arr);

    }

}
