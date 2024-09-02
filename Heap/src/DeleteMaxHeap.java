import java.util.ArrayList;
import java.util.List;

public class DeleteMaxHeap {


    static void swap (List<Integer> heap  , int left , int right){
        int temp = heap.get(left);
        heap.set(left , heap.get(right));
        heap.set(right , temp);
    }

    static void deleteMaxHeap(List<Integer> heap){
        int size = heap.size() - 1;
        swap(heap , 0 , size);
        heap.remove(size);

        pushDownMaxHeap(heap , 0);
    }

    static void pushDownMaxHeap(List<Integer> heap , int index){
        int size = heap.size() - 1 ;

        if (index == size) return;

        int leftIndex = (index * 2 ) + 1;
        int rightIndex = (index * 2) + 2;
        int maximum = index;

        if (leftIndex<= size && heap.get(leftIndex) > heap.get(index)){
            maximum = leftIndex;
        }
        if (rightIndex <= size && heap.get(rightIndex) > heap.get(index)){
            maximum = rightIndex;
        }

        if (index == maximum) return;

        swap(heap , index , maximum);

        pushDownMaxHeap(heap , maximum);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();

        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);

        System.out.println(heap);
        deleteMaxHeap(heap);
        System.out.println(heap);
    }
}
