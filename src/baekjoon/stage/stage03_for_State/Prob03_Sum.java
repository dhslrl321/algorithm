package baekjoon.stage.stage03_for_State;

import java.util.Scanner;

public class Prob03_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum + n);
    }
}
