public class MaxValueOnArray {

    static int maxValueOfArray(int [] arr , int idx , int maxValue){
        if (idx == arr.length - 1) {
            maxValue = Math.max(arr[idx] , maxValue);
            return maxValue;
        }

        maxValue = Math.max(arr[idx] , maxValue);
        return maxValueOfArray(arr , idx + 1 , maxValue);
    }

    public static void main(String[] args) {
        int [] arr = {21 , 1 , 43, 3 ,65 ,75 ,210};
        System.out.println(maxValueOfArray(arr , 0 , 0));
    }
}
