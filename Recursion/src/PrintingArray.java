public class PrintingArray {

    static void ArrayPrint(int [] arr , int idx){
        if (idx == arr.length-1 ){
            System.out.print(arr[idx]);
            return;
        }
        System.out.print(arr[idx] + " ");
        ArrayPrint(arr, idx+1);
    }

    public static void main(String[] args) {
        int [] arr = {5, 4, 3 ,2 ,1};
        ArrayPrint(arr , 0);
    }
}
