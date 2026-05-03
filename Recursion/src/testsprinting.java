import java.util.*;

class testsprinting{


    public static void main(String[] args) {
       String s = "aaacb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int n = s.length();
        int ans = 0;

        for(int right = 0 ; right < n ; right++){
            set.add(s.charAt(right));

            while(left < right && set.size() >= 2){
                set.remove(s.charAt(left));
                left++;
            }

            ans += right - left + 1;
        }

        System.out.println(ans);
    }

}