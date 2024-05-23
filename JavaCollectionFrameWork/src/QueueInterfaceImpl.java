import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceImpl {
    static void queueImpl(){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains(3));
        System.out.println(queue);

    }

    static void priorityQueueImpl(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(4);
        priorityQueue.add(9);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }


    public static void main(String[] args) {
//        queueImpl();
        priorityQueueImpl();
    }
}
