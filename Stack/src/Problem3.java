public class Problem3 {

    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int [] result = new int[arr.length];

        for (int i = 0 ; i < arr.length-1;i++){
            int element = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > element){
                    result[i] = arr[j];
                    break;
                }
                else {
                    result[i] = -1;
                }
            }
        }

        result[arr.length-1] = -1;

        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : result){
            System.out.print(i + " ");
        }
    }
}
