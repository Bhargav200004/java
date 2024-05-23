import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        //answer = 953+4*6/-

        Stack<String> val = new Stack<>();

        for (int i = str.length()-1 ; i >= 0 ; i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 48 && ascii <=58){
                val.push("" + ch);
            }else{
                String v1 = val.pop();
                String v2 = val.pop();
                val.push(v1 + v2 + ch);
            }
        }

        System.out.println(val.peek());
    }
}