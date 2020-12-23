package baekjoon.solved_Tier.bronze.bronze5;

import java.util.Scanner;

public class Prob14_ImHappy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        int count = 0;
        int[][] seat = new int[30000][30000];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seat[i][j] = count;
                if(count == k) System.out.println(i + " " + j);
                count++;
            }
        }

    }
}
