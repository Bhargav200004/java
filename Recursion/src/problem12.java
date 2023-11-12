public class problem12 {

    //Printing an array
    static void printArray(int [] arr , int index){
        //Base case
        if (index <= 0) return;

        printArray(arr , index-1);

        System.out.print(arr[index - 1] + " ");

    }


    public static void main(String[] args) {
        int []arr ={3,3,9,3,9,5,7,10,55};

        printArray(arr, arr.length);
    }

}
