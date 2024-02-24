public class Main {
     public int removeElement(int[] nums, int val) {
        int ans[]=new int[nums.length-1];
        int j =0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[i]=0;
                j++;
            }
        }
        for(int i : ans){
            System.out.println(ans[i]);
        }
        return j;
    }

    public static void main(String[] args) {
        int[] array = {3,3,3,2,2,6};
        int indexToRemove = 2;
        System.out.println();
        
//        int[] newArray = new int[array.length - 1];
//        for (int i = 0, j = 0; i < array.length; i++) {
//            if (array[i] != indexToRemove) {
//                newArray[j++] = array[i];
//            }
//        }

        // Print the new array
//        for (int num : newArray) {
//            System.out.print(num + " ");  // Output: 1 2 4 5
//        }
    }
}

