package theory.queue;

import java.util.Arrays;

public class QueueByArray {
    public static void main(String[] args) {

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
        queue[head] = value;
        head++;
    }

    int dequeue() {
        if(tail == head) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return 0;
    }
}
