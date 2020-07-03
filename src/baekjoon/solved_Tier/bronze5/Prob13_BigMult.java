package baekjoon.solved_Tier.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob13_BigMult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger();

        BigInteger b = input.nextBigInteger();

        System.out.println(a.multiply(b));
    }
}
