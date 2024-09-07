import java.util.ArrayList;
import java.util.List;

public class InsertMaxHeap {

    private static void pushUpMaxHeap(List<Integer> heap , int index){
        int parent = (index - 1) / 2;
        if (index == 0 || heap.get(parent) > heap.get(index)) return;

        int temp = heap.get(parent);
        heap.set(parent , heap.get(index));
        heap.set(index , temp);

        pushUpMaxHeap(heap , parent);
    }

    private static void insertMaxHeap(List<Integer> heap , int element){
        heap.add(element);
        int index = heap.size() - 1;

        pushUpMaxHeap(heap , index);

    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();

        heap.add(60);
        heap.add(50);
        heap.add(40);
        heap.add(30);
        heap.add(20);
        heap.add(30);
        heap.add(10);

        System.out.println(heap);
        insertMaxHeap(heap , 70);
        System.out.println(heap);

    }
}
