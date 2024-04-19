import java.util.*;

public class BasicStack {
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(34);
        System.out.println("Size of the stack is :- "+st.size());
        System.out.println(st);
        st.push(31);
        System.out.println("Size of the stack is :- " + st.size());
        System.out.println(st);
        st.push(64);
        System.out.println("Size of the stack is :- "+st.size());
        System.out.println(st);
        st.push(100);
        System.out.println("Size of the stack is :- "+st.size());
        System.out.println(st);
        st.push(35);
        System.out.println("Size of the stack is :- "+st.size());
        System.out.println(st);
        System.out.println(st.size());
    }
}
