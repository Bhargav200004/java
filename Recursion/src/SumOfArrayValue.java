public class SumOfArrayValue {

    static int SumOfValue(int [] arr , int idx , int ans){
        if (idx == arr.length - 1){
            return arr[idx] + ans;
        }
        ans = arr[idx] + ans;
        return SumOfValue(arr , idx + 1 , ans);
    }

    public static void main(String[] args) {
        int [] arr = {173,24,12,19,13};
        System.out.println("Sum of the digit => " + SumOfValue(arr,0,0));
    }
}
