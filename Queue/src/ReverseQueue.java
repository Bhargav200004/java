import java.util.*;

public class ReverseQueue {


    //Reverse Queue
    static Queue<Integer> reverseQue(Queue<Integer> queue){
        Stack<Integer> st = new Stack<>();
        while(!queue.isEmpty()){
            st.push(queue.poll());
        }

        while (!st.isEmpty()){
            queue.add(st.pop());
        }
        return queue;
    }

    //Reverse Queue k element of queue
    static Queue<Integer> reverseQueK(Queue<Integer> queue, int k) throws Exception{
        Stack<Integer> st = new Stack<>();

        if (queue.size() < k){
            throw new Exception("OverFlow");
        }else {
            for (int i = 0; i < k; i++) {
                st.push(queue.poll());
            }

            for (int i = 0; i < k; i++) {
                queue.add(st.pop());
            }
            int n = queue.size();
            for (int i = 0 ; i < n - k ;i++){
                queue.add(queue.poll());
            }
            return queue;
        }
    }

    public static void main(String[] args) throws Exception{
        Queue<Integer> queue = new LinkedList<>();


        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println("Queue");
        System.out.println(queue);



//        System.out.println("Reverse Queue");
//        System.out.println(reverseQue(queue));


        System.out.println("Reverse Queue for 5 element");
        System.out.println(reverseQueK(queue,5));


    }
}
