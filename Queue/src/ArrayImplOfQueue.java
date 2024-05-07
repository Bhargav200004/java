public class ArrayImplOfQueue {

    static class ArrayImpl{
       static int size = 0;
       static int arraySize = 5;
       static int []arr = new int[arraySize];
       static int font = -1;
       static int rear = -1;


       void add(int value){
           if (isEmpty()){
               font = rear = 0;
               arr[font++] = value;
               size++;
           }
           else if(isFull()){
               System.out.println("OverFlow");
           }
           else {
               arr[font++] = value;
               size++;
           }
       }

       int remove(){
           if (isEmpty()){
               System.out.println("UnderFlow");
               return -1;
           }
           else{
               size--;
               return arr[rear++];
           }
       }

       void display(){
           for (int i = rear ; i < font ; i++){
               System.out.print(arr[i]+" ");
           }
           System.out.println();
       }

       void peek(){
           System.out.print(arr[rear]+"\n");
       }

       int size(){
           return size;
       }

       Boolean isEmpty(){
           return size==0;
       }

       Boolean isFull(){
           return size==arraySize;
       }


    }

    public static void main(String[] args) {
        ArrayImpl queue = new ArrayImpl();


        queue.add(45);
        queue.add(90);
        queue.add(100);
        queue.add(2);
        queue.add(11);

        System.out.println("Size of queue :- "+queue.size());

        queue.peek();

        queue.display();

        queue.remove();

        System.out.println(queue.rear);
        queue.display();



    }
}
