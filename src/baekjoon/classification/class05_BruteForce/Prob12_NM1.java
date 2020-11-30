package baekjoon.classification.class05_BruteForce;

import java.util.Scanner;

public class Prob12_NM1 {
    static boolean[] check = new boolean[10];
    static int[] ans = new int[10];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        go(0, n, m);
    }

    static void go(int index, int n, int m) {
        if(index == m) {
            for(int iter : ans) {
                if(iter != 0) System.out.print(iter + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 1; i <= n; i ++) {
            if(check[i]) continue;
            check[i] = true; ans[index] = i;
            go(index + 1, n, m);
            check[i] =false;
        }
    }
}