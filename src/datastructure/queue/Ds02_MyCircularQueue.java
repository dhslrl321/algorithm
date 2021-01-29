package datastructure.queue;

import java.util.Arrays;
import java.util.Scanner;

class Ds02_MyCircularQueue {
    public static void main(String[] args) {

        MyCircularQueue queue = new MyCircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("dequeue num : " + queue.dequeue());
        System.out.println("dequeue num : " + queue.dequeue());
        System.out.println("dequeue num : " + queue.dequeue());
        System.out.println("dequeue num : " + queue.dequeue());

        queue.enqueue(50);
        queue.dequeue();
        queue.dequeue();



    }
}
class MyCircularQueue {
    private int MAX_QUEUE_SIZE;
    private int front;
    private int rear;
    int[] queue;
    MyCircularQueue(int size) {
        MAX_QUEUE_SIZE = size;
        queue = new int[MAX_QUEUE_SIZE];
    }

    boolean isEmpty() {
        return front == rear;
    }

    boolean isFull() {
        return front == (rear + 1) % MAX_QUEUE_SIZE;
    }

    void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }else {
            queue[rear] = x;
            rear = (rear + 1) % MAX_QUEUE_SIZE;
            print(true);
        }
    }

    int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }else {
            int ret = queue[front];
            queue[front] = 0;
            front = (front + 1) % MAX_QUEUE_SIZE;
            print(false);
            return ret;
        }
    }
    void print(boolean isEnqueue) {
        if(isEnqueue) System.out.println("--------Enqueue------- 아래");
        else System.out.println("--------Dequeue------- 아래");
        System.out.println("front => " + front);
        System.out.println("rear => " + rear);
        System.out.println("Queue array => " + Arrays.toString(queue));
    }
}
