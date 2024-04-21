public class ImplStackLinkedList {

    static class Node{
        int data;

        Node next;

        Node(int data){
            this.data = data;
        }
    }


    static class linkListImp{
        Node head = null;

        int size = 0;

        boolean isEmpty(){
            if (head == null){
                return true;
            }
            else{
                return false;
            }
        }

        void push(int data){
            Node a = new Node(data);

            if (head != null) {
                a.next = head;
            }
            head = a;
            size++;
        }

        void pop(){
            if (head == null){
                System.out.println("Under Flow");
                return;
            }
            head = head.next;
            size--;
        }

        void peek(){
            System.out.println("Top element is "+head.data);
        }

        void revDisplay(){
            Node temp = head;
            if (isEmpty()){
                System.out.println("Stack under flow");
                return;
            }
            while (temp != null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void reverseList(Node h){
            if (h == null) return;
            reverseList(h.next);
            System.out.print(h.data + " ");
        }

        void display(){
            reverseList(head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkListImp st = new linkListImp();


        st.push(324);
        st.push(534);
        st.push(32);


        st.display();

        st.peek();

        st.pop();
        st.pop();
        st.pop();





    }
}
