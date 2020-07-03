package baekjoon.stage.stage01_Basic_IO;

import java.util.Scanner;

public class Prob09_AdivB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double left = input.nextInt();
        double right = input.nextInt();

        System.out.printf("%f", left / right);
    }
}
