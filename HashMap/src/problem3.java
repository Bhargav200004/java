import java.util.HashMap;

public class problem3 {

    static boolean isIsomorphic(String s , String t){
        HashMap<Character , Character > hashMap = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (hashMap.containsKey(ch1)){
                if (!hashMap.get(ch1).equals(ch2)) return false;
            }else{
                if (hashMap.containsValue(ch2)) return false;
                hashMap.put(ch1 , ch2);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "badc", t = "baba";

        System.out.println(isIsomorphic(s , t));


    }
}
