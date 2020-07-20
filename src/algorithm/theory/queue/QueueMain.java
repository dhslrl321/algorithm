package algorithm.theory.queue;

import java.util.Arrays;

public class QueueMain {
    public static void main(String[] args) {

    }

    private static class Queue{
        int[] arr;
        int size;
        int front, rear;
        Queue(int size){
            front = 0;
            rear = 0;
            this.size = size;
            arr = new int[this.size];
        }

        /*enqueue*/
        void enqueue(int data){
            if(rear < size) {
                arr[rear++] = data;
            }else {
                System.out.println("Queue is Full");
            }
        }

        /*size*/

        /*isEmpty*/

        /*toString*/
    }
}
