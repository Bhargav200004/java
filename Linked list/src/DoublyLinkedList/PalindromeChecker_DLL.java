package DoublyLinkedList;

public class PalindromeChecker_DLL {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    static Boolean checkPalindrome(Node head){
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;
        temp = head;

        Node temp1 = tail;

        while (temp != temp1){
            if (temp.data != temp1.data) return false;
            temp = temp.next;
            temp1 = temp1.prev;
        }

        return true;
    }

    static Boolean findTwoSumDLL(Node head , int target){

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;

        temp = head;

        Node temp1 = tail;

        while(temp.data < temp1.data){
            if ((temp.data + temp1.data) == target) {
                return true;
            }
            else if((temp.data + temp1.data) > target){
                temp1 = temp1.prev;
            }
            else {
                temp = temp.next;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;


        h.prev = g;
        g.prev = f;
        f.prev = e;
        e.prev = d;
        d.prev = c;
        c.prev = b;
        b.prev = a;
        a.prev = null;

//        System.out.println(checkPalindrome(a));
        System.out.println(findTwoSumDLL(a,3));

    }

}
