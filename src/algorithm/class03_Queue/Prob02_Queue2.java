package algorithm.class03_Queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

public class Prob02_Queue2 {
    public static void main(String[] args) {
        Prob02_QueueUse q = new Prob02_QueueUse();
        Scanner input = new Scanner(System.in);

        System.out.println(q.queue.isEmpty());
    }
}

class Prob02_QueueUse {
    Queue<Integer> queue = new LinkedList<>();

    int size(){
        return queue.size();
    }

    void push(int x){
        queue.add(x);
    }

    int pop(){
        try {
            return queue.remove();
        } catch (NoSuchElementException e) {
            return -1;
        }
    }

    int front(){
        try {
            return queue.element();
        } catch (NoSuchElementException e) {
            return -1;
        }
    }

    int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }
}
