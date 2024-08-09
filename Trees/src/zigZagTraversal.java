import java.util.ArrayList;
import java.util.List;

public class zigZagTraversal {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node (int data) {
            this.data = data;
        }
    }




    static int height(Node root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    static void leftToRight(Node root , int idx , List<Integer> value ) {
        if (root == null) return ;
        if (idx == 1 ) {
            value.add(root.data);
            return ;
        }
        leftToRight(root.left , idx-1 , value);
        leftToRight(root.right , idx-1 , value);
    }
    static void RightToLeft(Node root , int idx , List<Integer> value) {
        if (root == null) return ;
        if (idx == 1 ) {
            value.add(root.data);
            return ;
        }
        RightToLeft(root.right , idx-1 , value);
        RightToLeft(root.left , idx-1 , value );
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node a = new Node(9);
        Node b = new Node(20);
        root.left = a;
        root.right = b;
        Node c = new Node(15);
        Node d = new Node(17);
        b.left = c;
        b.right= d;


        List<List<Integer>> ans = new ArrayList<>();

        int height = height(root) ;
        for (int i = 1; i <= height; i++) {
            List<Integer> value = new ArrayList<>();
            if( i % 2 == 0 ){
                RightToLeft(root , i , value);
            }
            else {
               leftToRight(root , i , value);
            }
            ans.add(value);
        }

        System.out.println(ans);
//        [[3],[20,9],[15,7]]

    }
}
