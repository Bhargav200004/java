import java.util.*;

public class problem2 {

    static boolean isAnagram(String s, String t) {
        //base case
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> h1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (h1.containsKey(ch)) {
                h1.put(ch, h1.get(ch) + 1);
            } else {
                h1.put(ch, 1);
            }
        }
        for (int i = 0 ;i <  t.length() ; i++){
            char ch = t.charAt(i);
            if (!h1.containsKey(ch)) return false;

            h1.put(ch , h1.get(ch) - 1);
        }

        for (var val : h1.values()){
            if (val != 0) return false;
        }

        return true;
    }


    //h1.get(ch) != h2.get(ch)


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaramu";

        System.out.println(isAnagram(s, t));
    }
}
