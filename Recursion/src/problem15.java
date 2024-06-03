import java.util.ArrayList;
import java.util.List;

public class problem15 {

    static void printPermutation(String str , String ans){
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);  // b
            String left = str.substring(0 , i); // a
            String right =str.substring(i+1) ; // c
            String rem = left + right;
            printPermutation(rem , ans + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str , "");

    }
}
