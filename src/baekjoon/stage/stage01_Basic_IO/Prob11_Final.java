package baekjoon.stage.stage01_Basic_IO;

import java.util.Scanner;

public class Prob11_Final {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int top = input.nextInt();
        int bottom = input.nextInt();

        int bottom_100 = bottom / 100;
        int bottom_10 = bottom % 100 / 10;
        int bottom_1 = bottom - (bottom_100 * 100 + bottom_10 * 10);

        System.out.println(top * bottom_1);
        System.out.println(top * bottom_10);
        System.out.println(top * bottom_100);
        System.out.println((top * bottom_1) + (top * bottom_10 * 10) + (top * bottom_100 * 100));
    }
}
