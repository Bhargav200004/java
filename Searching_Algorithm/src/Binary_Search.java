public class Binary_Search {


    static boolean binarySearch(int [] arr , int target){

        int n =arr.length;
        int start = 0 , end = n-1;

        while (start <=end){
            int mid = start + (end-start) / 2;
            if (target == arr[mid]) {
                return true;
            }
            else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int [] arr = {1,4,5,8,8,58,59,585,5890};
        int target = 0;

        while(target != 10){
            System.out.printf("%d Exits in the array %b \n",target, binarySearch(arr , target));
            target++;
        }


    }
}
