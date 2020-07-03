package baekjoon.solved_Tier.bronze4;

import java.util.Scanner;

public class Prob01_Domain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int sum = Math.abs(n-m);

        System.out.println(sum);

    }
}
