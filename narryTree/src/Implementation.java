import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Collections.reverse;

public class Implementation {
    private static class Node{
        int data;
        List<Node> child;

        Node(int data){
            this.data = data;
            child = new ArrayList<>();
        }
    }

    private static void formTree(Node root){
        // 30 -> 5 , 11 , 63
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        // 5 -> 1 , 4 , 8
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        // 11 -> 6 , 7 , 15
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        //63 ->
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

    static void preOrderTraversal(Node root){
        if (root.child.isEmpty()) {
            System.out.print(root.data + " ");
            return;
        }
        System.out.print(root.data + " ");
        for (var val : root.child){
            preOrderTraversal(val);
        }

    }

    static void bfsTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.data +" ");
            queue.addAll(temp.child);
        }
    }

    static void zigZagTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()){
            List<Integer> value = new ArrayList<>();
            int size = queue.size();

            while (size-- >0){
                Node temp = queue.remove();
                value.add(temp.data);
                queue.addAll(temp.child);
            }

            if (count % 2 == 0){
                System.out.println(value+" ");
            }
            else {
                reverse(value);
                System.out.println( value +" ");
            }
            count++;
        }
    }

    public static int findMax(Node root , int max){
        if(root.child.isEmpty()){
            return root.data;
        }


        for (var value : root.child){
            max = Math.max(findMax(value , max),value.data);
        }
        return max;
    }

    public static void mirror(Node root){
        if(root.child.isEmpty()) return;

        if (root.child.size() == 1) return;

        for (int i = 0; i < root.child.size() ; i++){
            mirror(root.child.get(i));
            reverse(root.child);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);

        formTree(root);

        System.out.println();
        preOrderTraversal(root);
        System.out.println("\nBfs");
        bfsTraversal(root);
        System.out.println("\nZig-Zag");
        zigZagTraversal(root);
        System.out.println("\nMax Element");
        System.out.println(findMax(root , 0));
        System.out.println("\nReverse");
        mirror(root);
        bfsTraversal(root);


    }

}
