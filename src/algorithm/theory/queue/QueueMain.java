package algorithm.theory.queue;

import java.util.Arrays;

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
        int dequeue(){
            if(ptr > 0){
                return arr[ptr--];
            }else {
                System.out.println("Queue is Empty");
                return -1;
            }
        }

        /*isEmpty*/
        boolean isEmpty(){
            return ptr == 0;
        }

        /*size*/
        int size(){
            return ptr;
        }

        /*toString*/
        String toStringQueue(){
            return Arrays.toString(arr);
        }
    }
}
