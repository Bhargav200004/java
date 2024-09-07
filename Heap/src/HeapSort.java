import java.util.ArrayList;
import java.util.List;

public class HeapSort {

    private static void swap(List<Integer> heap , int left , int right){
        int temp = heap.get(left);
        heap.set(left , heap.get(right));
        heap.set(right , temp);
    }

    private static void pushDownHeap(List<Integer> heap , int index , int size){

        if (index == size) return;

        int leftIndex = (index * 2) + 1;
        int rightIndex = (index * 2) +2;
        int minimum = index;

        if (leftIndex <= size && heap.get(leftIndex) < heap.get(minimum)){
            minimum = leftIndex;
        }
        if (rightIndex <= size && heap.get(rightIndex) < heap.get(minimum)){
            minimum = rightIndex;
        }

        if (minimum == index) return;

        swap(heap , index , minimum);

        pushDownHeap(heap , minimum , size);
    }

    private static void heapyfy(List<Integer> heap){
        int size = heap.size() - 1;

        int firstNonLeafNode = (size - 1) / 2;

        for (int i = firstNonLeafNode ; i >= 0 ; i--){
            pushDownHeap(heap , i , size);
        }
    }

    private static void deleteMin(List<Integer> heap ){
        int size = heap.size() - 1;
        for (int i = size ; i > 0 ; i--){
            swap(heap , 0 , i);
            pushDownHeap(heap , 0 , i - 1);
        }

    }

    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(9);
        heap.add(1);
        heap.add(7);
        heap.add(4);
        heap.add(14);
        heap.add(3);
        heap.add(5);
        heap.add(11);
        System.out.println(heap);
        heapyfy(heap);
        System.out.println(heap);
        int size = heap.size() - 1;
        deleteMin(heap );
        System.out.println(heap);
    }
}
