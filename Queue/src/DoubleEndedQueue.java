import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(100);
        dq.addFirst(4500);
        dq.addLast(5600);
        dq.add(1);

        System.out.println(dq);

    }
}
