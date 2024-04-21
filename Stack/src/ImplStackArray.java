public class ImplStackArray {

    static class arrayImp{
        static int top = -1 ;
        static final int capacity = 5;
        static final int [] stack = new int[capacity];
        int size = 0;

        boolean isEmpty(){
            if (top == -1)
                return true;
            else
                return false;
        }

        boolean isFull(){
            if (top == capacity -1){
                return true;
            }
            else{
                return false;
            }
        }

        void push(int data){
          if (isFull()){
              System.out.println("Stack overflow");
          }
          else {
              top++;
              stack[top] = data;
              size++;
          }
        }

        void pop(){
            if (isEmpty()){
                System.out.println("Stack underflow");

            }
            else{
                System.out.println("element remove from stack "+ stack[top]);
                top--;
                size--;
            }
        }

        void peek(){
            System.out.println("top element is " + stack[top]);
        }

        void display(){
            for (int i = 0 ; i <= top ; i++){
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        arrayImp st = new arrayImp();

        st.push(100);
        st.push(530);
        st.push(150);
        st.push(800);
        st.push(53400);
        st.push(800);

        st.display();


        st.pop();
        st.pop();
        st.peek();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.display();

    }

}
