import java.util.HashMap;

public class nodeToRootPath {


    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }

    static  void NodeToRoot(Node root ){
        if (root == null) return;
        if(root.left != null && root.right != null){
            System.out.println(root.data);
        }
        NodeToRoot(root.left   );
        NodeToRoot(root.right  );


    }

    public static void main(String[] args) {



        Node root = new Node(100);
        Node a = new Node(200);
        Node b = new Node(300);
        root.left = a;
        root.right = b;
        Node c = new Node(400);
        Node d = new Node(500);
        a.left = c;
        a.right= d;
        Node e = new Node(600);
        b.right = e;
        NodeToRoot(root );
    }
}
