import java.util.*;

public class Main {

    public static void partitionHelper(String s , int idx , List<List<String>> ans , List<String> value){
        if(idx == s.length()){
            ans.add(new ArrayList<>(value));
            return;
        }

        for(int i = idx ; i < s.length() ; i++){
            if(isPalindrome(s , idx , i )){
                value.add(s.substring(idx , i+1));
                partitionHelper(s , i + 1 , ans , value);
                value.remove(value.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String s , int start , int end){
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }

        return true;
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> value = new ArrayList<>();

        partitionHelper(s , 0 , ans , value);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(partition("aab"));

    }
}