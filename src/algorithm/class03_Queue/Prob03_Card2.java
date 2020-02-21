package algorithm.class03_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prob03_Card2 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        boolean toggleFlag = false;
        int n = input.nextInt();
        int count = n;
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while(q.size() > 1){
            System.out.println(q);
            if(!toggleFlag){
                q.poll();
                toggleFlag = true;
            }else{
                q.add(q.poll());
                toggleFlag = false;
            }

            count--;
        }

        System.out.println(q.peek());
    }
}
