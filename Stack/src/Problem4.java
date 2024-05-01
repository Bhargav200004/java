import java.util.Stack;

public class Problem4 {

    static int [] nextGreater(int [] arr){
        int n = arr.length;
        int []res = new int[n];
        Stack<Integer> st = new Stack<>();

        res[n-1] = -1;
        st.push(arr[n-1]);
        for (int i = n-2 ; i >= 0 ; i--){
            if (st.isEmpty()){
                st.push(arr[i]);
            }
            else if(arr[i] < st.peek()){
                res[i]= st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() &&  arr[i ] > st.peek() ){
                    st.pop();
                }
                if (st.isEmpty()){
                    st.push(arr[i]);
                    res[i] = -1;
                }
                else{
                    res[i]= st.peek();
                    st.push(arr[i]);
                }
            }

        }


        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,1,8,6,3,4};
        int [] res = nextGreater(arr);

        for (int i : res){
            System.out.print(i+" ");
        }

    }


}
