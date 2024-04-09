package SingleLinkedList;

public class PalindromeLinkList {

    static class Node {
        int val;
        Node next;

        Node(int data) {
            this.val = data;
        }
    }

    static void display(Node head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    //creating new node
    static Node add(int data) {
        Node node = new Node(data);
        return node;
    }


    //Issue ///////////////////////////////////////////////////////////
    static Node copyList(Node head){

        Node dummy = new Node(3);
        Node temp =  dummy;

        while (head != null){
            Node a = add(head.val);
            temp.next = a;
            temp = a;
            head = head.next;
        }
        return dummy.next;
    }

    //reverse the list
    static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node rev = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    static boolean isPalindrome(Node head) {
        Node temp1 = head;

        Node a = copyList(head);

        Node temp2 = reverse(a);

        if (head == null || head.next == null) {
            return false;
        }

        while (temp1 != null) {
            if (temp1.val != temp2.val) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return true;
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




        System.out.println(isPalindrome(a));

    }
}

