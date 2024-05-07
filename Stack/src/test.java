class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


public class test {

    static String convert(Node head){
        String ans = "";
        while(head != null){
            ans =ans+head.data;
            head = head.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = {1,8,9};
        LinkedList list = new LinkedList();
        for (int data : array) {
            list.add(data);
        }
        System.out.println(convert(list.head).getClass().getName());

        System.out.println(Integer.parseInt(convert(list.head))*2);

        // Declaring the number
        String number =Integer.toString(Integer.parseInt(convert(list.head))*2);

        System.out.println(number);
        LinkedList ans = new LinkedList();
        for (int i = 0 ; i < number.length(); i++){
            ans.add((int) number.charAt(i) - 48);
        }

        ans.display();


    }

    //[998,961,943,920,698]
}
