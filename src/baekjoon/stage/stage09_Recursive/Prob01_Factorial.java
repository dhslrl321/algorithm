package baekjoon.stage.stage09_Recursive;

import java.util.Scanner;

public class Prob01_Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int ans = factorial(n);

        System.out.println(ans);

    }

    static int factorial(int num){
        if(num > 0) return num * factorial(num-1);
        else return 1;
    }
}

