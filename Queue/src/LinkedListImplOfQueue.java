import java.util.LinkedList;

public class LinkedListImplOfQueue {
    static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static class LinkedListQueue{
        static Node head = null;
        static Node tail = null;
        static int size = 0;

        //add Operation
        void add(int data){
            Node node = new Node(data);

            if (head == null && tail==null){
                head = tail = node;
            }else{
                tail.next = node;
                tail = node;
            }
            size++;
        }


        //poll , remove  Operation
        int remove(){
            if (head.next == null){
                System.out.println("UnderFlow");
                return -1;
            }else{
                head = head.next;
                size--;
                return head.data;
            }
        }


        //peek Operation
        int peek(){
            return head.data;
        }


        //isEmpty Operation
        Boolean isEmpty(){
            return tail==null;
        }

        //size Operation
        int getSize(){
            return size;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.add(467);
        queue.add(4);
        queue.add(67);
        queue.add(7);

        System.out.println(queue.peek());
        queue.display();
        System.out.println("Size of the list "+queue.getSize());
        queue.remove();
        System.out.println(queue.peek());
        System.out.println("Size of the list "+queue.getSize());
        queue.display();

    }
}
