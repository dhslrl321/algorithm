package theory.queue;

import java.util.Arrays;

public class QueueByArray {
    public static void main(String[] args) {
        My_QueueByArray queue = new My_QueueByArray();

        queue.enqueue(10);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(Arrays.toString(queue.queue));
    }
}

class My_QueueByArray {
    int[] queue = new int[8];
    int head = 0;
    int tail = 0;

    void enqueue(int value) {
        if(tail == 7) {
            System.out.println("Queue is Full");
        }
        queue[tail] = value;
        tail++;
    }

    int dequeue() {
        if(head == tail) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int ret = queue[head];
        for(int i = 0; i < 7; i++){
            queue[i] = queue[i+1];
        }

        tail--;
        return ret;
    }
}
