package stage.stage11_DynamicPrograming;

import java.util.Scanner;

public class Prob01_Fibonacci2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        
        int[][] fibo = new int[41][2];
        
        fibo[0][0] = 1;
        fibo[1][1] = 1;

        for (int i = 2; i < 41; i++) {
            for (int j = 0; j < 2; j++) {
                fibo[i][j] = fibo[i-1][j] + fibo[i-2][j];
            }
        }

        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            System.out.println(fibo[a][0] + " " + fibo[a][1]);
        }

    }
}