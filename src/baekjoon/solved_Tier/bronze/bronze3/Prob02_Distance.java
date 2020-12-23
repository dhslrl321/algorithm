package baekjoon.solved_Tier.bronze.bronze3;

import java.util.Scanner;

public class Prob02_Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int w = input.nextInt();
        int h = input.nextInt();

        int answer = Math.min(getMinimum(x, w), getMinimum(y, h));
        System.out.println(answer);
    }

    static int getMinimum(int a, int b) {
        return Math.min(Math.abs(a - b), a);
    }
}
