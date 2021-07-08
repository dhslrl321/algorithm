package solved.class2;

import java.io.*;
import java.util.Arrays;

public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque deque = new Deque(10001);

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0) {
            String[] inputs = br.readLine().split(" ");

            if(inputs.length == 1) {
                String operator = inputs[0];
                switch(operator) {
                    case "front": {
                        bw.write(deque.getFrontData() + "\n");
                        break;
                    }
                    case "back": {
                        bw.write(deque.getRearData() + "\n");
                        break;
                    }
                    case "size" : {
                        bw.write(deque.getDeQueSize() + "\n");
                        break;
                    }
                    case "empty": {
                        bw.write(deque.isEmpty() + "\n");
                        break;
                    }
                    case "pop_front": {
                        bw.write(deque.popFront() + "\n");
                        break;
                    }
                    case "pop_back": {
                        bw.write(deque.popRear() + "\n");
                        break;
                    }
                    default:
                        break;
                }
            }else {
                String operator = inputs[0];
                int operand = Integer.parseInt(inputs[1]);

                switch(operator) {
                    case "push_front": {
                        deque.pushFront(operand);
                        break;
                    }
                    case "push_back": {
                        deque.pushRear(operand);
                        break;
                    }
                    default:
                        break;
                }
            }
        }

        System.out.println(Arrays.toString(deque.circularQueue));

        bw.flush();
        bw.close();
    }
}

class Deque {

    private int MAX_SIZE;
    private int front;
    private int rear;
     int[] circularQueue;

    Deque(int size) {
        front = 0;
        rear = 0;
        MAX_SIZE = size;
        circularQueue = new int[MAX_SIZE];
    }

    void pushFront(int x) {
        circularQueue[front] = x;
        front = (front - 1 + MAX_SIZE) % MAX_SIZE;
    }

    void pushRear(int x) {
        rear = (rear + 1) % MAX_SIZE;
        circularQueue[rear] = x;
    }

    int popFront() {
        if(front == rear) return -1;

        front = (front + 1) % MAX_SIZE;

        return circularQueue[front];
    }

    int popRear() {
        if(front == rear) return -1;
        int data = circularQueue[rear];
        rear = (rear - 1 + MAX_SIZE) % MAX_SIZE;

        return data;
    }

    int getDeQueSize() {
        return (rear-front + MAX_SIZE) % MAX_SIZE;
    }

    int isEmpty() {
        if(front == rear) return 1;
        else return 0;
    }

    int getFrontData() {
        if(front == rear) return -1;
        return circularQueue[(front + 1) % MAX_SIZE];
    }

    int getRearData() {
        if(front == rear) return -1;
        return circularQueue[rear];
    }
}