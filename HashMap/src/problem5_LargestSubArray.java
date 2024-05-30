import java.util.HashMap;

public class problem5_LargestSubArray {

    static int zeroSumLargestSubArray(int [] arr , int n){
        HashMap<Integer , Integer> mp = new HashMap<>();
        int maxLen = 0 , prefSum = 0;
        mp.put(0,-1);
        for (int i = 0 ; i < n ; i++){
            prefSum += arr[i];
            if (mp.containsKey(prefSum)){
                maxLen = Math.max(maxLen , i - mp.get(prefSum));
            }
            else{
                mp.put(prefSum , i );
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {

    }
}
