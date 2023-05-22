package array1;//Given an integer array 'a' sorted in non-decreasing order,return an array of the squares of each number sorted in non-decreasing order.



public class problem10 {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    static void reverse(int arr []){
         int i=0;
         int j= arr.length-1;
         while(i<j){
             swap(arr,i,j);
             i++;
             j--;
         }
    }
    static void printArray(int arr[]){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int []sort(int [] arr){
        int []ans=new int[arr.length];
        int k =0;
        int right= arr.length-1;
        int left= 0;
        while(left<=right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];                 //here k++ means that to assign the value on k
                left++;
            } else  {
                ans[k++] = arr[right] * arr[right];               //here k++ means that to assign the value on k
                right--;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,5};
        System.out.println("orginal arr ");
        printArray(arr);
        System.out.print("after sort ");
        int ans[]=sort(arr);
        reverse(ans);
        printArray(ans);
    }
}
