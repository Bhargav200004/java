package SingleLinkedList;

public class Problem3 {
    /*
    Given a LinkList , split it into two list such that one contain odd
    value , while the other contain event value
     */


    //checking the odd or even
    static boolean oddEven(int data){
        return data % 2 == 0;
    }

    public static void main(String[] args) {
        Implementation.linkList list = new Implementation.linkList();




        list.insertAtEnd(4);
        list.insertAtEnd(3);
        list.insertAtEnd(10);
        list.insertAtEnd(11);
        list.insertAtEnd(13);
        list.insertAtEnd(20);
        list.insertAtEnd(99);
        list.insertAtEnd(27);
        list.insertAtEnd(88);

        System.out.println("Displaying the list");
        list.display();

        Implementation.Node even = new Implementation.Node(23);
        Implementation.Node odd = new Implementation.Node(10);
        Implementation.Node t1 = even;
        Implementation.Node t2 = odd;
        Implementation.Node temp = list.head;

        while (temp != null){
            if (oddEven(temp.data)){
                t1.next = temp;
                t1 = temp;
            }
            else{
                t2.next = temp;
                t2 = temp;
            }
            temp = temp.next;
        }

        t1.next = null;
        t2.next = null;


        Implementation.Node e = even.next;
        Implementation.Node o = odd.next;

        System.out.println("\nevent list");
        while (e != null){
            System.out.print(" "+e.data);
            e = e.next;
        }
        System.out.println("\nodd list");
        while (o != null){
            System.out.print(" "+o.data);
            o = o.next;
        }
    }


}
