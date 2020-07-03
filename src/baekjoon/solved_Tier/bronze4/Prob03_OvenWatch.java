package baekjoon.solved_Tier.bronze4;

import java.util.Scanner;

public class Prob03_OvenWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        b += c;

        a += b / 60;
        System.out.print(a + " " + b);
    }
}
