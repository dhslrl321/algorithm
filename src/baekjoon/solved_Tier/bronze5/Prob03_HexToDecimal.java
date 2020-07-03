package baekjoon.solved_Tier.bronze5;

import java.util.Scanner;

public class Prob03_HexToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n = input.next();

        System.out.println(Integer.parseInt(n, 16));

    }
}
