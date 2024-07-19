import java.util.Optional;

public class implementation {

    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }


    static void displayTree(Node root){
        //base case

        // self Work

        if (root == null ) return;
        System.out.print(root.data + " -> ");
        if(root.left != null) System.out.print(root.left.data + ",");
        else System.out.print(null + ",");
        if(root.right != null) System.out.print(root.right.data);
        else System.out.print((Object) null);

        System.out.println();

        //Recursive work

        displayTree(root.left);
        displayTree(root.right);
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
        displayTree(root);
    }
}
