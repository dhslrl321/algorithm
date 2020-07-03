package baekjoon.stage.stage11_DynamicPrograming;

import java.util.Scanner;

public class Prob01_FibonacciFunction {

    private static int countZ;
    private static int countO;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] n = new int[t];

        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }

        for (int value : n) {
            countZ = 0;
            countO = 0;

            fibonacci(value);
            System.out.println(countZ + " " + countO);
        }
    }

    private static long fibonacci(int n){
        if(n == 0) {
            countZ++;
            return n;
        } else if(n == 1) {
            countO++;
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
