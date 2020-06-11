package algorithm.class03_Queue;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Prob05_Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        /*push x*/

        /*pop()*/

        /*size*/

        /*empty*/

        /*front*/

        /*back*/

        bw.flush();
        bw.close();
    }
}

class My_Queue {
    Queue<Integer> queue;

    public My_Queue(LinkedList<Integer> list){
        queue = list;
    }

    void push(int x){
        queue.add(x);
    }

    int pop(){
        if(queue.isEmpty()) return -1;
        else return queue.poll();
    }

    int size(){
        return queue.size();
    }

    int empty(){
        if(queue.isEmpty()) return 1;
        else return 0;
    }

    int front(){
        if(queue.isEmpty()) return -1;
        else return queue.peek();
    }

    int back(){
        if(queue.isEmpty()) return -1;
        else {
            int value = 0;
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.poll();
            }
            value = queue.peek();
            return value;
        }
    }

}
