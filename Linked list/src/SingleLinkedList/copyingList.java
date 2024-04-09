package SingleLinkedList;

public class copyingList {
    static class Node {
        int data;
        Node next;

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

    static Node add(int val){
        return new Node(val);
    }

     static Node copyList(Node head){

        Node dummy = new Node(3);
        Node temp =  dummy;

        while (head != null){
            Node a = add(head.data);
            temp.next = a;
            temp = temp.next;
            head = head.next;
        }
        return dummy.next;
     }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        System.out.println();
        display(copyList(a));
    }
}
