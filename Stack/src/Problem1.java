import java.util.Stack;

public class Problem1 {




    static boolean isOdd(String str){
        return str.length() % 2 != 0;
    }

    static boolean checkThebraces(String str){

        Stack<Character> st = new Stack<>();

        if (isOdd(str)) {
            System.out.println("After removing 1 number it will balanced");
            return false;
        }

        for (int i = 0 ; i < str.length() ; i++){

            if (str.charAt(i) == '('){
                st.push(str.charAt(i));
            }
            else{
                if (st.isEmpty()) {
                    System.out.println("After removing  first bracket it will balanced");
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }
        else {
            System.out.println("After removing " + st.size()+" bracket it will balanced");
          return false;
        }

    }

    public static void main(String[] args) {

        String str = "(())()";

        System.out.println(checkThebraces(str));



    }
}
