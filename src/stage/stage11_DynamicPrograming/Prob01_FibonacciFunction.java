package stage.stage11_DynamicPrograming;

import java.util.Scanner;

public class Prob01_FibonacciFunction {

    private static int countZ;
    private static int countO;

    private static long[] memo;

    public static void main(String[] args) {

        memo = new long[41];

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
            if(memo[n] > 0) return memo[n];
            else memo[n] = fibonacci(n-1) + fibonacci(n-2);
            return memo[n];
        }
    }
}
