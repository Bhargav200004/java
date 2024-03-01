public class Problem3_optimalAproch {

    static void display(int [] arr){
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void swap(int [] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int [] arr){
        int start  = 0 ,mid = 0, end = arr.length -1;


        while (mid <= end){
            if (arr[mid] ==0){
                swap(arr,mid,start);
                mid++;
                start++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr , mid , end);
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {2,2,0,0,1,1,2,0,1,0};
        sort012(arr);
        display(arr);
    }
}
