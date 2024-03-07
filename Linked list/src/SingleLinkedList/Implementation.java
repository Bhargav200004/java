package SingleLinkedList;

/*
    Q1. Implement a method to insert a node at beginning.
    Q2. Implement a method to insert a node at end.
    Q3. Implement a method to insert a node at a specific index.
    Q4. Implement a method to return the element at any given index of link list
 */

public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkList {
        Node head = null; //initialize at null
        Node tail = null;//initialize at null

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

        void display() {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
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
        System.out.println(linkList.getAtIndex(0));

        linkList.display();
        System.out.printf("\nsize of the linkList %d", linkList.size());
    }
}
