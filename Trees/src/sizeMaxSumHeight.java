public class sizeMaxSumHeight {

    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }

    static int preOrderTraversal(Node root){
        //Base case
        if (root == null) return 0;
        return preOrderTraversal(root.left) +  preOrderTraversal(root.right) + 1;
    }

    static int preOrderSumTraversalNode(Node root){
        if (root == null) return 0;
        return root.data + preOrderSumTraversalNode(root.left) +  preOrderSumTraversalNode(root.right) ;
    }

    static int preOrderMaxValue(Node root){
        if (root == null) return Integer.MIN_VALUE;
        return Math.max(Math.max(root.data , preOrderMaxValue(root.left) ), preOrderMaxValue(root.right) );
    }

    static int preOrderMaxHeight(Node root) {
        // There are two base cases for the root node
        if (root == null) return 0;
        // and leaf node
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(preOrderMaxHeight(root.left) , preOrderMaxHeight(root.right));
    }

    static int preOrderMinValue(Node root){
        if (root == null) return Integer.MAX_VALUE;
        return Math.min( root.data,Math.min( preOrderMinValue(root.left), preOrderMinValue(root.right)));
    }

    static int preOrderProductValue(Node root){
        if (root == null ) return 1;
        return root.data * preOrderProductValue(root.left) * preOrderProductValue(root.right);

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
        System.out.println(preOrderTraversal(root));
        System.out.println("Sum of all node are " + preOrderSumTraversalNode(root));
        System.out.println("Max value of the tree are " + preOrderMaxValue(root));
        System.out.println("Max height of the tree are " + preOrderMaxHeight(root));
        System.out.println("Min value of the tree are " + preOrderMinValue(root));
        System.out.println("Product of the tree are " + preOrderProductValue(root));
        
    }
}
