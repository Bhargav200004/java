import java.util.Stack;

public class insertAtIndex {

    static void displayStackRecursively(Stack<Integer> st){
        if (st.isEmpty()) return;
        int top = st.pop();
        displayStackRecursively(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(345);
        st.push(34);
        st.push(45);
        st.push(325);
        st.push(845);

        displayStackRecursively(st);


//        Stack<Integer> gt = new Stack<>();
//        int index = 2 ;
//
//        while (st.size() > index) {
//            gt.push(st.pop());
//        }
//
//        st.push(1024);
//
//        while (!gt.isEmpty()) {
//            st.push(gt.pop());
//        }
//
//        System.out.println(st);

    }
}
