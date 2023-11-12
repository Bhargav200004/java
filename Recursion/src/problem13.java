public class problem13 {

    static int firstIndex(int [] arr , int n , int index){

        if (index == arr.length) return -1;

        //Checking element occur at first Index
        if ( arr[index] == n) {
            return index;
        }
        else {
            return firstIndex(arr , n , index+1);
        }

    }

    public static void main(String[] args) {
        int n = 6;
        int [] arr = {2,6,3,6,8,3,0,5,3,7};

        System.out.println(firstIndex(arr , n , 0));
    }
}
