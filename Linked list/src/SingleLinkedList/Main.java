package SingleLinkedList;

public class Main {

    public static void display(Node head){
        while (head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //for recursion display
    public static void displayR(Node head){
        if (head==null) return;
        System.out.print(head.data+" ");
        displayR(head.next);
    }


    public static int sizeList(Node head){
        int count=0;
        while(head!=null){
           head = head.next;
           count++;
        }
       return count;
    }

    public static void main(String[] args) {
        Node a = new Node(55);
        Node b = new Node(54);
        Node c = new Node(25);
        Node d = new Node(85);
        Node e = new Node(5335);


        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        System.out.println();
        System.out.println("It is recursion display ");
        displayR(a);
        System.out.println();
        System.out.println("size of the list");
        System.out.println(sizeList(a));


    }
}
