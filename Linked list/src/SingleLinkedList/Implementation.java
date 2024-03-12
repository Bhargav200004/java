package SingleLinkedList;

/*
    Q1. Implement a method to insert a node at beginning.
    Q2. Implement a method to insert a node at end.
    Q3. Implement a method to insert a node at a specific index.
    Q4. Implement a method to return the element at any given index of link list
    Q5. Implement a method to delete a node at specific index

 */

public class Implementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class linkList {
        Node head = null; //initialize at null
        Node tail = null;//initialize at null
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

        linkList.insertAtIndex(34, 4);
        linkList.insertAtIndex(1302, 6);

        linkList.deleteAtIndex(6);
        System.out.println(linkList.getAtIndex(0));

        System.out.printf("tail data %d\n" , linkList.tail.data);
        System.out.printf("head data %d\n" , linkList.head.data);


        linkList.display();
        System.out.printf("\nsize of the linkList %d \n", linkList.size());

    }
}
