public class CircularQueueImpl {

    static class Cqa{
        static int rear = -1;
        static int front = -1;
         int size = 0;
        static int [] arr = new int[5];

        void add(int val) throws Exception{
            if (size == arr.length) {
                throw new Exception("Queue is Full");
            }
            else if (size == 0){
                front = rear = 0;
                arr[0] = val;
                size++;
            }else if (rear < arr.length-1){
                arr[++rear] = val;
                size++;
            }
            else if(rear == arr.length){
                rear = 0;
                arr[0] = val;
            }
        }

        int remove() throws Exception{
            if (size == 0){
                throw new Exception("Queue is Empty");
            }
            else{
                int val = arr[front];
                if (front == arr.length-1){
                    front = 0 ;
                }
                else {
                    front++;
                }
                size--;
                return val;
            }
        }

        int peek() throws Exception{
            if (size == 0){
                throw  new Exception("Queue is Empty");
            }else return arr[front];
        }

        void display(){
            if (size == 0){
                System.out.println("Queue is empty");
            }
            else if(front<=rear){
                for (int i = front ; i<= rear ; i++){
                    System.out.print(arr[i]+" ");
                }
            }else{
                for (int i = front ; i<arr.length;i++){
                    System.out.print(arr[i] +" ");
                }
                for (int i = 0 ; i<rear;i++){
                    System.out.print(arr[i] +" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{
        Cqa circularQueue = new Cqa();

        circularQueue.display();
        circularQueue.add(1);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.add(4);
        circularQueue.add(5);
        circularQueue.display();
        circularQueue.display();
        circularQueue.add(6);
        circularQueue.display();
        circularQueue.remove();
        circularQueue.add(7);
        circularQueue.display();
    }
}
