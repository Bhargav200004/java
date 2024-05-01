import java.util.Stack;

public class nextGreaterElement2 {

    static int[] greaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[st.peek()]) {
                while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                    res[st.peek()] = arr[i];
                    st.pop();
                }
            }
            st.push(i);

        }

        while (!st.isEmpty()) {
            res[st.pop()] = -1;
        }

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 1, 6, 3, 4};
        int[] result = greaterElement(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
