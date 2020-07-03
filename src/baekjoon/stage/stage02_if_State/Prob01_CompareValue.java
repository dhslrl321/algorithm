package baekjoon.stage.stage02_if_State;

import java.util.Scanner;

public class Prob01_CompareValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left = input.nextInt();
        int right = input.nextInt();

        if (left < right) {
            System.out.println("<");
        } else if (left > right) {
            System.out.println(">");
        } else {
            System.out.println("==");
        }
    }
}
