public class reverseArray {

    private static void reverseList(int[] arr, int start , int end) {
        if (start > end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseList(arr , start  + 1, end - 1);
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4};

        System.out.println("Before reverse");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        reverseList(arr , 0, arr.length - 1);

        System.out.println("\nAfter reverse");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

    }


}
