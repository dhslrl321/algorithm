package baekjoon.solved_Tier.bronze.bronze1;

import java.util.Scanner;

public class Prob05_TwoDimsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int l = input.nextInt();

        while(l-- > 0) {
            int x1 = input.nextInt() - 1;
            int y1 = input.nextInt() - 1;
            int x2 = input.nextInt() - 1;
            int y2 = input.nextInt() - 1;

            System.out.println(solution(x1, y1, x2, y2, arr));
        }
    }

    static int solution(int x1, int y1, int x2, int y2, int[][] arr) {

        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == x1 && j == y1) {
                    flag = true;
                }

                if(flag) {
                    count += arr[i][j];
                }

                if(i == x2 && j == y2) {
                    flag = false;
                }
            }
        }
        return count;
    }
}
