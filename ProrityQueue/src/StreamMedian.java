import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StreamMedian {

    private static void add(PriorityQueue<Integer> leftPq , PriorityQueue<Integer> rightPq , int element){
        if (leftPq.isEmpty()){
            leftPq.add(element);
            return;
        }

        // left jana hai (element < leftPq.peek())
        if (element < leftPq.peek()){
            if (leftPq.size() == rightPq.size()){
                leftPq.add(element);
            }
            else{
                rightPq.add(leftPq.remove());
                leftPq.add(element);
            }
        }
        //  right jana hai (element > rightPq.peek())
        else{
            if (leftPq.size() == rightPq.size()){
                leftPq.add(rightPq.remove());
                rightPq.add(element);
            }else{
                rightPq.add(element);
            }
        }
    }

    private static double median(PriorityQueue<Integer> leftPq , PriorityQueue<Integer> rightPq){
        if (rightPq.isEmpty() || leftPq.isEmpty()) return -1;
        else if (leftPq.size() - rightPq.size() == 1) {
            return leftPq.peek();
        }
        else{
            return (double)(leftPq.peek() + rightPq.peek()) / 2;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>();

    }
}
