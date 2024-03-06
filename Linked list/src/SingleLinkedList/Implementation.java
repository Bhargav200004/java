package SingleLinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkList{
        Node head = null; //initialize at null
        Node tail = null;//initialize at null

        void insertAtEnd(int data){
            //Creating new Node
            Node temp = new Node(data);

            //checking LinkList is empty or not
            if (head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBeginning(int data){
            Node temp = new Node(data);

            if (head == null){
                head = temp;
                tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }

        }

        void display(){
            Node temp = head;

            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void size(){
            Node temp = head;
            int count = 0;
            while (temp != null){
                count++;
                temp = temp.next;
            }

            System.out.printf("\nSize of the list is :- %d\n" ,count);
        }
    }

    public static void main(String[] args) {
        linkList linkList = new linkList();
        linkList.insertAtEnd(45);
        linkList.insertAtEnd(23);
        linkList.insertAtEnd(56);

        linkList.display();
        System.out.println();

        linkList.insertAtBeginning(2);
        linkList.insertAtBeginning(1000);

        linkList.display();
        linkList.size();
    }
}
