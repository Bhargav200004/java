public class Main {

    public static int[] twoSum(int[] nums, int target) {
        int first=0;
        int last = 0;
        int[] sum=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target)
                {
                    first=i;
                    last=j;
                }
                



            }
        }
        System.out.println(first+last);

        return sum;


    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        int target=6;
        twoSum(arr,target);
    }
}