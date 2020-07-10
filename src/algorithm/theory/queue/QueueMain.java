package algorithm.theory.queue;

public class QueueMain {
    public static void main(String[] args) {

    }

    private static class Queue{
        int[] arr;
        int size;
        int ptr;
        Queue(int size){
            ptr = 0;
            this.size = size;
            arr = new int[this.size];
        }

        /*enqueue*/
        void enqueue(int data){
            if(ptr < size){
                arr[ptr++] = data;
            }else {
                System.out.println("Queue is Full");
            }
        }
        
        /*dequeue*/
        /*isEmpty*/
        /*size*/
        /*toString*/
    }
}
