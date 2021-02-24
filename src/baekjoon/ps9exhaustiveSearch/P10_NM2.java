package baekjoon.ps9exhaustiveSearch;

import java.util.Arrays;
import java.util.Scanner;

public class P10_NM2 {

    static boolean[] check = new boolean[10];
    static int[] result = new int[8];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        dfs(0, n, m, 0);
    }

    private static void dfs(int index, int n, int m, int before) {
        if(index == m) {
            for (int i = 0; i < 8; i++) {
                if(result[i] != 0) {
                    System.out.print(result[i] + " ");
                }
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(check[i] || i < before) continue; // 유망성 판단 조건 1, 2
            check[i] = true;
            result[index] = i;
            dfs(index + 1, n, m, result[index]);
            check[i] = false;
        }
    }
}
