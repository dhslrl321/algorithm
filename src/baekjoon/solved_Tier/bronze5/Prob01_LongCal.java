package baekjoon.solved_Tier.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob01_LongCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
    }
}
