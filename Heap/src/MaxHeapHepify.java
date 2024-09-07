import java.util.ArrayList;
import java.util.List;

public class MaxHeapHepify {


    private static void swap(List<Integer> heap , int left , int right){
        int temp = heap.get(left);
        heap.set(left,heap.get(right));
        heap.set(right,temp);
    }

    private static void pushDownMinHeap(List<Integer> heap , int index , int size){

        if (index == size) return;

        int leftIndex = (index * 2) + 1;
        int rightIndex = (index * 2 ) + 2;
        int minimum = index;

        if (leftIndex <= size && heap.get(leftIndex) < heap.get(minimum)){
            minimum = leftIndex;
        }
        if (rightIndex <= size && heap.get(rightIndex) < heap.get(minimum)){
            minimum = rightIndex;
        }

        if (minimum == index) return;

        swap(heap , index , minimum);
        pushDownMinHeap(heap , minimum , size);

    }


    private static void heapify(List<Integer> heap){
        int firstNonLeafNode = ( (heap.size() - 1 ) - 1 ) / 2;

        int size = heap.size() -1;

        for (int i = firstNonLeafNode ; i >= 0 ; i--){
            pushDownMinHeap(heap , i , size);
        }
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
        heapify(heap);
        System.out.println(heap);
    }
}
