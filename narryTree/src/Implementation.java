import java.util.ArrayList;
import java.util.List;

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

    public static void main(String[] args) {
        Node root = new Node(30);

        formTree(root);

        preOrderTraversal(root);

    }

}
