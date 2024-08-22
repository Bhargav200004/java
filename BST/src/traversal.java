import java.util.*;

public class traversal {
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


    static void  preorder(Node root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void sortedTree(Node root , ArrayList<Integer> ans ){
        if (root == null) return ;

        sortedTree(root.left , ans );
        ans.add(root.data);
        sortedTree(root.right , ans);
    }

    public static void main(String[] args) {
        String [] arr = {"10","5","15","2","8","12","17"};
        Node root = constructBFS(arr);
        preorder(root);

        System.out.println();
        ArrayList<Integer> ans =  new ArrayList<>();
        sortedTree(root, ans );
        System.out.println(ans);
    }
}
