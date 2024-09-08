import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumElement {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int k = 3;

        list.add(2);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(5);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(list);
        System.out.println(priorityQueue);

        for (int i = 0 ; i < k ; i++){
            int firstElement = priorityQueue.remove();
            int secondElement = priorityQueue.remove();
            priorityQueue.add(firstElement * secondElement);
        }

        while (priorityQueue.size() != 1) priorityQueue.poll();

        System.out.println(priorityQueue.peek());
    }
}
