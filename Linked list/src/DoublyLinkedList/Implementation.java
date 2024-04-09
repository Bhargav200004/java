package DoublyLinkedList;

public class Implementation {

    static class Node{

        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static void displayR(Node tail){
        while (tail != null){
            System.out.print(tail.data+" ");
            tail = tail.prev;
        }
    }

    static void randomDisplay(Node random){

        while (random.prev != null){
            random = random.prev;
        }

        while (random != null){
            System.out.print(random.data + " ");
            random = random.next;
        }
    }


    public static void main(String[] args) {

        // 20 3 345 456 3 2

        Node a = new Node(20);
        Node b = new Node(3);
        Node c = new Node(345);
        Node d = new Node(456);
        Node e = new Node(3);
        Node f = new Node(3);
        Node g = new Node(2);

        a.next = b;
        a.prev = null;

        b.next = c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.next = e;
        d.prev = c;

        e.next = f;
        e.prev = d;

        f.next = g;
        f.prev = e;

        g.next = null;
        g.prev = f;

        display(a);
        System.out.println();
        displayR(g);
        System.out.println();
        randomDisplay(c);


    }
}
