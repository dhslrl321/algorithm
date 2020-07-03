package baekjoon.solved_Tier.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob02_HugeRich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger n = input.nextBigInteger();
        BigInteger m = input.nextBigInteger();

        BigInteger div = n.divide(m);
        BigInteger mod = n.remainder(m);
        System.out.println(div);
        System.out.println(mod);

    }
}
