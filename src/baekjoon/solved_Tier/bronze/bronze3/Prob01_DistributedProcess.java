package baekjoon.solved_Tier.bronze.bronze3;

import java.util.Scanner;

public class Prob01_DistributedProcess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while(t-- > 0) {
            int a = input.nextInt();
            int b = input.nextInt();
            int calc = 1;
            for (int i = 0; i < b; i++) {
                calc = calc * a;
                calc %= 10;
            }
            if (calc == 0) System.out.println(10);
            else System.out.println(calc);
        }
    }
}
