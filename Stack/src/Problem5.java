import java.util.Stack;

public class Problem5 {

    static class pair{
        int value;
        int index;
        pair(int value , int index){
            this.value = value;
            this.index = index;
        }
    }

    static int[] previousArray(int [] arr){
        int [] res = new int[arr.length];

        Stack<pair> st = new Stack<>();
        res[0] = 1;
        st.push(new pair(arr[0],0));

        for (int i = 1 ; i < arr.length ; i++){
            if (st.isEmpty()){
                st.push(new pair(arr[i],i));
                res[i] = i - st.peek().index;
            }
            else if(arr[i] < st.peek().value){
                res[i] = i - st.peek().index;
                st.push(new pair(arr[i],i));
            }
            else{
                while(!st.isEmpty() && arr[i] > st.peek().value){
                    st.pop();
                }
                if (st.isEmpty()){
                    st.push(new pair(arr[i],i));
                    res[i] = i;

                }
                else{
                    res[i] = i - st.peek().index;
                    st.push(new pair(arr[i],i));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {42 ,68 ,735 ,101 ,770 ,525 ,279, 559, 563, 465 ,106 ,146 ,82, 28, 362, 492 ,596 ,743 ,28 ,637 ,392 ,205 ,703 ,154 ,293 ,383 ,622 ,317, 519, 696 ,648 ,127 ,372 ,339 ,270 ,713 ,68 ,700, 236 ,295 ,704 ,612 ,123};
        int[] res = previousArray(arr);

        for (int i : res){
            System.out.print(i+" ");
        }
    }
}
