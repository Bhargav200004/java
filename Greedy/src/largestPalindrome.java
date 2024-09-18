import java.util.ArrayList;
import java.util.List;

public class largestPalindrome {


    private static Boolean validateFrequency(List<Integer> frequency) {
        boolean isOdd = false;

        for (int i  = 0 ; i < frequency.size() ; i++) {
            if (frequency.get(i) % 2 == 0) {
                if (isOdd) return false;
                isOdd = true;
            }
        }
        return isOdd;
    }


    public static void main(String[] args) {
        String number = "313551";
        List<Integer> frequency = new ArrayList<>(10);

        for (int i = 0 ; i< 10 ; i++){
            frequency.add(0);
        }

        System.out.println(frequency.add(0));
        for (int i = 0 ; i < number.length() ; i++){
            int digit = number.charAt(i) - '0';
            frequency.set(digit , frequency.get(digit) + 1);
        }

        if (validateFrequency(frequency)){
            System.out.println("It is not a palindrome");
            return;
        }

        String firstHalf = "";
        for (int i = 9 ; i>=0 ; i--){
            while (frequency.get(i) > 1) {
                firstHalf += i;
                frequency.set(i , frequency.get(i) - 2);
            }
        }

        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf = sb.toString();

        for (int i = 9 ;i >= 0 ; i--){
            if (frequency.get(i) == 1){
                firstHalf += i;
            }
        }

        String result = firstHalf + secondHalf;
        System.out.println(result);
    }


}
