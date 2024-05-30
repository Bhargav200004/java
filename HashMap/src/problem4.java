import java.util.Arrays;
import java.util.HashMap;

public class problem4 {

    static int[] twoSum(int[] nums, int target){
        HashMap<Integer , Integer> hashMap = new HashMap<>();

        int [] ans = {-1};
        for (int i = 0 ; i < nums.length ; i++){
            if (hashMap.containsKey(target - nums[i])){
                ans = new int[]{hashMap.get(target - nums[i]), i};
                return ans;
            }
            else{
                hashMap.put(nums[i] , i);
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int [] arr ={2,7,11,15};
        int target = 9 ;

        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}
