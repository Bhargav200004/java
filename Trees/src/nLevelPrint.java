public class nLevelPrint {

    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }

    static void levelPrint(Node root , int level){
        if (root == null) return;
        if (level == 1) System.out.print(root.data + " ");
        levelPrint(root.left , level-1);
        levelPrint(root.right , level - 1);
    }

    static int height(Node root){
        if(root == null ) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
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
        int height = height(root) + 1;
        System.out.println("height" + height);
        for (int i = 0 ; i < height ; i++){
            levelPrint(root , i);
            System.out.println();
        }
    }
}