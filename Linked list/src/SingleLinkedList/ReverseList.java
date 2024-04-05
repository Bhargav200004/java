package SingleLinkedList;

public class ReverseList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static void display(Node head){
        if (head == null) return;
        System.out.print(head.data +" ");
        display(head.next);
    }

    static void displayRev(Node head){
        if (head == null) return;
        displayRev(head.next);
        System.out.print(head.data + " ");
    }

    static Node reverseList(Node head){
        if (head.next == null) return head;
        Node reverseNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverseNode;
    }
    public static void main(String[] args) {
        Node a = new Node(34);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(74);
        Node e = new Node(54);
        Node f = new Node(396);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

//       System.out.println("Printing The list in the order");
//        display(a);
//
//        System.out.println("\nPrinting the list in the reverse order");
//        displayRev(a);

//        Node r = reverseList(a);
//
//        display(r);


        Node curr = a;
        Node prev = null;
        Node front = null;

        while (curr!=null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        System.out.println("print with iteration");
        display(prev);
    }

}
