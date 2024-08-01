import java.util.LinkedList;
import java.util.Queue;

public class breathFirstSearch {

    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }

    static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();

        if (root != null) queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.peek();
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
            System.out.print(temp.data + " ");
            queue.remove();
        }

    }



    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right= d;
        Node e = new Node(6);
        b.right = e;
        Node g = new Node(7);
        e.right = g;
        Node f = new Node(8);
        g.right = f;

        bfs(root);
    }
}
