package stage.stage09_Recursive;

import java.util.Scanner;

public class Prob03_Fibonacci2 {

    static long[] memo;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        memo = new long[91]; // 기억할 공간이 n 만큼이므로 n+1을 할당

        int n = input.nextInt();

        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n){

        if(n <= 1)  return n; //fibonacci(0) 와 fibonacci(1)은 각각 0과 1이 므로 바로 return

        else { // 그렇지 않을 경우

            if(memo[n] > 0) return memo[n]; //메모에 값이 저장된 경우

            else memo[n] = fibonacci(n - 1) + fibonacci(n - 2); // 값이 저장되지 않은 경우

            return memo[n];
        }
    }
}