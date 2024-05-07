import java.util.*;

public class QueueBasicImpl {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();


        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        System.out.println(queue);


        //Printing without using build in function
        while(queue.size() > 0){
            temp.add(queue.remove());
        }
        while(temp.size() > 0){
            int remove = temp.remove();
            System.out.print(remove+" ");
            queue.add(remove);
        }


    }
}
