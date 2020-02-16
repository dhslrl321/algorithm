package algorithm.class03_Queue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
                int num = Integer.parseInt(arr[1]);
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

    void push(int x){
        queue[rear++] = x;
    }

    int pop(){
        if(empty() == 1) return -1;
        else return queue[front++];
    }

    int size(){
        return (rear - front) + 1;
    }

    int empty(){
        if(front >= rear) return 1;
        else return 0;
    }

    int front(){
        if(empty() == 1) return -1;
        else return queue[front];
    }
    int back(){
        if(empty() == 1) return -1;
        else return queue[rear];
    }
}
