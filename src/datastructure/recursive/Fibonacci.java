package datastructure.recursive;

public class Fibonacci {
    private static long[] memo = new long[51];
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibo(50));
    }

    private static long fibo(int n) {
        if(n == 1 || n == 2) return 1;
        if(memo[n] > 0) return memo[n];
        return memo[n] = fibo(n - 2) + fibo(n - 1);
    }
}
