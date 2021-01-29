package baekjoon.ps1queue;

import java.util.Scanner;

public class Prob01_Josephus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int acc = 0;
        int[] circularQueue = new int[n];
        System.out.print("<");
        for (int i = 0; i < circularQueue.length; i++) {
            circularQueue[i] = i + 1;
        }

        for (int i = 0; i < circularQueue.length; i++) {
            acc += k;
            int index = (acc) % circularQueue.length;
            if(index == 0) index = circularQueue.length;
            if(i == circularQueue.length - 1) System.out.print(circularQueue[index - 1] + ">");
            else System.out.print(circularQueue[index - 1] + ", ");
        }
    }
}
