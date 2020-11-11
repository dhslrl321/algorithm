package baekjoon.solved_Tier.bronze3;

import java.util.Scanner;

public class Prob04_Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int yCount = 0;
        int mCount = 0;
        while(n-- > 0) {
            int time = input.nextInt();

            yCount += 10 * (time / 30 + 1);
            mCount += 15 * (time / 60 + 1);
        }

        if(yCount == mCount) {
            System.out.printf("Y M %d", yCount);
        }else {
            if(yCount > mCount) System.out.printf("M %d", mCount);
            else System.out.printf("Y %d", yCount);
        }
    }
}
