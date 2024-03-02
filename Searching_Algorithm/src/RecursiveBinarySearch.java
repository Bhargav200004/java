public class RecursiveBinarySearch {

    static boolean binarySearch(int [] arr , int start , int end , int target){

        if (start > end) return false;

        int mid = start+(end - start) / 2;
        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return binarySearch(arr , start , mid-1,target);
        }
        else {
            return binarySearch(arr , mid+1 , end,target);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,4,5,8,8,58,59,585,5890};
        int n = arr.length;
        int target = 58;

        System.out.println(binarySearch(arr,0,n-1,target));
    }
}
