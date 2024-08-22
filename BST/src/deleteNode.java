import java.util.LinkedList;
import java.util.Queue;

public class deleteNode {
    static class Node{

        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static Node constructBFS(String [] arr){
        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int n = arr.length;

        int i = 1;
        while (i < n-1){
            Node left = new Node(239);
            Node right = new Node(239);
            Node temp = queue.remove();

            if (arr[i].isEmpty()){
                left = null;
            }else{
                left.data = Integer.parseInt(arr[i]);
                queue.add(left);
            }

            if (arr[i + 1].isEmpty()){
                right = null;
            }
            else{
                right.data = Integer.parseInt(arr[i+1]);
                queue.add(right);
            }

            temp.left = left;
            temp.right = right;

            i+=2;
        }
        return root;

    }


    static int height(Node root){
        if (root == null) return 0;
        return 1 + Math.max(height(root.left) , height(root.right));
    }

    static void LeftToRight(Node root , int idx){
        if (root == null) return;
        if (idx == 1) {
            System.out.print(root.data +" ");
            return;
        }
        LeftToRight(root.left , idx - 1);
        LeftToRight(root.right , idx - 1);
    }

    static void deleteLeafNode(Node root , int target){
        if (root == null) return;
        if (root.data > target) {
            if (root.left == null) return;
            if (root.left.data == target) root.left = null;
            else deleteLeafNode(root.left , target);
        }
        else {
            if (root.right == null) return;
            if (root.right.data == target) root.right = null;
            else deleteLeafNode(root.right , target);
        }
    }


    static void deleteOneChildNode(Node root , int target){
        if (root == null) return;
        if (root.data > target) {
            if (root .left == null) return;
            if (root.left.data == target){
                if (root.left.left == null && root.left.right == null) root.left = null;
                else if(root.left.left == null || root.left.right == null) {
                    if(root.left.left != null) root.left = root.left.left;
                    else root.left = root.left.right;
                }
            }
            else deleteOneChildNode(root.left , target);
        }
        else {
            if (root.right == null) return;
            if (root.right.data == target){
                if (root.right.left == null && root.left.right == null) root.right = null;
                else if (root.right.left == null || root.left.right == null ) {
                    if (root.right.left != null ) root.right = root.right.left;
                    else root.right = root.right.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        String [] arr = {"50" , "20" , "60" , "17" , "34" , "55" , "89" , "10" , "" , "28" , "" , "", "" ,"70" , "" , "", "14"  };
        Node root = constructBFS(arr);
        int height = height(root);
        for (int i = 1 ; i <= height ; i++ ){
            LeftToRight(root,i);
            System.out.println();
        }
        System.out.println();
        deleteOneChildNode(root , 34);
        for (int i = 1 ; i <= height ; i++ ){
            LeftToRight(root,i);
            System.out.println();
        }
    }
}
