public class HeapImpl {
    private int size = 0;
    private final int [] heap;

    HeapImpl(int capacity){
        heap = new int[capacity];
    }

    int parentIndex(int index){
        return (index - 1) / 2;
    }

    int rightIndex(int index){
        return (2 * index) + 2;
    }

    int leftIndex(int index){
        return ( 2 * index) + 1;
    }

    void heapify(int index){

        if(leftIndex(index) > size){
            return;
        }

        int smallestIndex = index;

        if(leftIndex(index) < size &&  heap[leftIndex(index)] < heap[smallestIndex]){
            smallestIndex = leftIndex(index);
        }

        if(rightIndex(index) < size && heap[rightIndex(index)] < heap[smallestIndex]){
            smallestIndex = rightIndex(index);
        }

        if (smallestIndex != index) {
            int temp = heap[index];
            heap[index] = heap[smallestIndex];
            heap[smallestIndex] = temp;

            heapify(smallestIndex);
        }
    }

    int getMin(){
        if(size < 0) return -1;
        return heap[0];
    }

    int size(){
       return size;
    }

    void insert(int value){
        if(size == heap.length){
            System.out.println("Heap OverFlow");
            return;
        }

        heap[size] = value;

        int k = size;
        while(k != 0 && heap[parentIndex(k)] > heap[k]){
            int temp = heap[parentIndex(k)];
            heap[parentIndex(k)] = heap[k];
            heap[k] = temp;
            k = parentIndex(k);
        }
        size++;
    }

    void delete(){
        if (size == 0) {
            System.out.println("Heap is empty");
        }
        size--;
        heap[0] = heap[size];
        heapify(0);
    }

    void printHeap(){
        for (int val : heap){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    void buildHeap(int [] unsortedArray){
        this.size = unsortedArray.length ;
        System.arraycopy(unsortedArray, 0, heap, 0, size);

        int lastParent = parentIndex(size);

        for (int i = lastParent; i >= 0; i--) {
            heapify(i);
        }
    }

    public static void main(String[] args) {
        HeapImpl heap1 = new HeapImpl(10);

        int [] unsortedArray = {3,11, 43, 1, 1, 5 , 2};

        heap1.buildHeap(unsortedArray);
        heap1.printHeap();
    }

}
