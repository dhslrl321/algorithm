package datastructure.queue;

import java.util.Arrays;
import java.util.Scanner;

class Ds01_MyLinearQueue {
    public static void main(String[] args) {
        MyLinearQueue queue = new MyLinearQueue(4);
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Select Menu: 1: enqueue 2: dequeue 0: exit \n");
            int n = input.nextInt();
            if(n == 1) {
                System.out.print("enqueue num: ");
                int en = input.nextInt();
                System.out.println();
                queue.enqueue(en);
                queue.print();
            }else if(n == 2) {
                System.out.print("dequeue num: " + queue.dequeue());
                System.out.println();
                queue.print();
            }else if( n == 0) break;
            else System.out.println("Again");
        }

    }
}

class MyLinearQueue {
    private int[] queue;
    private int MAX_QUEUE_SIZE;
    private int front;
    private int rear;

    MyLinearQueue(int size) {
        front = 0;
        rear = 0;
        MAX_QUEUE_SIZE = size;
        queue = new int[MAX_QUEUE_SIZE];
    }

    boolean isEmpty() {
        return front == rear;
    }

    boolean isFull() {
        return rear == MAX_QUEUE_SIZE && front == 0;
    }

    void enqueue(int x) {
        if(isFull()) MyException();
        else queue[rear++] = x;
    }

    int dequeue() {
        if(isEmpty()) {
            MyException();
            return -1;
        }
        int ret = queue[front];
        queue[front++] = 0;
        shift();
        return ret;
    }

    void shift() {
        reverse(queue, 1, rear);
        reverse(queue, 0, rear);
        rear -= 1;
        front = 0;
    }
    void reverse(int[] arr, int start, int end) {
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    void print() {
        System.out.println("front 의 위치 : " + front);
        System.out.println("rear 의 위치 : " + rear);
        System.out.println(Arrays.toString(queue));
    }
    void MyException() {
        System.out.println("Exception detected");
    }
}
