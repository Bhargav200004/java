import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k = 3;
        arrayList.add(24);
        arrayList.add(26);
        arrayList.add(21);
        arrayList.add(2);
        arrayList.add(2099);
        arrayList.add(635);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Integer integer : arrayList) {
            if (k + 1 == priorityQueue.size()) {
                if (priorityQueue.peek() < integer) {
                    priorityQueue.poll();
                    priorityQueue.add(integer);
                }
                continue;
            }
            priorityQueue.add(integer);
        }
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }

}
