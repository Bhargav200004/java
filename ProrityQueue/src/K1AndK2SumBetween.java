import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class K1AndK2SumBetween {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(8);
        list.add(22);
        list.add(4);
        list.add(12);
        list.add(10);
        list.add(14);

        int k1 = 3 , k2 = 6;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0 ; i < list.size() ; i++){
            priorityQueue.add(list.get(i));
            if (priorityQueue.size() > k2){
                priorityQueue.remove();
            }
        }

        priorityQueue.remove();

        int sum = 0;
        while(priorityQueue.size() != k1){
            sum = priorityQueue.remove() + sum;
        }

        System.out.println(sum);
    }
}
