package stage.stage11_DynamicPrograming;

import java.util.Scanner;

public class Prob01_Fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();

        int[] n = new int[t];
        Prob01_Function[] functions = new Prob01_Function[t];

        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
            functions[i] = new Prob01_Function();
            functions[i].fibonacci(n[i]);
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println(functions[i].countZ + " " + functions[i].countO);
        }

    }
}

class Prob01_Function {
    long[] memo = new long[41];

    int countZ;
    int countO;

    long fibonacci(int n){
        if(n == 0) {
            countZ++;
            return 0;
        }else if(n == 1) {
            countO++;
            return 1;
        }else {
            if(memo[n] > 0) return memo[n];
            else memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return memo[n];
        }
    }

}
