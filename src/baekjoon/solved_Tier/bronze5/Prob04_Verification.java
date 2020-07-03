package baekjoon.solved_Tier.bronze5;

import java.util.Scanner;

public class Prob04_Verification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            a[i] = (int) Math.pow(a[i], 2);
        }

        int sum = a[0] + a[1] + a[2] + a[3] + a[4];

        System.out.println(sum % 10);
    }
}
