package baekjoon.solved_Tier.bronze.bronze5;

import java.util.Scanner;

public class Prob05_AfterTheParty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int p = input.nextInt();
        int num = l * p;
        int[] participant = new int[5];

        for (int i = 0; i < participant.length; i++) {
            participant[i] = input.nextInt();
        }

        for (int value : participant) {
            System.out.print(value - num + " ");
        }
    }
}
