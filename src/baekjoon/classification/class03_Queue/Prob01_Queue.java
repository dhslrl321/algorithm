package baekjoon.classification.class03_Queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob01_Queue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        MyQueue queue = new MyQueue(n);
        ArrayList<Integer> ans = new ArrayList<>();
        while(n >= 0) {
            String stmt = input.nextLine();
            if(stmt.length() >= 6) {
                String[] arr = stmt.split(" ");
                StringTokenizer st = new StringTokenizer(stmt, " ");
                st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                queue.push(num);
            }
            else if(stmt.equals("pop")) ans.add(queue.pop());
            else if(stmt.equals("size")) ans.add(queue.size());
            else if(stmt.equals("empty")) ans.add(queue.empty());
            else if(stmt.equals("front")) ans.add(queue.front());
            else if(stmt.equals("back")) ans.add(queue.back());
            n--;
        }

        for(int res : ans) System.out.println(res);

    }
}

class MyQueue {
    private int max;
    private int rear;
    private int front;
    private int[] queue;

    public MyQueue(int capacity){
        max = capacity;
        rear = 0;
        front = 0;
        queue = new int[max];
    }

    // empty 비어있으면 1 차있으면 0
    int empty(){
        if (rear == front) return 1; // 비어있을 때
        return 0;
    }

    int full(){
        if(rear == max) return 1;
        else return 0;
    }

    void push(int x){
        if(full() == 1) throw new ArrayIndexOutOfBoundsException();
        else queue[rear++] = x;
    }

    int front(){
        if(empty() == 1) return -1;
        return queue[front];
    }
    int back(){
        if(empty() == 1) return -1;
        return queue[rear-1];
    }
    int pop(){
        if(empty() == 1) return -1;
        return queue[front++];
    }

    int size(){
        return rear - front;
    }

}
