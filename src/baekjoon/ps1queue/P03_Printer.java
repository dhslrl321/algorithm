package baekjoon.ps1queue;

import java.io.*;
import java.util.Arrays;

class P03_Printer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String[] nm = br.readLine().split(" ");

            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int answer = 0;
            String[] str = br.readLine().split((" "));
            MyQueue queue = new MyQueue(n);
            int[] priorities = new int[n];
            for (int i = 0; i < str.length; i++) {
                priorities[i] = Integer.parseInt(str[i]);
                queue.enqueue(priorities[i]);
            }

            Arrays.sort(priorities);

            for (int i = 0; i < priorities.length; i++) {
                int max = priorities[i];
                while(true) {
                    int data = queue.dequeue();
                    if(max != data) {
                        queue.enqueue(data);
                    }else {

                    }
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

class MyQueue {
    private int front;
    private int rear;
    private int MAX_SIZE;
    private int[] queue;

    MyQueue(int size) {
        front = 0;
        rear = 0;
        MAX_SIZE = size;
    }
    boolean isEmpty() {
        return front == rear;
    }

    boolean isFull() {
        return front == (rear + 1) % MAX_SIZE;
    }

    void enqueue(int x) {
        if(!isFull()) {
            queue[rear] = x;
            rear = (rear + 1) % MAX_SIZE;
        }
    }

    int dequeue() {
        if(!isEmpty()) {
            int ret = queue[front];
            front = (front + 1) % MAX_SIZE;
            return ret;
        }else return -1;
    }
}