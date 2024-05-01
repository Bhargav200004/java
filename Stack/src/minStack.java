import java.util.Stack;

public class minStack {

    static class Min{
        Stack <Integer> st = new Stack<>();
        Stack <Integer> min = new Stack<>();

        static int minValue = Integer.MAX_VALUE;

        void push(int value){
            if (min.isEmpty()){
                st.push(value);
                min.push(value);
            }
            else if (value < minValue){
                minValue = value;
                st.push(minValue);
                min.push(minValue);
            }
            else{
                st.push(value);
                min.push(minValue);
            }
        }

        void pop(){
            st.pop();
            min.pop();
        }

        int getMin(){
            if (!min.isEmpty()) return min.peek() ;
            else {
                return -1;
            }
        }

    }




    public static void main(String[] args) {
        Min min = new Min();

        min.push(10);
        min.push(5);
        min.push(11);
        min.push(2);
        min.push(2);
        min.push(4);
        min.push(5);

        System.out.println(min.getMin());

        min.pop();
        min.pop();
        min.pop();
        min.pop();

        System.out.println(min.getMin());


    }
}
