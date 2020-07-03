package baekjoon.classification.class05_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Prob03_BigMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] weight = new int[n];
        int[] height = new int[n];
        int[] rank = new int[n];

        Arrays.fill(rank, 1);

        for (int i = 0; i < n; i++) {
            weight[i] = input.nextInt();
            height[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(weight[i] < weight[j] && height[i] < height[j]) {
                    cnt++;
                    rank[i] = cnt;
                }
            }
        }

        for(int iter : rank) System.out.println(iter);
    }
}
