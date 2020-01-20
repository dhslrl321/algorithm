package stage01_Basic_IO;

import java.util.Scanner;

public class Prob10_FourFoundamentalArithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        System.out.println((a + b) % c);
        System.out.println((a % c + b % b) % b);
        System.out.println((a * b) % c);
        System.out.println((a % c * b % c) % c);
    }

}
