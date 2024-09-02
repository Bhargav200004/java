import java.util.ArrayList;
import java.util.List;

public class DeleteMinHeap {


    private static void swap(List<Integer> heap , int left , int right){
        int temp = heap.get(left);
        heap.set(left , heap.get(right));
        heap.set(right , temp);
    }

    private static void pushDownMinHeap(List<Integer> heap , int index){
        int size = heap.size() - 1;
        //base case
        if (index == size) return;

        int leftIndex = (index * 2) + 1;
        int rightIndex = (index * 2) + 2;
        int minimum = index;

        if (leftIndex <= size && heap.get(leftIndex) < heap.get(index)  ){
            minimum = leftIndex;
        }
        if ( rightIndex <= size && heap.get(rightIndex) < heap.get(index) ){
            minimum = rightIndex;
        }

        if (minimum == index) return;

        swap(heap , index , minimum);

        pushDownMinHeap(heap , minimum);
    }

    private static void deleteMinHeap(List<Integer> heap){
        int size = heap.size() - 1;
        swap(heap , 0 , size);
        heap.remove(size);
        pushDownMinHeap(heap , 0);

    }



    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);


        System.out.println(heap);
        deleteMinHeap(heap);
        System.out.println(heap);
    }
}
