package SingleLinkedList;

public class problem1 {
    public static class node {
        int data;
        node next;

        //Constructor of the class
        node(int val) {
            this.data = val;
        }
    }


    public static node insertNewNodeAtBeginning(node head, int val) {
        node n = new node(val);

        n.next = head;
        head = n;

        return head;
    }

    public static void main(String[] args) {
        node n1 = new node(100);
        node n2 = new node(200);
        node n3 = new node(300);
        node n4 = new node(400);
        node n5 = new node(500);

        node n = new node(600);

        //Pointing on the previews node
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        //n1 node assign as head
        node head = n1;


        insertNewNodeAtBeginning(n, 600);

        display(head);

    }

    public static void display(node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}


