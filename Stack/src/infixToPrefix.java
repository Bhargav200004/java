import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        System.out.println(infix);

        for (int i = 0 ; i < infix.length() ; i++){
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii<=57){
                String s = "" + ch;
                val.push(s);
            }
            else if (op.isEmpty() || ch == '(' || op.peek() =='('){
                op.push(ch);
            }
            else if (ch == ')'){
                while(op.peek() != '('){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char operator = op.pop();

                    val.push(operator+v1+v2);
                }
                op.pop();
            }
            else{
                if (ch == '+' || ch == '-'){
                    //work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char operator = op.pop();

                    val.push(operator+v1+v2);

                    //push operator
                    op.push(ch);
                }
                else if (ch == '*' || ch == '/'){
                    if (op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char operator = op.pop();
                        val.push(operator+v1+v2);

                        //pushing operator
                        op.push(ch);
                    }
                    else{
                        op.push(ch);
                    }
                }
            }
        }

        while(val.size() > 1){
            String v2 = val.pop();
            String v1 = val.pop();
            char operator = op.pop();
            val.push(operator+v1+v2);
        }

        System.out.println(val.peek());
    }
}
