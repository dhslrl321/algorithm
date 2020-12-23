package baekjoon.solved_Tier.bronze.bronze3;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob03_Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int t = input.nextInt();
            BigInteger num = BigInteger.ZERO;
            while(t-- > 0) {
                long inputNum = input.nextLong();
                num = num.add(BigInteger.valueOf(inputNum));
            }

            int result = num.compareTo(BigInteger.ZERO);
            if(result > 0) System.out.println("+");
            else if (result < 0) System.out.println("-");
            else System.out.println(0);
        }
    }
}
