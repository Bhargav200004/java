package SingleLinkedList;

public class Main {

    public static void display(introductionToLinkedList head){
        while (head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //for recursion display
    public static void displayR(introductionToLinkedList head){
        if (head==null) return;
        System.out.print(head.data+" ");
        display(head.next);
    }


    public static int sizeList(introductionToLinkedList head){
        int count=0;
        while(head!=null){
           head = head.next;
           count++;
        }
       return count;
    }

    public static void main(String[] args) {
        introductionToLinkedList a = new introductionToLinkedList(55);
        introductionToLinkedList b = new introductionToLinkedList(54);
        introductionToLinkedList c = new introductionToLinkedList(25);
        introductionToLinkedList d = new introductionToLinkedList(85);
        introductionToLinkedList e = new introductionToLinkedList(5335);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        introductionToLinkedList temp = a;
        display(temp);
        System.out.println();
        System.out.println("IT is recursion display ");
        displayR(temp);
        System.out.println();
        System.out.println("size of the list");
        System.out.println(sizeList(temp));


    }
}
