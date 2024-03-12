package SingleLinkedList;

/*
    Q. Can we delete a node given the node itself as parameter
 */

public class problem2 {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static class linkList{
        Node head = null;
        Node tail = null;

        int size = 0;

        void insertAtEnd(int data) {
            //Creating new Node
            Node temp = new Node(data);

            //checking LinkList is empty or not
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtBeginning(int data) {
            Node temp = new Node(data);

            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        void insertAtIndex(int data, int index) {
            Node temp = new Node(data);
            Node p = head;
            if (index == 0) {
                insertAtBeginning(data);
                return;
            } else if (size() == index) {
                insertAtEnd(data);
                return;
            } else if (size() < index) {
                System.out.println("Out of bound");
                return;
            } else if (index < 0) {
                System.out.println("Wrong input");
                return;
            }
            for (int i = 1; i < index - 1; i++) {
                p = p.next;
            }
            temp.next = p.next;
            p.next = temp;
            size++;

        }

        int getAtIndex(int index) {

            Node temp = head;

            if (index > size()) {
                return -1;
            } else if (index < 0) {
                return -1;
            }
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            return temp.data;

        }

        void deleteAtIndex(int index){
            Node p =head;
            if (index == 0){
                head = head.next;
                size--;
                return;
            }
            for (int i = 1 ; i <= index-1;i++){
                p = p.next;
            }
            p.next = p.next.next;
            size--;
            if (index == size){
                tail = p;
            }
        }

        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() { // O(n)
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }

            return count;
        }

        void deleteAtNode(Node node){
            Node temp = head;
            while (temp.data != node.data){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        linkList linkList = new linkList();

        linkList.insertAtBeginning(234);
        linkList.insertAtEnd(23);
        linkList.insertAtEnd(2);
        linkList.insertAtEnd(43);
        linkList.insertAtEnd(254);
        
        linkList.display();


    }
}
