import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class boundaryTraversal {

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


    static void BoundaryPrinting(Node root){
        LeftBoundary(root);
        BottomBoundary(root);
        RightBoundary(root.right);
    }

    private static void LeftBoundary(Node root) {
        if (root == null || (root.left== null && root.right == null)) return;
        System.out.print(root.data + " ");

        if (root.left != null) LeftBoundary(root.left);
        else LeftBoundary(root.right);
    }

    private static void BottomBoundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) System.out.print(root.data + " ");
        BottomBoundary(root.left);
        BottomBoundary(root.right);
    }

    private static void RightBoundary(Node root) {
        if (root == null || (root.left == null && root.right == null)) return;

        if (root.right != null ) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.data + " ");

    }





    public static void main(String[] args) {
        String [] arr = { "1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "9", "10", "", "11", "", "12", "", "13", "", "14", "15", "16", "", "17", "", "", "", "18", "19", "", "", "", "20", "21", "22", "23", "", "24", "25", "26", "27", "", "", "28" };;
        Node root = constructBFS(arr);

//        int height = height(root);
//        for (int i = 1 ; i <= height ; i++){
//            LeftToRight(root , i);
//            System.out.println();
//        }

        BoundaryPrinting(root);
    }
}
