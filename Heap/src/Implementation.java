import java.util.ArrayList;
import java.util.List;

public class Implementation {

    private static void pushUpMinHeap(List<Integer> heap , int index){
        int parent = (index - 1) / 2;
        if (index == 0 || heap.get(parent) < heap.get(index)) return;
        int temp = heap.get(parent);
        heap.set(parent , heap.get(index));
        heap.set(index , temp);
        pushUpMinHeap(heap , parent);
    };

    private static void insertInMinHeap(List<Integer> heap , int element){
        heap.add(element);

        int index = heap.size() - 1;

        pushUpMinHeap(heap , index);
    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);

        System.out.println(heap);
        insertInMinHeap(heap , 434);
        System.out.println(heap);
    }
}
