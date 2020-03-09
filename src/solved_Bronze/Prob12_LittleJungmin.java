package solved_Bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class Prob12_LittleJungmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        BigInteger c = input.nextBigInteger();

        System.out.println(a.add(b.add(c)));
    }
}
