import java.util.*;

public class Problem2 {

    static int[] subSequence(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (st.isEmpty() || st.peek()!=arr[i])
                st.push(arr[i]);
            else if (arr[i] == st.peek()){
                if (i == n-1 || arr[i] != arr[i+1]) st.pop();
            }
        }


        int [] result = new int[st.size()];

        int size = result.length;
        for (int i = size-1; i >= 0 ; i--) {
            result[i] = st.pop();
        }

        return result;


    }

    public static void main(String[] args) {

        int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int [] result = subSequence(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
