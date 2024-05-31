import java.util.HashMap;
import java.util.HashSet;

public class problem1 {

    static boolean startingPoint(HashSet<Integer> hashSet , int num){
        return !hashSet.contains(num - 1);
    }

    static int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int longestConsecutive = 0;
        for (int i = 0 ; i < nums.length ; i++){
            hashSet.add(nums[i]);
        }

        for (int i = 0 ; i < nums.length ; i++){
            if (!hashSet.contains(nums[i] - 1)){
                int currentNumber = nums[i];
                int currentStreak = 1;

                while (hashSet.contains(currentNumber+1)){
                    currentStreak++;
                    currentNumber++;
                }

                longestConsecutive = Math.max(longestConsecutive , currentStreak);
            }
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int [] arr = {100,4,200,1,3,2};
        //4

        System.out.println(longestConsecutive(arr));
    }
}
